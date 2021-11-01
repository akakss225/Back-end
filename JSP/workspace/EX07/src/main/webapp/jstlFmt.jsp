<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<pre>
		<c:set var="now" value="<%=new java.util.Date() %>"></c:set>
		<fmt:formatDate value="${now}" pattern="yyyy-MM-dd"></fmt:formatDate>	
	</pre>
</body>
</html>