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
  <h1>Unesite prodajno mjesto</h1>
  
<form:form method="POST" action="/place/add"
  modelAttribute="place">
    
    <form:label path="id">Id</form:label>
    <form:input path="id" />
    <form:label path="placeName">Name</form:label>
    <form:input path="placeName" />
     
    <input type="submit" value="Submit" />
</form:form>
  
</body>
</html>