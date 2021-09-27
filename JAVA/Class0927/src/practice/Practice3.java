package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

public class Practice3 extends JFrame {
	
	static JLabel la = new JLabel("What time is it now?");
	
	public Practice3() {
		this.setTitle("Get Time UI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,1,10,0));
		
		JButton btn1 = new JButton("외부클래스");
		JButton btn2 = new JButton("내부클래스");
		JButton btn3 = new JButton("익명클래스");
		
		btn1.addActionListener(new IndepActionListener());
		btn2.addActionListener(new InnerActionListener());
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Calendar now3 = Calendar.getInstance();
				int year = now3.get(Calendar.YEAR);
				int mon = now3.get(Calendar.MONDAY) + 1;
				int day = now3.get(Calendar.DAY_OF_MONTH);
				int hour = now3.get(Calendar.HOUR_OF_DAY);
				int min = now3.get(Calendar.MINUTE);
				int sec = now3.get(Calendar.SECOND);
				
				JButton b3 = (JButton)e.getSource();
				if(la.getText().equals("What time is it now?")) {
					la.setText(year + "-" + mon + "-" + day + "-" + hour + "-" + min + "-" + sec);
				}
				else {
					la.setText("What time is it now?");
				}
			}
		});
		c.add(la);
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		
		this.setSize(400, 400);
		this.setVisible(true);
		
	}
	private class InnerActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Calendar now2 = Calendar.getInstance();
			int year = now2.get(Calendar.YEAR);
			int mon = now2.get(Calendar.MONDAY) + 1;
			int day = now2.get(Calendar.DAY_OF_MONTH);
			int hour = now2.get(Calendar.HOUR_OF_DAY);
			int min = now2.get(Calendar.MINUTE);
			int sec = now2.get(Calendar.SECOND);
			
			JButton b2 = (JButton)e.getSource();
			if(la.getText().equals("What time is it now?")) {
				la.setText(year + "-" + mon + "-" + day + "-" + hour + "-" + min + "-" + sec);
			}
			else {
				la.setText("What time is it now?");
			}
			
		}
		
	}

	public static void main(String[] args) {
//		3. 화면에 현재 시간을 출력하는 Label을 만들고,
//		각 버튼을 클릭하면
//
//		버튼1 - 외부클래스
//		버튼2 - 내부클래스
//		버튼3 - 익명클래스
//		3가지 방법으로 현재 날짜/시간이 출력되게 하시오.
		
		new Practice3();

	}

}
class IndepActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Calendar now1 = Calendar.getInstance();
		int year = now1.get(Calendar.YEAR);
		int mon = now1.get(Calendar.MONDAY) + 1;
		int day = now1.get(Calendar.DAY_OF_MONTH);
		int hour = now1.get(Calendar.HOUR_OF_DAY);
		int min = now1.get(Calendar.MINUTE);
		int sec = now1.get(Calendar.SECOND);
		
		JButton b1 = (JButton)e.getSource();
		if(Practice3.la.getText().equals("What time is it now?")) {
			Practice3.la.setText(year + "-" + mon + "-" + day + "-" + hour + "-" + min + "-" + sec);
		}
		else {
			Practice3.la.setText("What time is it now?");
		}
		
	}
	
}
