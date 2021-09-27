package practice;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Practice1 extends JFrame {
	
	public Practice1() {
		this.setTitle("연습문제 1 번");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel(" 이름"));
		c.add(new JTextField(20));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(20));
		c.add(new JLabel(" 학과"));
		c.add(new JTextField(20));
		c.add(new JLabel(" 과목"));
		c.add(new JTextField(20));
		
		this.setSize(300, 200);
		this.setVisible(true);
	}


	public static void main(String[] args) {
		// 1.예제9-5 화면을 FlowLayout을 사용하여 작성하시오.
		
		new Practice1();

	}

}
