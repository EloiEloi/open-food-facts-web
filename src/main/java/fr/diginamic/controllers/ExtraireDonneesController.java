package fr.diginamic.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/login/*")
public class ExtraireDonneesController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Récupérer la session existante ou création d'une session
		HttpSession session = req.getSession(true);
		// Stocker un utilisateur
		// session.setAttribute("utilisateur", "eloi");

		// Stocker un utilisateur
		req.setAttribute("utilisateur", "eloi");

		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/reponse");
		dispatcher.forward(req, resp);

	}
}