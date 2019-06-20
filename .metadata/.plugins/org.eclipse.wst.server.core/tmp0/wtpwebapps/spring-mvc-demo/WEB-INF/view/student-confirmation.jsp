<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student confirmation</title>
</head>
<body>
	The student is confirmed: ${student.firstName}  ${student.lastName}
	<br>
	Country: ${student.country}
	<br>
	Favorite Language: ${student.favoriteLanguage}
	<br>
	Operating systems:
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
			<li>${temp} </li>
		</c:forEach>
	</ul>
</body>
</html>