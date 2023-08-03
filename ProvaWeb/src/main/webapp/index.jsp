<%@ page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
	<h2>HTML Forms</h2>
		<form action="prova" method="POST">
		  <label for="fname">First name:</label><br>
		  <input type="text" id="fname" name="fname" value="John"><br>
		  <label for="lname">Last name:</label><br>
		  <input type="text" id="lname" name="lname" value="Doe"><br><br>
		  <input type="submit" value="Submit">
		</form> 

		<form action="inseriscicontatto" method="GET">
		  <label for="fname">First name:</label><br>
		  <input type="text" id="nome" name="fname" value="John"><br>
		  <label for="lname">Last name:</label><br>
		  <input type="text" id="cognome" name="lname" value="Doe"><br><br>
		  <label for="lname">Indirizzo:</label><br>
		  <input type="text" id="cognome" name="lname" value="Doe"><br><br>
		  <label for="lname">Telefono:</label><br>
		  <input type="text" id="cognome" name="lname" value="Doe"><br><br>
		  <input type="submit" value="Submit">
		</form> 
		
		Per le bretelle di Priamo!
		
		Hello!
		<%
			ArrayList l = new ArrayList();
			
		
		%>
		
	</body>
</html>