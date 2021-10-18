import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Haksa2 extends JFrame {
	
	ImageIcon img = new ImageIcon("/Users/sumin/Desktop/과제/2021-10-18 10.44.12 송수민_학생_생명과학의 Zoom 회의 91284646647/inha.png");
	
	// menu
	JMenuBar mb = new JMenuBar();
	JMenu menu1 = new JMenu("학생관리");
	JMenu menu2 = new JMenu("도서관리");
	JMenuItem miStudent = new JMenuItem("학생정보");
	JMenuItem miBookRent = new JMenuItem("도서대출");
	
	// 패널 >> 메뉴별 화면이 출력될 패널
	JPanel panel;
	
	
	public Haksa2() {
		this.setTitle("학사 관리 프로그램");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.menu1.add(this.miStudent);
		this.menu2.add(this.miBookRent);
		this.mb.add(this.menu1);
		this.mb.add(this.menu2);
		this.setJMenuBar(mb);

		
		
		
		this.miStudent.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Student");
				panel.removeAll(); // 모든 컴포넌트 삭제
				panel.revalidate(); // 다시 활성화
				panel.repaint(); // 다시 그리기
				panel.add(new Student()); // 화면생성.
				panel.setLayout(null); // 레이아웃 적용 안함	
			}
		});
		
		this.miBookRent.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("BookRent");
				panel.removeAll(); // 모든 컴포넌트 삭제
				panel.revalidate(); // 다시 활성화
				panel.repaint(); // 다시 그리기
				panel.add(new BookRent()); // 화면생성.
				panel.setLayout(null); // 레이아웃 적용 안함	
			}
		});
		
		
		// 위치를 지정하징 않으면 기본적으로 center에 위치함 >> 화면에 꽉 차게 설정 된다.
		panel = new JPanel();
		this.add(panel);
		
		this.setSize(550, 520);
		this.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		
		new Haksa2();
	}

}
