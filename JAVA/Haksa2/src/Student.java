import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Student extends JPanel {
	JTextField txtId = null; // 초기에 지정된 레퍼런스가 없다면 null을 넣어놓는게 권장사항이다.
	JTextField txtName = null;
	JTextField txtDepartment = null;
	JTextField txtAddress = null;
	
	
	// 이러한 구조를 CRUD 라고 함. 게시판 생성의 기본 구조.
	JButton btnInsert = null; // 등록 Create
	JButton btnSelect = null; // 목록 Read
	JButton btnUpdate = null; // 수정 Update
	JButton btnDelete = null; // 삭제 Delete
	
	// 검색버튼
	JButton btnSearch = null;
	
	// table data, model
	DefaultTableModel model = null; 
	JTable table = null;
	
	public Student() {
		// 이 두가지는 Frame에서 지원하는 기능임
//		this.setTitle("학사 관리 프로그램");
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
					// 커서
					ResultSet rs = stmt.executeQuery("select * from student where id = '"+txtId.getText()+"'");
					
					
					// JTable reset
					model.setNumRows(0);
					
					while(rs.next()) {
						String[] row = new String[4];
						row[0] = rs.getString("id");
						row[1] = rs.getString("name");
						row[2] = rs.getString("dept");
						row[3] = rs.getString("address");
						model.addRow(row);
						// rs.next()로 한 행을 읽었기 때문에, 밖으로 나가면 eof를 의미. 즉 while문 내부에 있어야함
						txtId.setText(rs.getString("id"));
						txtName.setText(rs.getString("name"));
						txtDepartment.setText(rs.getString("dept"));
						txtAddress.setText(rs.getString("adress"));
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
		this.txtAddress = new JTextField(22);
		this.add(txtAddress);
		
		String[] colname = {"학번", "이름", "학과", "주소"};
		this.model = new DefaultTableModel(colname, 0);
		this.table = new JTable(model); // model - table binding
		table.setPreferredScrollableViewportSize(new Dimension(250, 270)); // table size
		this.add(table);
		JScrollPane sp = new JScrollPane(table);
		this.add(sp);
		
		this.table.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 이벤트가 일어난 장소는 Table임.
				table = (JTable)e.getComponent(); // return type = component 이다. 따라서 cast함수로 Table 데이터로 바꿔준다.
				model = (DefaultTableModel)table.getModel(); // table의 경우 데이터타입이 JTable이기 때문에 casting
				// parameter 가 행, 열이다.
				txtId.setText((String)model.getValueAt(table.getSelectedRow() /* 현재 선택된행 */,0)); // 학번
				txtName.setText((String)model.getValueAt(table.getSelectedRow() /* 현재 선택된행 */,1)); // 이름
				txtDepartment.setText((String)model.getValueAt(table.getSelectedRow() /* 현재 선택된행 */,2)); // 학과
				txtAddress.setText((String)model.getValueAt(table.getSelectedRow() /* 현재 선택된행 */,3)); // 학과
			}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			});
		
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
				else if(txtAddress.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "주소를 입력해주세요.", "Alert", JOptionPane.ERROR_MESSAGE);
				}
				else {
					try {
						// MySQL의 포트넘버는 3306이며, 뒤에는 스키마name을 써줌. 그리고 순서대로 userName, server passward를 작성해줌.
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/workbench","root","Sumin298365!");
						System.out.println("연결완료");
						
						Statement stmt = conn.createStatement();
						
						// insert 문 자바에서 실행
						stmt.executeUpdate("insert into student values('"+txtId.getText()+"', '"+txtName.getText()+"', '"+txtDepartment.getText()+"', '"+txtAddress.getText()+"')");
						// 커서
						ResultSet rs = stmt.executeQuery("select * from student");
						
						
						// JTable reset
						model.setNumRows(0);
						// 목록 출력해주는 구문
						while(rs.next()) {
							String[] row = new String[4];
							row[0] = rs.getString("id");
							row[1] = rs.getString("name");
							row[2] = rs.getString("dept");
							row[3] = rs.getString("address");
							model.addRow(row);
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
					// 커서
					ResultSet rs = stmt.executeQuery("select * from student");

					// JTable reset
					model.setNumRows(0);
					// 목록 출력해주는 구문
					while(rs.next()) {
						String[] row = new String[4];
						row[0] = rs.getString("id");
						row[1] = rs.getString("name");
						row[2] = rs.getString("dept");
						row[3] = rs.getString("address");
						model.addRow(row);
					}
					txtId.setText("");
					txtName.setText("");
					txtDepartment.setText("");
					txtAddress.setText("");
					
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
					stmt.executeUpdate("update student set name = '"+txtName.getText()+"', dept='"+txtDepartment.getText()+"', address='"+txtAddress.getText()+"' where id = '"+txtId.getText()+"'");

					// 커서
					ResultSet rs = stmt.executeQuery("select * from student where id='"+txtId.getText()+"'");
					
					// JTable reset
					model.setNumRows(0);
					while(rs.next()) {				
						String[] row = new String[4];
						row[0] = rs.getString("id");
						row[1] = rs.getString("name");
						row[2] = rs.getString("dept");
						row[3] = rs.getString("address");
						model.addRow(row);
					}
					txtId.setText("");
					txtName.setText("");
					txtDepartment.setText("");
					txtAddress.setText("");
					
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
						
						// 커서
						ResultSet rs = stmt.executeQuery("select * from student");
						
						// JTable reset
						model.setNumRows(0);
						while(rs.next()) {
							String[] row = new String[4];
							row[0] = rs.getString("id");
							row[1] = rs.getString("name");
							row[2] = rs.getString("dept");
							row[3] = rs.getString("address");
							model.addRow(row);
						}
						txtId.setText("");
						txtName.setText("");
						txtDepartment.setText("");
						txtAddress.setText("");
						
						
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
		
		new Student();
	}

}