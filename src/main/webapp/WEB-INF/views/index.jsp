<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lab 21 Coffee Shop</title>
</head>
<body>
	<h1>Welcome to the Grand Circus Coffee Shop</h1>

	<table border="1">
		<c:forEach var="item" items="${items}">
			<tr>
				
				<td>${item.itemName}</td>
				<td>${item.description}</td>
				<td>${item.quantity}</td>
				<td>${item.price}</td>
	
			</tr>
	
		</c:forEach>

	</table> 
	
	<a href="/registration">Register</a>

</body>
</html> 