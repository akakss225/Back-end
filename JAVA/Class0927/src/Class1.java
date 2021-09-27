import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("ContentPane과 JFrame");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close버튼 눌르면 윈도우 종료해주게 하는기능 활성화. 꼭 적어야함.
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancle"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300,150);
		setVisible(true);
	}
}

public class Class1 {

	
	public static void main(String[] args) {

		// 스윙프레임 만들기
		
		MyFrame mf = new MyFrame();

	}

}
