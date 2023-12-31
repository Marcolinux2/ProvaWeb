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

import it.prova.cart.Cart;
import it.prova.interfaces.Constants;

/**
 * Servlet implementation class Prova
 */
public class Prova extends HttpServlet implements Constants {
	private static final long serialVersionUID = 1L;
    private String message;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response) ;		
		response.getWriter().append("Io sono il servlet e rispondo alla GET");
		// TODO Auto-generated method stub
		
		// String name = (String) request.getAttribute("fname");
		
		String nome1 = request.getParameter("nome1");
		String cognome1 = request.getParameter("cognome1");

		String nome2 = request.getParameter("nome2");
		String cognome2 = request.getParameter("cognome2");

		request.setAttribute("PROVOLA", "ALOVORP");

		request.setAttribute("PARAM1", "Io sono il parametro UNO");
		request.setAttribute("PARAM2", "Io sono il parametro DUE");
		request.setAttribute("PARAM3", "Io sono il parametro TRE");
		
		HttpSession session =request.getSession();
		
		session.setAttribute("NOME", "Marco");
		session.setAttribute("COGNOME", "Tripolini");
		
		Cart c = new Cart();
		
		session.setAttribute(CART, c);
		
		
		// **************************************
		// RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/pagina1.jsp");
		// dispatcher.forward(request, response); 
		
		// questa sintassi equivale alle due righe precedenti.
		// getServletContext().getRequestDispatcher("/pagina1.jsp").forward(request, response);

		
		// -> forwarding di una request
		// importante perché io inizio il lavoro in un servlet
		// e lo completo in una pagina JSP/HTML
		// **************************************
		
		
		// redirect // redirezione 
		// response.sendRedirect("sub/pagina3.jsp");
		
		// FORWARD:
			// la requeste viene elaborata lato server
			// il client non ha percezione  della forward
			// requeste e response rimangono gli stessi oggetti dopo la forward mantenendo le info aggiunte
		
			// REDIRECT
				// la request viene rediretta a una altro gestore 
				// il client vede il cambio di URL
				// viene creata una nuova request con i dati originali
			
				// -> redirect 
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		// response.getWriter().append("Io sono il servlet e rispondo alla POST");
		
		String nome1 = request.getParameter("nome1");
		String cognome1 = request.getParameter("cognome1");
	
		String nome2 = request.getParameter("nome2");
		String cognome2 = request.getParameter("cognome2");
	}
}
