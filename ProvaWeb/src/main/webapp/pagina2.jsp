<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ciao, io sono pagina 2</title>
</head>
<body>

<%
	String p1 = request.getParameter("p1");
	String p2 = request.getParameter("p2");
	out.print ("P1 = " + p1 + "<br>");
	out.print ("P2 = " + p2 + "<br>");
	
	out.print (request.getAttribute("PROVOLA") + "<br>");
	out.print (request.getAttribute("PARAM1") + "<br>");
	out.print (request.getAttribute("PARAM2") + "<br>");
	out.print (request.getAttribute("PARAM3") + "<br>");
	
	out.print (session.getAttribute("NOME") + "<br>");
	out.print (session.getAttribute("COGNOME") + "<br>");
	out.print (session.getId() + "<br>");
	session.setAttribute("INDIRIZZO", "VIA MAGGI");
	
%>

<hr>

<%
	// la vispa teresa
	// ha fatto la spesa
	String p3 = request.getParameter("p3");
	String p4 = request.getParameter("p4");
	out.print ("P3 = " + p1 + "<br>");
	out.print ("P4 = " + p2 + "<br>");
	
	out.print (request.getAttribute("PROVOLA") + "<br>");
	out.print (request.getAttribute("PARAM1") + "<br>");
	out.print (request.getAttribute("PARAM2") + "<br>");
	out.print (request.getAttribute("PARAM3") + "<br>");
%>

</body>
</html>