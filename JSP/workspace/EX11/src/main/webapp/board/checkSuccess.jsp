<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
	if (window.name == "update"){
		window.opener.parent.location.href="BoardServlet?command=board_update_form&num=${param.num}";
	}
	else if(window.name == "delete"){
		alert("삭제되었습니다.")
		window.opener.parent.location.href="BoardServlet?command=board_delete&num=${param.num}";
	}
	else if(window.name == "reply_delete"){
		alert("댓글을 삭제하였습니다.")
		window.opner.parent.location.href="BoardServlet?command=reply_delete&num=${param.num}";
	}
	wndow.close();
</script>
</body>
</html>