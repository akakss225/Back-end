import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Haksa extends JFrame {
	JTextField txtId = null; // 초기에 지정된 레퍼런스가 없다면 null을 넣어놓는게 권장사항이다.
	JTextField txtName = null;
	JTextField txtDepartment = null;
	JTextField txtAdress = null;
	JTextArea taList = null;
	
	// 이러한 구조를 CRUD 라고 함. 게시판 생성의 기본 구조.
	JButton btnInsert = null; // 등록 Create
	JButton btnSelect = null; // 목록 Read
	JButton btnUpdate = null; // 수정 Update
	JButton btnDelete = null; // 삭제 Delete
	
	public Haksa() {
		this.setTitle("학사 관리 프로그램");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout()); // Container를 이용하지 않고 직접 넣을 수 있음.
		
		this.add(new JLabel("학번"));
		this.txtId = new JTextField(20);
		this.add(txtId);
		
		this.add(new JLabel("이름"));
		this.txtName = new JTextField(20);
		this.add(txtName);
		
		this.add(new JLabel("학과"));
		this.txtDepartment = new JTextField(20);
		this.add(txtDepartment);
		
		this.add(new JLabel("주소"));
		this.txtAdress = new JTextField(20);
		this.add(txtAdress);
		
		this.taList = new JTextArea(15, 23); // 줄의 갯수, 글자의 갯수
		this.add(new JScrollPane(taList));
		
		
		this.btnInsert = new JButton("등록");
		this.add(btnInsert);
		this.btnInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// Oracle과 연동해서 insert하는 작업을 코딩함.
				System.out.println("등록");
				
			}
			
		});
		this.btnSelect = new JButton("목록");
		this.add(btnSelect);
		this.btnUpdate = new JButton("수정");
		this.add(btnUpdate);
		this.btnDelete = new JButton("삭제");
		this.btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "삭제하시겠습니까?", "confirm", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_OPTION) {
					// Oracle연동. 삭제(delete)처리
					JOptionPane.showMessageDialog(null, "삭제 완료.", "message", JOptionPane.INFORMATION_MESSAGE);
				}
		}});
		
		this.add(btnDelete);
		this.setSize(300, 500);
		this.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		
		new Haksa();
	}

}
