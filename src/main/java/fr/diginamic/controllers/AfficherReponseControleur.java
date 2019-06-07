package fr.diginamic.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/reponse/*")
public class AfficherReponseControleur extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// HttpSession session = req.getSession(true);

		// Récupérer une valeur stockée
		Object utilisateur = req.getAttribute("utilisateur");

		// Récupérer une valeur stockée
		// Object utilisateur = session.getAttribute("utilisateur");

		// code HTML ecrit dans le corps de la reponse
		resp.getWriter().write(
				"<h1>Categorie à extraire</h1>" + "<ul>" + "<li>vous etes : " + utilisateur.toString() + "</li></ul>");

	}

}
