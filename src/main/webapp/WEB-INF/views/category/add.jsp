<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<link href="/css/bootstrap.css" rel="stylesheet">
<title>Spring Boot</title>
</head>
<body>
  <h1>Unesite kategoriju</h1>
  
<form:form method="POST" action="/category/add"
  modelAttribute="category">
    <table>
<!-- 	    <tr> -->
<%-- 		    <td><form:label path="id">Id</form:label></td> --%>
<%-- 		    <td><form:input path="id" /></td> --%>
<!-- 	    </tr> -->
	    <tr>
		    <td><form:label path="name">Naziv kategorije</form:label></td>
		    <td><form:input path="name" /></td>
		</tr> 
		<tr>
			<td><input type="submit" value="Submit" /></td>
		</tr>
	</table>     
</form:form>
</body>
</html>