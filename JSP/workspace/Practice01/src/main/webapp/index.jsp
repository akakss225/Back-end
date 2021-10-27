<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="index.js"></script>
</head>
<body>
	<form name="frm" method="post" action="InfoServlet">
		<label for="id"> ID : </label>
		<input type="text" id="id" name="id"><br>
		<label for="pw"> PASSWORD : </label>
		<input type="password" id="pw" name="pw"><br>
		<label for="name"> Name : </label>
		<input type="text" id="name" name="name"><br>
		<label for="e_mail"> E-Mail : </label>
		<input type="text" id="e_mail" name="e_mail"><br>
		<label for="phone"> Phone : </label>
		<input type="text" id="phone" name="phone"><br><br>
		<input type="submit" value="SUBMIT" onClick="return check()"> 
	</form>
</body>
</html>