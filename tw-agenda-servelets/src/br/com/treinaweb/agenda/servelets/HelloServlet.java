package br.com.treinaweb.agenda.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = -2035962160055421536L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Olá apartir do servelet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Olá mundo, Bem vim do servelet!</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
