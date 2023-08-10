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

		<%! 
			int day = 3; 	
		%>

		<%
			// *****************
			// scriptlet
			// *****************
		%>
		
		<%
			// tutto quello che scrivo qui va a finire
			// nel metodo -JspService(request, response) 
			out.print (nome);
			// String cognome = getCognome();
			// out.print (cognome);
			
		%>
		Blocco IF inserito in codice HTML 
		<%  if (day == 1 || day == 7 ) { %>
			<p style="" class="">Today is weekend</p>
		<% } else { %>
			<p>Today is not weekend</p>
		<% } %>
		
		<% 
			if (day == 1 || day == 7)  {
				out.println ("<p>Today is weekend</p>");
			} else {
				out.println ("<p>Today is not weekend</p>");
			}
		%>
		
		Expression tag
		
		<%= session.getId()%>
		
		<% out.print(session.getId());%>
		
		<%@include file="/include_001.jsp" %>

		<jsp:scriptlet>
			// XML
			// tag scriptlet
			// stesso significato del codice riportato sotto
		</jsp:scriptlet>

		<%
			String nome="Marco";
			// tag scriptlet
			// inserimento di codice Java nel codice HTML
			
			// oggetti impliciti
			// out = oggetto PrintWriter per inviare output al client
			
			// session = sessione 
			
			// request => oggetto request HttpRequest
			// response => oggetto response HttpResponse
			
			// application => istanza di ServletContext

			// config => ServletConfig object associated with the page.
			
			// pageContext => JspWriter, ovvero gli out.println che usi per scrivere la response
			
			// page => this
			
			// Exception => le eccezioni sollevate nella pagina.
			// non solo le eccezioni Java. 
			// anche errori HTTP.
			
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
	String nome = "Mario" ;
%>

