import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickeringLabel extends JLabel implements Runnable{ // 다중 상속이 가능한 Runnable이 좀더 유용함
	private long delay;
	public FlickeringLabel(String text, long delay) {
		super(text);
		this.delay = delay;
		setOpaque(true);
		Thread th = new Thread(this);
		th.start();
	}
	@Override
	public void run() {
		int n = 0;
		while(true) {
			if(n == 0) {
				setBackground(Color.YELLOW);
			}
			else {
				setBackground(Color.green);
			}
			if(n == 0){
				n = 1;
			}
			else {
				n = 0;
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

public class FlickeringLabelEx extends JFrame {
	
	public FlickeringLabelEx() {
		this.setTitle("FlickeringLabelEx");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		FlickeringLabel fLabel = new FlickeringLabel("깜박", 500);
		JLabel label = new JLabel("안깜박");
		FlickeringLabel fLabel2 = new FlickeringLabel("깜박", 300);
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		
		this.setSize(300, 150);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlickeringLabelEx();
	}

}
