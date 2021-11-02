<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%!
	Connection conn = null;
	PreparedStatement pstmt = null;
	String url = "jdbc:mysql://127.0.0.1:3306/java_jdbc";
	String uid = "root";
	String pass = "Sumin298365!";
	String sql = "insert into SignUp values(?,?,?,?)";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	String email = request.getParameter("email");
	String pwd1 = request.getParameter("pwd1");
	String pwd2 = request.getParameter("pwd2");
	String name = request.getParameter("name");
	String phone = request.getParameter("phone");
	if(!pwd1.equals(pwd2)){
		%>
			<script>
				alert("입력하신 비밀번호가 다릅니다. 다시 입력해주세요.");
				history.go(-1);
			</script>
		<%
		return;
	}
	try{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, uid, pass);
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, email);
		pstmt.setString(2, pwd2);
		pstmt.setString(3, name);
		pstmt.setString(4, phone);
		pstmt.executeUpdate();
	}
	catch(Exception e){
		e.printStackTrace();
	}
	finally{
		try{
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	%>
	<h3>Sign Up Successfully!</h3>
	<a href="allMember.jsp">Check a MemberList</a>
</body>
</html>