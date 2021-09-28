import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerAllEx extends JFrame {
	private JLabel la = new JLabel("No Mouse Event");
	
	public MouseListenerAllEx() {
		this.setTitle("MouseListener와 MouseMotionListener 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		c.add(la);
		
		this.setSize(300,200);
		this.setVisible(true);
		
		
	}
	class MyMouseListener implements MouseListener, MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("MouseDragged(" + e.getX() + ", " + e.getY());
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("MouseMoved(" + e.getX() + ", " + e.getY());
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {}

		@Override
		public void mousePressed(MouseEvent e) {
			la.setText("MousePreassed(" + e.getX() + ", " + e.getY());
		}

		@Override
		public void mouseReleased(MouseEvent e) {}

		@Override
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
			
		}
		
	}
		

	public static void main(String[] args) {
		new MouseListenerAllEx();
		

	}

}
