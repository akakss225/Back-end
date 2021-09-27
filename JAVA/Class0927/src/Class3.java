import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Class3 extends JFrame {
	public Class3() {
		this.setTitle("Action 이벤트 리스너 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		this.setSize(350, 150);
		this.setVisible(true);
	}

class MyActionListener implements ActionListener{

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

	public static void main(String[] args) {
		// 독립 클래스로 작성
		
		Class3 c = new Class3();

	}

}
