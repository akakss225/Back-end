import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Class5 extends JFrame {
	public Class5() {
		this.setTitle("Action 이벤트 리스너 작성");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		
		btn.addActionListener(new ActionListener() {
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
		});
		
		this.setSize(350, 150);
		this.setVisible(true);
			
		}
	
	
	
	public static void main(String[] args) {
		// 익명 클래스
		
		new Class5();
	}

}
