package br.com.treinaweb.agenda.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReceberNomeMessagemServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7401058518834917079L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeUsuario = request.getParameter("nome");
		PrintWriter out = response.getWriter();
		out.println("<html>");
			out.println("<head>");
				out.println("<meta charset=\"UTF-8\">");
				out.println("<title>"+nomeUsuario+"</title>");
				
			out.println("</head>");
			out.println("<body>");
				out.println("<p>Olá, "+nomeUsuario+"</p>");
			out.println("</body>");
		out.println("</html>");
	}
	
	

}
