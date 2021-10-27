<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="CheckboxServlet">
		<input type="checkbox" name="item" value="신발"> 신발
		<input type="checkbox" name="item" value="신발"> 가방
		<input type="checkbox" name="item" value="신발"> 벨트<br>
		<input type="checkbox" name="item" value="신발"> 모자
		<input type="checkbox" name="item" value="신발"> 시계
		<input type="checkbox" name="item" value="신발"> 쥬얼리<br>
		<input type="submit" value="전송">
	</form>
</body>
</html>