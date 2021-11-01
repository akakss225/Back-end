<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.DriverManager" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String url = "jdbc:mysql://127.0.0.1:3306/java_jdbc";
	String uid = "root";
	String pass = "Sumin298365!";
	String sql = "select * from SignUp";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="800" border="1">
		<tr>
			<th>Email</th>
			<th>Password</th>
			<th>Name</th>
			<th>Phone</th>
		</tr>
		<%
			try{
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(url, uid, pass);
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()){
					out.println("<tr>");
					out.println("<td>" + rs.getString("email") + "</td>");
					out.println("<td>" + rs.getString("pwd") + "</td>");
					out.println("<td>" + rs.getString("name") + "</td>");
					out.println("<td>" + rs.getString("phone") + "</td>");
					out.println("</tr>");
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			finally{
				try{
					if(rs != null) rs.close();
					if(stmt != null) stmt.close();
					if(conn != null) conn.close();
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		%>
	</table>
</body>
</html>