import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Class6 extends JFrame implements ActionListener {
	
	public Class6() {
		this.setTitle("네번째 방법");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		
		btn.addActionListener(this);
		c.add(btn);
		
		this.setSize(350, 150);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Class6();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action")) {
			b.setText("액션");
		}
		else {
			b.setText("Action");
		}
	}
}
