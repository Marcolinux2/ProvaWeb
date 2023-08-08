<%@ page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
	<h2>HTML Forms</h2>
		questa è una richiesta GET
		<form action="prova" method="GET">
		  <label for="fname">First name:</label><br>
		  <input type="text" name="nome1" value="Mario"><br>
		  <label for="lname">Last name:</label><br>
		  <input type="text" name="cognome1" value="Rossi"><br><br>
		  <input type="submit" value="Submit">
		</form> 

		<hr>

		<%
			// *****************
			// scriptlet
			// *****************
			String nome = "Marco";
			String cognome = getCognome();
			out.print (cognome);
			
		%>

		<%
		
		
		%>		
		<hr>
		questa è una richiesta POST
		<form action="prova" method="POST">
		  <label for="fname">First name:</label><br>
		  <input type="text" name="nome2" value="Giuseppe"><br>
		  <label for="lname">Last name:</label><br>
		  <input type="text" name="cognome2" value="Verdi"><br><br>
		  <input type="submit" value="Submit">
		</form> 

		<hr>
		<hr>

		e questa che richiesta è?
		
		<form action="prova">
		  <label for="fname">First name:</label><br>
		  <input type="text" name="nome2" value="Ajeje"><br>
		  <label for="lname">Last name:</label><br>
		  <input type="text" name="cognome2" value="Brazorv"><br><br>
		  <input type="submit" value="Submit">
		</form> 
		
	</body>
</html>



<%! 
	String nome = "La Vispa Teresa";
	private String getCognome(){
		String cognome = "Mario";
		return cognome;
	}
%>


