<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName"/>
		<br>
		Last name: <form:input path="lastName"/>
		<br>
		<form:select path="country">
			<form:options items="${student.countryOptions}"/>
		</form:select>
		<br>
		FavoriteLanguage: 
		<br>
		Java <form:radiobutton path="favoriteLanguage" value="Java"/>
		C# <form:radiobutton path="favoriteLanguage" value="C#"/>
		Python <form:radiobutton path="favoriteLanguage" value="Python"/>
		JavaScript <form:radiobutton path="favoriteLanguage" value="JavaScript"/>
		<br>
		Operating systems:
		<br>
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		Windows <form:checkbox path="operatingSystems" value="Windows"/>
		MacOS <form:checkbox path="operatingSystems" value="MacOS"/>
	<input type="submit" value="submit">
	</form:form>
</body>
</html>