<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://www.w3schools.com/js/myScript.js"></script>
<style>
* {box-sizing: border-box}
form { width: 700px; margin: 0 auto 20px; }
/* Add padding to containers */
.container {
  padding: 16px;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for the submit/register button */
.registerbtn {
  background-color: #04AA6D;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity:1;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style>
</head>
<body>
	<form method="post" action="signUp.jsp" name="frm">
	  <div class="container">
	    <h1>Sign Up For Our HomePage!</h1>
	    <p>Please fill in this form to create an account.</p>
	    <hr>
	
	    <label for="email"><b>Email</b></label>
	    <input type="text" placeholder="Enter Username(Email)" name="email" id="email" required>
	
	    <label for="pwd1"><b>Password</b></label>
	    <input type="password" placeholder="Enter Password" name="pwd1" id="pwd1" required>
	    
	    <label for="pwd2"><b>Password Again</b></label>
	    <input type="password" placeholder="Enter Password" name="pwd2" id="pwd2" required>
	
	    <label for="name"><b>Name</b></label>
	    <input type="text" placeholder="Name" name="name" id="name" required>
	    
	    <label for="phone"><b>Phone Number</b></label>
	    <input type="text" placeholder="Phone Number" name="phone" id="phone" required>
	
	    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
	    <button type="submit" class="register" onclick="return loginCheck()">Register</button>
	  </div>
	
	  <div class="container signin">
	    <p>Already have an account? <a href="#">Sign in</a>.</p>
	  </div>
	</form>
	<script>
		function loginCheck(){
			var emailRule = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
			if(!emailRule.test(document.frm.email.value)) {            
			            alert("????????? ????????? ???????????????.");
			            return false;
			}
		}
	</script>
</body>
</html>