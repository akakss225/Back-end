package practice;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Practice2 extends JFrame{
	JLabel la = new JLabel("지금은 뭐리고 인사하는게 좋을까요?");
	
	public Practice2() {
		this.setTitle("시간별 인사");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		
		c.add(la);
		c.add(btn);
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	private class MyActionListener implements ActionListener{
	
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			Calendar now = Calendar.getInstance();
			int hour = now.get(Calendar.HOUR_OF_DAY);
			if(hour < 12) {
				la.setText("Good Morning");
			}
			else if(hour < 18) {
				la.setText("Good Afternoon");
			}
			else {
				la.setText("Good Evening");
			}
			
		}
	
	}
	

	public static void main(String[] args) {
//		2. 현재 시간을 구해서 
//		12시 미만 : Good Morning
//		12~18 : Good Afternoon
//		18이후 : Good Evening
//
//		메시지를 Label에 출력하시오.
		
		new Practice2();

	}

}
