package it.prova;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
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
     * @see HttpServlet#HttpServlet()
     */
    public Prova() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		message = "Hello World!";
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Io sono il servlet e rispondo in GET");
		
		HttpSession session = request.getSession();
		session.setAttribute("VARIABILEDIPROVA", "LA VISPA TERESA HA FATTO LA SPESA");
		
		// tipo di risposta
		response.setContentType("text/html");
		
		// Logica applicativa
		PrintWriter out = response.getWriter();
		
		// out.println("<h1>" + message + "</h1" );
		
		String parametro1 = request.getParameter("fname");
		String parametro2 = request.getParameter("lname");
		
		out.println("<h1>" + parametro1 + "</h1" );
		out.println("<h1>" + parametro2 + "</h1" );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		response.getWriter().append("Io sono il servlet e rispondo in POST");
		
	}

}
