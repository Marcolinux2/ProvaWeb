<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ciao, io sono pagina 3</title>
</head>
<body>
<%
	out.print (request.getAttribute("PROVOLA") + "<br>");
	out.print (request.getAttribute("PARAM1") + "<br>");
	out.print (request.getAttribute("PARAM2") + "<br>");
	out.print (request.getAttribute("PARAM3") + "<br>");
	
	
	out.print (session.getAttribute("NOME") + "<br>");
	out.print (session.getAttribute("COGNOME") + "<br>");
	out.print (session.getAttribute("INDIRIZZO") + "<br>");
	
	out.print (session.getId() + "<br>");
	
%>


<%
// codice GOOGLE friendly per la redirezione
// 	response.setStatus(301);
// 	response.setHeader( "Location", "url" );
// 	response.setHeader( "Connection", "close" );
%>

</body>
</html>