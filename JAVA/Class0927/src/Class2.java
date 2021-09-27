import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

class Grid extends JFrame{
	public Grid() {
		this.setTitle("GridLayout Example");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5);
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JLabel(" 이름"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학과"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 과목"));
		c.add(new JTextField(""));
		
		this.setSize(300,200);
		this.setVisible(true);
		
	}
}

public class Class2 {

	public static void main(String[] args) {
		
		new Grid();
	}

}
