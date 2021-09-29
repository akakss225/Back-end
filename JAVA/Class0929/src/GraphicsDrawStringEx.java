import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawStringEx extends JFrame {
	
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawStringEx() {
		this.setTitle("Draw String 사용예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setSize(250, 200);
		this.setVisible(true);
		
	}
	class MyPanel extends JPanel{

		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.drawString("자바는 재밌다~~", 30, 30);
			g.drawString("얼마나? 하늘만큼 땅만큼!", 60, 60);
			
		}
		
	}

	public static void main(String[] args) {
		new GraphicsDrawStringEx();

	}

}
