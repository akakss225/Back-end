function check(){
	if(document.frm.id.value == ""){
		alert("아이디를 입력해주세요.");
		document.frm.id.focus();
		return false;
	}
	if(document.frm.pw.value == ""){
		alert("비밀번호를 입력해주세요.");
		document.frm.pw.focus();
		return false;
	}
	if(document.frm.name.value == ""){
		alert("이름을 입력해주세요.");
		document.frm.name.focus();
		return false;
	}
	if(isNaN(document.frm.pw.value)){
		alert("숫자를 입력해주세요.");
		document.frm.pw.select();
		return false;
	}
	return true;
}