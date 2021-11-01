<%@page import="com.saeyan.javabeans.MemberBean"%>
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
	<c:set var="msg" value="Hello"></c:set>
	<!-- \ >> 이스케이프 표시로, 이 경우 el 태그가 아닌 ${msg}를 표시하게 만들어준다. -->
	\${msg} = ${msg}<br>
	<c:set var="age">30</c:set>
	\${age} = ${age}<hr>
	<c:set var="member" value="<%=new MemberBean() %>"></c:set>
	<c:set target="${member}" property="name" value="전수빈"></c:set>
	<c:set target="${member}" property="userid">pinksubin</c:set>
	\${member} = ${member}
</body>
</html>