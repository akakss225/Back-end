import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class KeyListenerEx extends JFrame {
	
	private JLabel[] keyMessage;
	
	public KeyListenerEx() {
		this.setTitle("KeyPress 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel[3];
		
		keyMessage[0] = new JLabel(" getKeyCode() ");
		keyMessage[1] = new JLabel(" getKeyChar() ");
		keyMessage[2] = new JLabel(" getKeyText() ");
		
		for(int i = 0; i < keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true); // 컴포넌트의 바탕색이 보이도록 하기위해 컴포넌트를 불투명하게 지정
			keyMessage[i].setBackground(Color.YELLOW);	
		}
		this.setSize(300, 150);
		this.setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPeressd(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(e.getKeyText(keyCode));
		}
	}

	public static void main(String[] args) {
		new KeyListenerEx();

	}

}
