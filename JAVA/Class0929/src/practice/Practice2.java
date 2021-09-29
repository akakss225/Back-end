package practice;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Practice2 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public Practice2() {
		this.setTitle("파이차트 그리기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setSize(500, 500);
		this.setVisible(true);
	}
	class MyPanel extends JPanel{

		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			int total = 850;
			int remain = 360-(360*100/total+360*200/total+360*300/total+360*250/total);
			g.setColor(Color.GRAY);
			g.fillArc(50, 50, 300, 300, 0, 360*200/total);
			g.setColor(Color.BLUE);
			g.fillArc(50, 50, 300, 300, 360*200/total, 360*100/total);
			g.setColor(Color.ORANGE);
			g.fillArc(50, 50, 300, 300, 360*100/total+360*200/total, 360*300/total);
			g.setColor(Color.GREEN);
			g.fillArc(50, 50, 300, 300, 360*100/total+360*200/total+360*300/total, 360*250/total+remain);
		}
		
	}

	public static void main(String[] args) {
//		2. 파이차트 완성하기
//		=> 분기, 매출액 표시

		new Practice2();

	}

}
