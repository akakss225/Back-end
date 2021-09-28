import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame {
	
	public CheckBoxEx() {
		this.setTitle("체크박스 만들기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("/Users/sumin/Desktop/Back-end/명품JAVA프로그래밍(개정4판)_학습자용[20210811]/예제 및 그림 소스/11장/chap11-ex04/images/cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("/Users/sumin/Desktop/Back-end/명품JAVA프로그래밍(개정4판)_학습자용[20210811]/예제 및 그림 소스/11장/chap11-ex04/images/selectedCherry.jpg");
		
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		JCheckBox cherry = new JCheckBox("체리", cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		this.setSize(250, 150);
		this.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new CheckBoxEx();

	}

}
