import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerEx2 extends JFrame {
	
	private JLabel la = new JLabel("Hello");
	
	public MouseListenerEx2(){
		this.setTitle("Mouse 이벤트 예제2");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addMouseListener(new MyMouseAdapter());
		
		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
		
		this.setSize(250, 250);
		this.setVisible(true);	
	}
	class MyMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
					
		}
	}
	
	
	public static void main(String[] args) {
		// MouseListener 를 Adaptor를 사용해서 구현
		
		new MouseListenerEx2();

	}

}
