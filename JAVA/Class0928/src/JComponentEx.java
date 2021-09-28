import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class JComponentEx extends JFrame {
	
	public JComponentEx() {
		super("JComponent의 공통 메소드 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton(" Disabled Button");
		JButton b3 = new JButton("getX()/ getY()");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
