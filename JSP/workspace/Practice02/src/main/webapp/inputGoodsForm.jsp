<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>정보 입력 폼</h2>
	<form method="get" action="GoodsServlet2">
		<label for="name">상품명 </label> 
		<input type="text" name="name" id="name"><br>
		<label for="price">가격 </label> 
		<input type="text" name="price" id="price"><br>
		<label for="description">설명 </label>
		<input type="text" name="description" id="description"><br>
		<input type="submit" value="전송">
		<input type="reset" value="취소">
	</form>
</body>
</html>