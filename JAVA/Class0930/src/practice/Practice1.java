package practice;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread extends Thread{
	JLabel timerLabel;
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	@Override
	public void run() {
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int min = now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);
		while(true) {
			timerLabel.setText(hour + ":" + min + ":" + sec);
			sec++;
			if(sec == 60) {
				sec = 0;
				min++;
			}
			if(min == 60) {
				min = 0;
				hour++;
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
	
	
}

public class Practice1 extends JFrame{
	
	public Practice1() {
		this.setTitle("디지털 시계");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel, BorderLayout.CENTER);
		TimerThread th = new TimerThread(timerLabel);
		
		this.setSize(500,200);
		this.setVisible(true);
		th.start();
		
	}

	public static void main(String[] args) {
//		1. 쓰레드를 사용해서 디지털시계를 작성하시오. 
//		=> JLabel에 시간 출력
		
		new Practice1();
	}

}
