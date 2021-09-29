package practice;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Practice1 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public Practice1() {
		this.setTitle("꺾은선 그래프");
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
			
			// 꺾은선 그래프
			g.drawString("분기별 매출그래프", 210, 30);
			int zeroX = 50; // 원점 x좌표
			int zeroY = 400; // 원점 y좌표
			g.drawLine(50, 50, zeroX, zeroY); // y축
			g.drawLine(zeroX, zeroY, 400, zeroY); // x축
			int xGap = 80; // x좌표간 간격
			int money = 50; // 매출액 기준
			
			g.setColor(Color.RED);
			g.drawLine(zeroX, zeroY, zeroX+xGap, zeroY-200);
			g.setColor(Color.BLACK);
			g.drawString("1/4분기", zeroX+xGap - 10, zeroY + 20);
			g.setColor(Color.RED);
			g.drawLine(zeroX+xGap, zeroY-200, zeroX+xGap*2, zeroY-100);
			g.setColor(Color.BLACK);
			g.drawString("2/4분기", zeroX+xGap*2 - 10, zeroY + 20);
			g.setColor(Color.RED);
			g.drawLine(zeroX+xGap*2, zeroY-100, zeroX+xGap*3, zeroY-300);
			g.setColor(Color.BLACK);
			g.drawString("3/4분기", zeroX+xGap*3 - 10, zeroY + 20);
			g.setColor(Color.RED);
			g.drawLine(zeroX+xGap*3, zeroY-300, zeroX+xGap*4, zeroY-250);
			g.setColor(Color.BLACK);
			g.drawString("4/4분기", zeroX+xGap*4 - 10, zeroY + 20);
			
			
			
			
			
		}
		
	}

	public static void main(String[] args) {
//		1. 꺾은선그래프 완성하기
//		=> x, y축, 분기, 매출액 표시.
		new Practice1();
		

	}

}
