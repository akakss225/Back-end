package practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Practice2 extends JFrame {

	private ImageIcon[] images = {
			new ImageIcon("/Users/sumin/Desktop/Back-end/명품JAVA프로그래밍(개정4판)_학습자용[20210811]/예제 및 그림 소스/11장/chap11-ex07/images/apple.jpg"),
			new ImageIcon("/Users/sumin/Desktop/Back-end/명품JAVA프로그래밍(개정4판)_학습자용[20210811]/예제 및 그림 소스/11장/chap11-ex07/images/pear.jpg"),
			new ImageIcon("/Users/sumin/Desktop/Back-end/명품JAVA프로그래밍(개정4판)_학습자용[20210811]/예제 및 그림 소스/11장/chap11-ex07/images/cherry.jpg")};
	private JLabel imageLabel = new JLabel();
	private JButton previous = new JButton("이전");
	private JButton next = new JButton("다음");
	private int index = 0;
	
	public Practice2() {
		this.setTitle("Gallery Program");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.GRAY);
		buttonPanel.add(previous);
		buttonPanel.add(next);
		imageLabel.setIcon(images[index]);
		c.add(buttonPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		next.addActionListener(new MyNextActionListener());
		previous.addActionListener(new MyPreviousActionListener());
		
		
		this.setSize(250, 200);
		this.setVisible(true);
	}
	class MyNextActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			index += 1;
			if(index > 2) {
				index = 0;
			}
			imageLabel.setIcon(images[index]);
			
		}
		
	}
	class MyPreviousActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			index -= 1;
			if(index < 0) {
				index = 2;
			}
			imageLabel.setIcon(images[index]);
		}
		
	}

	public static void main(String[] args) {
		new Practice2();
		
		
		

	}

}