<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
</head>
<body>
	<h1>Please fill the form to register!</h1>
	<form name = 'regForm' action='username' onsubmit = "return validateForm()" method = "post">
		First Name: <p><input type = "text" name= "firstName"></p><br>
		Last Name: <p><input type = "text" name= "lastName"></p><br>
		Email: <p><input type = "email" name= "eMail"></p><br>
		Phone Number: <p><input type = "tel" name= "phoneNumber"></p><br>
		Password: <p><input type = "password" name= "password"></p><br>
		Confirm Password: <p><input type = "password" name= "confirm_password"></p><br>
		
		<input type = "submit" value = "Submit">
		
	</form><br>
	<script src="js/script.js"></script>
</body>
</html>