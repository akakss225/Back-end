import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonItemEventEx extends JFrame {
	private JRadioButton[] radio = new JRadioButton[3];
	private String[] name = {"사과", "배", "체리"};
	private ImageIcon[] image = {
			new ImageIcon("/Users/sumin/Desktop/Back-end/명품JAVA프로그래밍(개정4판)_학습자용[20210811]/예제 및 그림 소스/11장/chap11-ex07/images/apple.jpg"),
			new ImageIcon("/Users/sumin/Desktop/Back-end/명품JAVA프로그래밍(개정4판)_학습자용[20210811]/예제 및 그림 소스/11장/chap11-ex07/images/pear.jpg"),
			new ImageIcon("/Users/sumin/Desktop/Back-end/명품JAVA프로그래밍(개정4판)_학습자용[20210811]/예제 및 그림 소스/11장/chap11-ex07/images/cherry.jpg")};
	private JLabel imageLabel = new JLabel();
	
	public RadioButtonItemEventEx() {
		this.setTitle("라디오버튼 item event예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JPanel radioPanel = new JPanel(); // 상단 라디오박스
		radioPanel.setBackground(Color.GRAY);
		ButtonGroup g = new ButtonGroup();
		
		for(int i = 0; i < radio.length; i++) {
			radio[i] = new JRadioButton(name[i]);
			g.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}
		radio[2].setSelected(true);
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.setSize(250, 200);
		this.setVisible(true);
	}
	class MyItemListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED) {
				return;
			}
			if(radio[0].isSelected()) {
				imageLabel.setIcon(image[0]);
			}
			else if(radio[1].isSelected()) {
				imageLabel.setIcon(image[1]);
			}
			else {
				imageLabel.setIcon(image[2]);
			}
			
		}
		
	}

	public static void main(String[] args) {

		new RadioButtonItemEventEx();

	}

}

