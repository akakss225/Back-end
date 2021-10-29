<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie cookie = new Cookie("id", ""); // id의 값을 빈 문자열로
	cookie.setMaxAge(0);
	response.addCookie(cookie);
%>
	<h3>쿠키가 삭제되었습니다.</h3>
	<a href="getCookies.jsp">쿠키 삭제 확인하기</a>
</body>
</html>