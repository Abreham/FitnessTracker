<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Minute</title>
   <script src="<c:url value="/js/jquery-2.1.1.js" />"></script>
   <script src="<c:url value="/js/main.js" />"></script>
</head>

<body>
	<h1><spring:message code="minute.exercised.head"/></h1>


    Language : <a href="?language=en">English</a> | <a href="?language=es">Spanish</a>
	<form:form commandName="exercise">
		<table>
			<tr>
				<td><spring:message code="goal.text"/></td>
				<td><form:input path="minutes" /></td>
				<td>
				   <form:select id="activities" path="activity"></form:select>
				</td>
			</tr>
			<tr>
				<td colspan="3">
				    <input type="submit" value="<spring:message code="enter"/>"/>
				</td>
			</tr>
		</table>
	</form:form>
<h1>Our Goal for the day is : ${goal.minutes}</h1>
</body>
</html>