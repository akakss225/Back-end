import javax.swing.*;
import java.awt.*;

public class paintJPanelEx extends JFrame { // JFrame의 기본 Layout값은 BorderLayout이다.
	
	private MyPanel panel = new MyPanel();
	public paintJPanelEx() {
		this.setTitle("JPanel의 paintComponent() 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel); // 기본값은 Center
		this.setSize(250,220);
		this.setVisible(true);
	}
	class MyPanel extends JPanel{ 
		public void paintComponent(Graphics g) { // 일종의 붓같은 느낌
			super.paintComponent(g);
			g.setColor(Color.BLUE); 
			g.drawRect(10, 10, 50, 50); 
			g.drawRect(50, 50, 50, 50); 
			g.setColor(Color.MAGENTA);
			g.drawRect(90, 90, 50, 50); 
			
		}
	}

	public static void main(String[] args) {
		new paintJPanelEx();

	}

}
