<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="wrap" align="center">
		<h1> 게시글 수정 </h1>
		<form name="frm" method="post" action="BoardServlet">
			<input type="hidden" name="command" value="reply_update">
			<input type="hidden" name="num" value="${reply.no }">
			<table>
				<tr>
					<th>작성자</th>
					<td><input type="text" size="12" name="name" value="${reply.name }"> * 필수 </td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" size="12" name="pass"> * 필수(게시물 수정 삭제시 필요합니다) </td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea cols="70" rows="15" name="content" >${reply.content }</textarea> </td>
				</tr>
			</table>
			<br>
			<br>
			<input type="submit" value="등록" onclick="return replyCheck()">
			<input type="reset" value="다시작성">
			<input type="button" value="목록" onclick="location.href='BoardServlet?command=board_list'">
		</form>
	</div>
</body>
</html>