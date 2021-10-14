import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JdbcTest {

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/workbench","root","Sumin298365!");
			System.out.println("연결완료");
			
			Statement stmt = conn.createStatement();
			
			// insert 문 자바에서 실행
			// stmt.executeUpdate("insert into student values('1234567', '왕건', '국문학과')");
			
			// update 문 자바에서 실행
			// stmt.executeUpdate("update student set name = '홍길동' where id = '1234567'");

			// delete 문 자바에서 실행
			// stmt.executeUpdate("delete from student where id = '1234567'");
			
			// 커서
			ResultSet rs = stmt.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("dept"));
			}
			// close를 할때는 만든것의 역순으로 해야한다. >> 연관되어있기 때문
			rs.close();
			stmt.close();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("연결 종료");
		};
		
	}

}
