<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Goal</title>
   <link href="<c:url value="/stylesheets/style.css" />" rel="stylesheet">
   <script src="<c:url value="/js/jquery-2.1.1.js" />"></script>
</head>
<body>
  <form:form commandName="goal">
  <form:errors path="*" cssClass="errorblock" element="div" />
    <table>
       <tr>
         <td><form:label path="minutes"/>Enter Minutes:</td>
         <td><form:input path="minutes" cssErrorClass="error"/></td>
         <td><form:errors path="minutes" cssClass="error"/></td>
       </tr>
       <tr>
         <td colspan="3">
           <form:button>Enter Goal Minutes</form:button>
         </td>
       </tr>
       
    </table>
  </form:form>


</body>
</html>