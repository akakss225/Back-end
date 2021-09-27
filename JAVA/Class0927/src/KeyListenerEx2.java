import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyListenerEx2 extends JFrame {
	private final int FLYING_UNIT = 10; // 증감값 10pixel
	private JLabel la = new JLabel("Hello");
	public KeyListenerEx2() {
		this.setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener2());
		
		la.setLocation(50, 50);
		la.setSize(100, 20);
		c.add(la);
		
		this.setSize(300, 300);
		this.setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component com = (Component)e.getSource();
				com.setFocusable(true);
				com.requestFocus();
			}
		});
	}
	class MyKeyListener2 extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			switch(keyCode) {
				case KeyEvent.VK_UP:
					la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
					break;
				case KeyEvent.VK_DOWN:
					la.setLocation(la.getX(), la.getY()+FLYING_UNIT);
					break;
				case KeyEvent.VK_LEFT:
					la.setLocation(la.getX()- FLYING_UNIT, la.getY());
					break;
				case KeyEvent.VK_RIGHT:
					la.setLocation(la.getX()+ FLYING_UNIT, la.getY());
					break;
			}
		}
	}

	public static void main(String[] args) {
		// 방향키로 텍스트 이동시키기
		new KeyListenerEx2();
		
		

	}

}
