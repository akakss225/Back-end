import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyLabel extends JLabel{
	int barSize = 0;
	int maxBarSize;
	
	MyLabel(int maxBarSize){
		this.maxBarSize = maxBarSize;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		int width = (int)(((double)(this.getWidth()))/maxBarSize*barSize);
		if(width == 0) {return;
		}
		g.fillRect(0, 0, width, this.getHeight());
	}
	synchronized void fill() {
		if(barSize == maxBarSize) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				return;
			}
			barSize++;
			repaint();
			notify();
		}
	}
	synchronized void consume() {
		if(barSize == 0) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				return;
			}
			barSize--;
			repaint();
			notify();
		}
	}
	
}


class ConsumerThread extends Thread{
	MyLabel bar;
	
	ConsumerThread(MyLabel bar){
		this.bar = bar;
	}
	public void run() {
		while(true) {
			try {
				sleep(200);
				bar.consume();
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class TabAndThreadEx extends JFrame {
	
	MyLabel bar = new MyLabel(100);
	TabAndThreadEx(String title){
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		bar.setBackground(Color.orange);
		bar.setOpaque(true);
		bar.setLocation(20, 50);
		bar.setSize(300, 20);
		c.add(bar);
		
		c.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
				bar.fill();	
			} 
			@Override
			public void keyReleased(KeyEvent e) {}
			
		});
		this.setSize(350, 200);
		this.setVisible(true);
		
		c.requestFocus();
		ConsumerThread th = new ConsumerThread(bar);
		th.start();
		
		
	}
	

	public static void main(String[] args) {
		// 키 빨리누르기 게임
		new TabAndThreadEx("아무키나 빨리 눌러 바 채우기");

	}

}
