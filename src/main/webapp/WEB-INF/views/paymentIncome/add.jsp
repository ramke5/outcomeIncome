<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
  <h1>Unesite uplatu</h1>
  
<form:form method="POST" action="/paymentIncome/add"
  modelAttribute="paymentIncome">
    
    <form:label path="id">Id</form:label>
    <form:input path="id" />
    <form:label path="amount">Iznos uplate</form:label>
    <form:input path="amount" />
    <form:label path="note">Naznaka uplate</form:label>
    <form:input path="note" />
	

    <form:select path="paymentMethod.id">
    	<form:options itemValue="id" itemLabel="paymentType" items="${paymentMethods}"/>
    </form:select>
    <input type="submit" value="Submit" />
</form:form>
  
</body>