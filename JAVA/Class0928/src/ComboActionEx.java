import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ComboActionEx extends JFrame {
	private String[] fruits = {"apple", "banana", "kiwi", "mango"};
	private ImageIcon[] images = {
			new ImageIcon("/Users/sumin/Desktop/Back-end/명품JAVA프로그래밍(개정4판)_학습자용[20210811]/예제 및 그림 소스/11장/chap11-ex13/images/apple.jpg"),
			new ImageIcon("/Users/sumin/Desktop/Back-end/명품JAVA프로그래밍(개정4판)_학습자용[20210811]/예제 및 그림 소스/11장/chap11-ex13/images/banana.jpg"),
			new ImageIcon("/Users/sumin/Desktop/Back-end/명품JAVA프로그래밍(개정4판)_학습자용[20210811]/예제 및 그림 소스/11장/chap11-ex13/images/kiwi.jpg"),
			new ImageIcon("/Users/sumin/Desktop/Back-end/명품JAVA프로그래밍(개정4판)_학습자용[20210811]/예제 및 그림 소스/11장/chap11-ex13/images/mango.jpg")
	};
	private JLabel imgLabel = new JLabel(images[0]);
	private JComboBox<String> strCombo = new JComboBox<String>(fruits);
	
	public ComboActionEx() {
		this.setTitle("콤보박스 활용 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		c.add(strCombo);
		c.add(imgLabel);
		
		strCombo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);
				
			}
			
		});
		this.setSize(300, 250);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		new ComboActionEx();

	}

}
