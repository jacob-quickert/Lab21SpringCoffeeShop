<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
</head>
<body>
	<h1>Please fill the form to register!</h1>
	<form action="addnewuser">
		<!-- User ID: <br><input type="text" name="id"><br> --> 
		First Name:<br><input type="text" name="fName"><br> 
		Last Name: <br><input type="text" name="lName"><br> 
		Your Email: <br><input type="text" name="email"><br> 
		Your Phone: <br><input type="text" name="phone"><br> 
		<input type="submit" value="Add"><br>

	</form>
	<table border="1">
		<c:forEach var="user" items="${users}">
			<tr>
				<!-- left out title on purpose -->
				
				<td>${user.firstName}</td>
				<td>${user.lastName}</td>
				<td>${user.phone}</td>
				<td>${user.email}</td>
				<!-- this is url encoding and allows us to pass some 
				data into the link for our controller method -->
				<td><a href="update?id=${user.userID }">Update</a></td>
				<td><a href="delete?id=${user.userID }">Delete</a></td>
			
			
			</tr>
	
		</c:forEach>

	</table>
	<br>
	
</body>
</html>