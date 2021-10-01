package practice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


class MyDialog extends JDialog{
	private JButton loginButton = new JButton("login");
	private JTextField tf = new JTextField(10);
	private JPasswordField pf = new JPasswordField(10); 
	
	public MyDialog(JFrame frame, String title) {
		super(frame, title); // 부모의 생성자 호출
		setLayout(new FlowLayout());
		add(new JLabel("아이디"));
		add(tf);
		add(new JLabel("비밀번호"));
		add(pf);
		add(loginButton);
		setSize(200, 150);
		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}
}

public class Practice1 extends JFrame {
private MyDialog dialog;
	public Practice1() {
		super("DialogEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("로그인");
		
		dialog = new MyDialog(this, "로그인");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
				
			}
			
		});
		getContentPane().add(btn);
		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
//		2. 로그인 버튼을 클릭하면 로그인 할 수 있는 다이얼로그를 띄우기
//		패스워드는 JPasswordField로 구현.
		new Practice1();
	}

}
