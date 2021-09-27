import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Class4 extends JFrame {
	
	public Class4() {
		this.setTitle("이벤트처리");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		JButton btn2 = new JButton("Action2");
		btn2.addActionListener(new MyActionListener());
		c.add(btn2);
		
		this.setSize(350,250);
		this.setVisible(true);		
	}
	

	private class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource(); // 이벤트가 발생한 컴포넌트(버튼)를 구한다.
			if(b.getText().equals("Action")) {
				b.setText("액션");
			}
			else if(b.getText().equals("Action2")) {
				b.setText("액션2");
			}
			
		Class4.this.setTitle(b.getText()); // 현재 있는 위치는 MyActionListener 클래스이기 때문에, Class4.this로 위치를 이동시킴.
			
		}
		
	}
	public static void main(String[] args) {
		// 내부 클래스로 작성
		Class4 c = new Class4();
	}

}
