import java.awt.Color;
import java.awt.Graphics;

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
		int width = (int)(((double)(this.getWidth()))/maxBarSize*barSize);dd
		
	}
	
}

class ConsumerThread extends Thread{
	MyLabel bar;
	
	ConsumerThread(MyLabel bar){
		this.bar = bar;
	}
	public void run() {
		
	}
}

public class TabAndThreadEx {

	public static void main(String[] args) {
		// 키 빨리누르기 게임

	}

}
