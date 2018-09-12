<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<link href="/css/bootstrap.css" rel="stylesheet">

<link rel="stylesheet" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.8.3.js"></script>
<script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
<script>
$(function() {
    $( "#datepicker" ).datepicker();
});
</script>

<title>Spring Boot</title>
</head>
<body>
  <h1>Unesite uplatu</h1>
  
<form:form method="POST" action="/paymentIncome/add"
  modelAttribute="paymentIncome">
    <table>
	    <tr>
		    <td><form:label path="id">Id</form:label></td>
		    <td><form:input path="id" /></td>
	    </tr>
	    <tr>
		    <td><form:label path="amount">Iznos uplate</form:label></td>
		    <td><form:input path="amount" /></td>
		</tr> 
		<tr>
		    <td><form:label path="note">Naznaka uplate</form:label></td>
		    <td><form:input path="note" /></td>
		</tr>
		<tr>
		    <td><form:label path="date">Datum uplate</form:label></td>
			<td><form:input type="text" id="datepicker" path="date" data-format="MM/dd/yyyy"/></td>
<%-- 			<td><form:input type="text" id="date" name="date" path="date" data-format="dd-MM-yyyy" /></td> --%>

		</tr>
		<tr>
		    <td><form:label path="paymentMethod">Nacin uplate</form:label></td>
		    <td><form:select path="paymentMethod.id">
		    	<form:options itemValue="id" itemLabel="paymentType" items="${paymentMethods}"/>
		    </form:select></td>
		</tr>
		<tr>
		    <td><input type="submit" value="Submit" /></td>
	    </tr>
    </table>
</form:form>
</body>
</html>