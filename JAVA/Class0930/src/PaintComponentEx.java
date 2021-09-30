import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PaintComponentEx extends JFrame {
	public PaintComponentEx() {
		this.setTitle("새로운 버튼 만들기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyButton b = new MyButton("New Button");
		b.setOpaque(true);
		b.setBackground(Color.cyan);
		c.add(b);
		this.setSize(250 , 200);
		this.setVisible(true);
		
		
	}
	class MyButton extends JButton{
		MyButton(String s){
			super(s);
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red);
			g.drawOval(0, 0, this.getWidth() - 1, this.getHeight()-1); // 버튼 모양 커스터마이징
		}

	}
	
	public static void main(String[] args) {
		// 버튼을 상속받아 새로운 버튼 생성
		new PaintComponentEx();
	}

}
