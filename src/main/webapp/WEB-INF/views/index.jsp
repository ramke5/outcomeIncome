<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
  <h1>Dobrodosli na Outcome-income!</h1>
  <hr>

  <div class="form">
    <form action="hello" method="post">
    	<table>
	    	<tr>
	    		<td><a href="place/add">Unesite prodajno mjesto!</a></td>
	    	</tr>
	    	<tr>
	    		<td><a href="category/add">Unesite kategoriju!</a></td>
	    	</tr>
	    	<tr>
	    		<td><a href="paymentMethod/add">Unesite metodu naplate!</a></td>
	    	</tr>
	    	<tr>
	    		<td><a href="paymentIncome/add">Unesite uplatu!</a></td>
	    	</tr>
	    	<tr>
		   		<td><a href="expense/add">Unesite racun!</a></td>    	
	    	</tr>
	   	</table>
    </form>
  </div>

</body>
</html>