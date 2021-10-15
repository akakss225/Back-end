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
import java.sql.*;

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
	
	// 검색버튼
	JButton btnSearch = null;
	
	public Haksa() {
		this.setTitle("학사 관리 프로그램");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout()); // Container를 이용하지 않고 직접 넣을 수 있음.
		
		this.add(new JLabel("학번"));
		this.txtId = new JTextField(15);
		this.add(txtId);
		
		this.btnSearch = new JButton("검색");
		this.add(this.btnSearch);
		this.btnSearch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					// MySQL의 포트넘버는 3306이며, 뒤에는 스키마name을 써줌. 그리고 순서대로 userName, server passward를 작성해줌.
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/workbench","root","Sumin298365!");
					System.out.println("연결완료");
					
					Statement stmt = conn.createStatement();
					
					
					// append이기 때문에 초기화해주는 코드가 필요함
					taList.setText("");
					
					taList.append("학번\t이름\t학과\n");
					taList.append("----------------------------------\n");
					
					// 커서
					ResultSet rs = stmt.executeQuery("select * from student where id = '"+txtId.getText()+"'");
					while(rs.next()) {
						taList.append(rs.getString("id") + "\t" + rs.getString("name") + "\t" + rs.getString("dept") + "\n");
						txtId.setText(rs.getString("id"));
						txtName.setText(rs.getString("name"));
						txtDepartment.setText(rs.getString("dept"));
					}
					
					// close를 할때는 만든것의 역순으로 해야한다. >> 연관되어있기 때문
					rs.close();
					stmt.close();
					conn.close();
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
				finally{
					System.out.println("연결 종료");
				};
			}
			
		});
		
		this.add(new JLabel("이름"));
		this.txtName = new JTextField(22);
		this.add(txtName);
		
		this.add(new JLabel("학과"));
		this.txtDepartment = new JTextField(22);
		this.add(txtDepartment);
		
		this.add(new JLabel("주소"));
		this.txtAdress = new JTextField(22);
		this.add(txtAdress);
		
		this.taList = new JTextArea(15, 23); // 줄의 갯수, 글자의 갯수
		this.add(new JScrollPane(taList));
		
		
		this.btnInsert = new JButton("등록");
		this.add(btnInsert);
		this.btnInsert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// MySQL과 연동해서 insert하는 작업을 코딩함.
				if(txtId.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "학번을 입력해주세요.", "Alert", JOptionPane.ERROR_MESSAGE);
				}
				else if(txtName.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "이름을 입력해주세요.", "Alert", JOptionPane.ERROR_MESSAGE);
				}
				else if(txtDepartment.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "학과를 입력해주세요.", "Alert", JOptionPane.ERROR_MESSAGE);
				}
				else {
					try {
						// MySQL의 포트넘버는 3306이며, 뒤에는 스키마name을 써줌. 그리고 순서대로 userName, server passward를 작성해줌.
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/workbench","root","Sumin298365!");
						System.out.println("연결완료");
						
						Statement stmt = conn.createStatement();
						
						// insert 문 자바에서 실행
						stmt.executeUpdate("insert into student values('"+txtId.getText()+"', '"+txtName.getText()+"', '"+txtDepartment.getText()+"')");
						
						
						// append이기 때문에 초기화해주는 코드가 필요함
						taList.setText("");
						
						taList.append("학번\t이름\t학과\n");
						taList.append("----------------------------------\n");
						
						// 커서
						ResultSet rs = stmt.executeQuery("select * from student");
						while(rs.next()) {
							taList.append(rs.getString("id") + "\t" + rs.getString("name") + "\t" + rs.getString("dept") + "\n");
						}
						// close를 할때는 만든것의 역순으로 해야한다. >> 연관되어있기 때문
						rs.close();
						stmt.close();
						conn.close();
					}
					catch(Exception e1) {
						e1.printStackTrace();
					}
					finally{
						System.out.println("연결 종료");
					};
				}
				
			}
			
		});
		this.btnSelect = new JButton("목록");
		this.add(btnSelect);
		// MySQL연동
		this.btnSelect.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					// MySQL의 포트넘버는 3306이며, 뒤에는 스키마name을 써줌. 그리고 순서대로 userName, server passward를 작성해줌.
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/workbench","root","Sumin298365!");
					System.out.println("연결완료");
					
					Statement stmt = conn.createStatement();
					
					// insert 문 자바에서 실행
					// stmt.executeUpdate("insert into student values('1234567', '왕건', '국문학과')");
					
					// update 문 자바에서 실행
					// stmt.executeUpdate("update student set name = '홍길동' where id = '1234567'");

					// delete 문 자바에서 실행
					// stmt.executeUpdate("delete from student where id = '1234567'");
					
					
					// append이기 때문에 초기화해주는 코드가 필요함
					taList.setText("");
					
					taList.append("학번\t이름\t학과\n");
					taList.append("----------------------------------\n");
					
					// 커서
					ResultSet rs = stmt.executeQuery("select * from student");
					while(rs.next()) {
						taList.append(rs.getString("id") + "\t" + rs.getString("name") + "\t" + rs.getString("dept") + "\n");
					}
					// close를 할때는 만든것의 역순으로 해야한다. >> 연관되어있기 때문
					rs.close();
					stmt.close();
					conn.close();
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
				finally{
					System.out.println("연결 종료");
				};
				
			}
			
		});
		
		this.btnUpdate = new JButton("수정");
		this.add(btnUpdate);
		
		this.btnUpdate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					// MySQL의 포트넘버는 3306이며, 뒤에는 스키마name을 써줌. 그리고 순서대로 userName, server passward를 작성해줌.
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/workbench","root","Sumin298365!");
					System.out.println("연결완료");
					
					Statement stmt = conn.createStatement();
					
					// update 문 자바에서 실행
					stmt.executeUpdate("update student set name = '"+txtName.getText()+"', dept='"+txtDepartment.getText()+"'where id = '"+txtId.getText()+"'");

					
					// append이기 때문에 초기화해주는 코드가 필요함
					taList.setText("");
					
					taList.append("학번\t이름\t학과\n");
					taList.append("----------------------------------\n");
					
					// 커서
					ResultSet rs = stmt.executeQuery("select * from student where id='"+txtId.getText()+"'");
					while(rs.next()) {
						taList.append(rs.getString("id") + "\t" + rs.getString("name") + "\t" + rs.getString("dept") + "\n");
					}
					txtId.setText("");
					txtName.setText("");
					txtDepartment.setText("");
					
					// close를 할때는 만든것의 역순으로 해야한다. >> 연관되어있기 때문
					rs.close();
					stmt.close();
					conn.close();
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
				finally{
					System.out.println("연결 종료");
				};
				
			}
			
		});
		
		this.btnDelete = new JButton("삭제");
		this.btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "삭제하시겠습니까?", "confirm", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_OPTION) {
					// Oracle연동. 삭제(delete)처리
					try {
						// MySQL의 포트넘버는 3306이며, 뒤에는 스키마name을 써줌. 그리고 순서대로 userName, server passward를 작성해줌.
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/workbench","root","Sumin298365!");
						System.out.println("연결완료");
						
						Statement stmt = conn.createStatement();
						
						// delete 문 자바에서 실행
						stmt.executeUpdate("delete from student where id = '"+txtId.getText()+"'");
						
						// append이기 때문에 초기화해주는 코드가 필요함
						taList.setText("");
						
						taList.append("학번\t이름\t학과\n");
						taList.append("----------------------------------\n");
						
						// 커서
						ResultSet rs = stmt.executeQuery("select * from student");
						while(rs.next()) {
							taList.append(rs.getString("id") + "\t" + rs.getString("name") + "\t" + rs.getString("dept") + "\n");
						}
						txtId.setText("");
						txtName.setText("");
						txtDepartment.setText("");
						
						
						// close를 할때는 만든것의 역순으로 해야한다. >> 연관되어있기 때문
						rs.close();
						stmt.close();
						conn.close();
					}
					catch(Exception e1) {
						e1.printStackTrace();
					}
					finally{
						System.out.println("연결 종료");
					};
					
					
					
					JOptionPane.showMessageDialog(null, "삭제 완료.", "message", JOptionPane.INFORMATION_MESSAGE);
				}
		}});
		
		this.add(btnDelete);
		this.setSize(320, 500);
		this.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		
		new Haksa();
	}

}
