<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ciao, io sono pagina 1</title>
</head>
<body>

<p> Ciao, io sono pagina 1 </p>

<%
	out.print (request.getAttribute("PROVOLA") + "<br>");
	out.print (request.getAttribute("PARAM1") + "<br>");
	out.print (request.getAttribute("PARAM2") + "<br>");
	out.print (request.getAttribute("PARAM3") + "<br>");
	
// 	ArrayList list = new ArrayList();
// 	Iterator it = list.iterator();
// 	while (it.hasNext()) {
// 		String object = (String) it.next();
// 		out.print (object + "<br>");
// 	}

%>
<hr>
	<a href="pagina2.jsp" > pagina 2</a> <br>
	
	<form action="pagina2.jsp" method="GET">
		<input type="text" id="p1" name="p1" value="Parametro 1"><br>
		<input type="text" id="p2" name="p2" value="Parametro 2"><br><br>
		<input type="submit" value="Submit">
	</form> 

</body>
</html>