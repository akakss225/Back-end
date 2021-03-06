import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BookRent extends JPanel {
	DefaultTableModel model = null; // table data
	JTable table = null;
	Connection conn = null;
	
	Statement stmt;
	String query; //sql문
	
	// 생성자
	public BookRent() {
		query="select s.id, s.name, b.title, br.rdate "
				+ "from student s, books b, bookrent br "
				+ "where s.id=br.id and b.no=br.bookno";
		
		try {
			//DB연결
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/workbench","root","Sumin298365!");
			System.out.println("연결완료");
			// 데이터베이스로 SQL문을 보내기 위한 객체
			stmt=conn.createStatement();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	    
	    setLayout(null);//레이아웃설정. 레이아웃 사용 안함.
	    
	    JLabel l_dept = new JLabel("학과");
	    l_dept.setBounds(10, 10, 30, 20);
	    add(l_dept);
	    
	    String[] dept = {"전체","컴퓨터시스템","멀티미디어","컴퓨터공학"};
	    JComboBox cb_dept = new JComboBox(dept);
	    cb_dept.setBounds(45, 10, 100, 20);
	    add(cb_dept);
	    cb_dept.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				query="select s.id, s.name, b.title, br.rdate "
						+ " from student s, books b, bookrent br "
						+ " where s.id=br.id and b.no=br.bookno";
				
				JComboBox cb=(JComboBox)e.getSource(); //이벤트가 발생한 콤보박스 구하기
				//동적쿼리
				if(cb.getSelectedIndex()==0) {
					//전체
					query+=" order by br.no";
				}else if(cb.getSelectedIndex()==1) {
					//컴퓨터시스템
					query+=" and s.dept='컴퓨터시스템' order by br.no";
				}else if(cb.getSelectedIndex()==2) {
					//멀티미디어
					query+=" and s.dept='멀티미디어' order by br.no";
				}else if(cb.getSelectedIndex()==3) {
					//컴퓨터공학
					query+=" and s.dept='컴퓨터공학' order by br.no";
				}
				list();
			}
	    	
	    });
	    
	    String colName[] = {"학번","이름","도서명","대출일"}; // 컬럼 명
	    model = new DefaultTableModel(colName,0); // 모델. 테이블의 데이터
	    table = new JTable(model); // model - table binding작업
	    table.setPreferredScrollableViewportSize(new Dimension(470,200)); // table size
	    add(table);
	    
	    JScrollPane sp = new JScrollPane(table); // table inner scroll
	    sp.setBounds(10, 40, 460, 250);
	    add(sp);  
	    
	    setSize(490, 400);//화면크기
	    setVisible(true);
	}
	public void list(){
	    try{
		     System.out.println(query);  //디버깅. 쿼리문을 출력.     
		     // Select문 실행     
		     ResultSet rs=stmt.executeQuery(query);
		    
		     //JTable 초기화
		     model.setNumRows(0);
		    
		     while(rs.next()){
		      String[] row=new String[4];//컬럼의 갯수가 4
		      row[0]=rs.getString("id");
		      row[1]=rs.getString("name");
		      row[2]=rs.getString("title");
		      row[3]=rs.getString("rdate");
		      model.addRow(row); // model에 행 추가
		     }
		     rs.close();
		    
		}
		catch(Exception e1){
		     //e.getStackTrace();
		     System.out.println(e1.getMessage());
		}						
	}
	
	
	public static void main(String[] args) {
		
		new BookRent();
	}

}
