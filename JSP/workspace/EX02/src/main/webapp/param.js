function check(){
	if(document.frm.id.value == ""){
		alert("아이디를 입력해주세요.");
		document.frm.id.focus();
		return false;
	}
	if(document.frm.age.value == ""){
		alert("나이를 입력하세요");
		document.frm.age.focus();
		return false;
	}
	if(isNaN(document.frm.age.value)){
		alert("숫자를 입력하세요");
		document.frm.age.select();
		return false;
	}
	return true;
	
}

function check2(){
	if(document.frm.id.value == ""){
		alert("아이디를 입력해주세요.");
		document.frm.id.focus();
		return;
	}
	if(document.frm.age.value == ""){
		alert("나이를 입력하세요");
		document.frm.age.focus();
		return;
	}
	if(isNaN(document.frm.age.value)){
		alert("숫자를 입력하세요");
		document.frm.age.select();
		return;
	}
	document.frm.submit(); // form 에 입력한 값을 전
}


