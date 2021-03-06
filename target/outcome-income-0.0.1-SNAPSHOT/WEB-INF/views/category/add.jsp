<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>

<title>Spring Boot</title>
</head>
<body>
  <h1>Unesite kategoriju</h1>
  
<form:form method="POST" action="/category/add"
  modelAttribute="category">
    
    <form:label path="id">Id</form:label>
    <form:input path="id" />
    <form:label path="name">Naziv kategorije</form:label>
    <form:input path="name" />
     
    <input type="submit" value="Submit" />
</form:form>
  
</body>
</html>