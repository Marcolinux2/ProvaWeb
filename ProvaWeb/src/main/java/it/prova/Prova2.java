package it.prova;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Prova2
 */
public class Prova2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Prova2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Io sono la classe Prova2");
		HttpSession session = request.getSession();
		
		String nome = request.getParameter("fname");
		String cognome = request.getParameter("fname");
		String indirizzo = request.getParameter("fname");
		String telefono = request.getParameter("fname");

		// -> validazione lato client
		// dati non nulli
		// -> validazione lato server 
		// verifiche formali
		
		// se i dati non sono correttamente compilati -> messaggio opportuno

		// altrimenti li inseriamo
		// altrimenti li inseriamo
		
		// Nome e Cognome 
		
		
		String variabile = (String) session.getAttribute("VARIABILEDIPROVA");
		System.out.println(variabile);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
