import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread2 extends Thread{
	private JLabel timerLabel;
	
	public TimerThread2(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	public void run() {
		int n = 0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class TimerThreadEx extends JFrame {
	public TimerThreadEx() {
		this.setTitle("Thread를 상속받은 타이머스레드 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		TimerThread2 th = new TimerThread2(timerLabel);
		
		this.setSize(300,170);
		this.setVisible(true);
		th.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TimerThreadEx();
	}

}
