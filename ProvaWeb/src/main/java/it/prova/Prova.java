package it.prova;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Prova
 */
public class Prova extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String message;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// paradigma MVC
		response.getWriter().append("Io sono il servlet e rispondo alla GET");
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/pagina1.jsp");
		
		// String name = (String) request.getAttribute("fname");
		request.setAttribute("PROVOLA", "ALOVORP");

		request.setAttribute("PARAM1", "Io sono il parametro UNO");
		request.setAttribute("PARAM2", "Io sono il parametro DUE");
		request.setAttribute("PARAM3", "Io sono il parametro TRE");

		
		
		
		// **************************************
		dispatcher.forward(request, response); 
		// -> forwarding di una request
		// **************************************
		
		
		// -> redirect 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		response.getWriter().append("Io sono il servlet e rispondo alla POST");
		
	}

}
