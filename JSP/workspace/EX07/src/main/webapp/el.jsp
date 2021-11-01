<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>${"Hello World"}</div>
	<div>${5+2}</div>
	<div>${3 eq 3}</div>
	<%
		String input = null;
	%>
	<c:set var="input" value="<%=input %>"/>
	<div>${empty input}</div>
	<!-- el 은null을 출력할 때 아무것도 출력을 시키지 않는다. -->
	<div>${input}</div>
	<%
		String hi = "Hello";
	%>
	<div>${empty hi }</div>
	<div>${hi }</div>
</body>
</html>