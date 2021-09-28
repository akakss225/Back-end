import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LabelEx extends JFrame{
	public LabelEx() {
		this.setTitle("레이블 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("사랑합니다");
		ImageIcon img = new ImageIcon("/Users/sumin/Desktop/Back-end/명품JAVA프로그래밍(개정4판)_학습자용[20210811]/예제 및 그림 소스/11장/chap11-ex02/images/beauty.jpg");
		
		JLabel imageLabel = new JLabel(img);
		ImageIcon normalIcon = new ImageIcon("/Users/sumin/Desktop/Back-end/명품JAVA프로그래밍(개정4판)_학습자용[20210811]/예제 및 그림 소스/11장/chap11-ex02/images/normalIcon.gif");
		JLabel label = new JLabel("보고싶으면 전화하세요.", normalIcon, SwingConstants.CENTER);
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		this.setSize(400, 600);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new LabelEx();

	}

}
