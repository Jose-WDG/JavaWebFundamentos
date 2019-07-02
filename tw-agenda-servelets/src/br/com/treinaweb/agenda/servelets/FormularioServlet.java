package br.com.treinaweb.agenda.servelets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormularioServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3065601288408989962L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispacher = req.getServletContext().getRequestDispatcher("/WEB-INF/Views/formMensagem.jsp");
		dispacher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispacher = req.getServletContext().getRequestDispatcher("/WEB-INF/Views/resulMensagen.jsp");
		dispacher.forward(req, resp);
	}

}
