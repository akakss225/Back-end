import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxItemEventEx extends JFrame {
	private JCheckBox[] fruits = new JCheckBox[3];
	private String[] name = {"사과", "배", "체리"};
	private JLabel sumLabel;
	
	public CheckBoxItemEventEx() {
		this.setTitle("체크박스 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyItemListener il = new MyItemListener();
		
		for(int i = 0; i < fruits.length; i++) {
			fruits[i] = new JCheckBox(name[i]);
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]);
			fruits[i].addItemListener(il);
					
		}
		sumLabel = new JLabel("현재 0 원 입니다.");
		c.add(sumLabel);
		
		this.setSize(250, 200);
		this.setVisible(true);
		
	}
	class MyItemListener implements ItemListener{
		private int sum = 0;
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == fruits[0]) {
					sum += 100;
				}
				else if(e.getItem() == fruits[1]) {
					sum += 500;
				}
				else {
					sum += 20000;
				}
			}
			else {
				if(e.getItem() == fruits[0]) {
					sum -= 100;
				}
				else if(e.getItem() == fruits[1]) {
					sum -= 500;
				}
				else {
					sum -= 20000;
				}
			}
			sumLabel.setText("현재 " + sum + "원 입니다.");
			
		}
		
	}

	public static void main(String[] args) {
		new CheckBoxItemEventEx();

	}

}
