import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicSample extends JFrame {
	private MyPanel panel = new MyPanel(); // 패널이 만들어질 때 paintComponent메소드가 자동 호출됨.
	public GraphicSample() {
		this.setTitle("Chart");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setSize(1200, 1000);
		this.setVisible(true);
	}
	class MyPanel extends JPanel{

		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			
			g.drawString("분기별 매출", 300, 50);
			
			// 막대 그래프
			int vGap = 10;
			int height = 20;
			g.fillRect(100, 100, 200, height);
			g.drawString("1/4분기", 50, 115);
			g.fillRect(100, 100 + height + vGap, 300, height);
			g.drawString("2/4분기", 50, 115 + height + vGap);
			g.fillRect(100, 100 + (height + vGap)*2, 450, height);
			g.drawString("3/4분기", 50, 115 + (height + vGap)*2);
			g.fillRect(100, 100 + (height + vGap)*3, 250, height);
			g.drawString("4/4분기", 50, 115 + (height + vGap)*3);
			
			// 꺾은선 그래프
			int x = 100;
			int y = 800;
			g.setColor(Color.red);
			g.drawLine(x, y, 2*x, y-200);
			g.drawLine(x*2, y-200, x*3, y-300);
			g.drawLine(x*3, y-300, x*4, y-450);
			g.drawLine(x*4, y-450, x*5, y-250);
			
			// 파이 차트
			int total = 1200;
			g.fillArc(600, 250, 500, 500, 0, 360*200/total);
			g.setColor(Color.BLUE);
			g.fillArc(600, 250, 500, 500, 360*200/total, 360*300/total);
			g.setColor(Color.ORANGE);
			g.fillArc(600, 250, 500, 500, 360*300/total+360*200/total, 360*450/total);
			g.setColor(Color.GREEN);
			g.fillArc(600, 250, 500, 500, 360*300/total+360*200/total+360*450/total, 360*250/total);
		}
		
	}

	public static void main(String[] args) {
		new GraphicSample();

	}

}
