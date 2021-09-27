import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame{
	public MyFrame() {
		this.setTitle("ContentPane과 JFrame"); // 앞에 this를 쓰는게 좋은 습관!!
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close버튼 눌르면 윈도우 종료하는기능 활성화. 꼭 적어야함.
		// System.exit(0) >> 언제 어디서나 무조건 종료하게 해주는 기능
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout()); // 기본값인 BorderLayout을 FlowLayout으로 변경해주는 코드
		// contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); >> 정렬방법, 가로간격, 세로간격을 입력할 수 있음.
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancle"));
		contentPane.add(new JButton("Ignore"));
		
		this.setSize(300,150);
		this.setVisible(true);
	}
}

public class Class1 {

	
	public static void main(String[] args) {

		// 스윙프레임 만들기
		
		MyFrame mf = new MyFrame();

	}

}
