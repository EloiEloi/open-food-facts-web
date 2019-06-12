package fr.diginamic.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.diginamic.dao.ProduitDao;
import fr.diginamic.modeles.Produit;

@WebServlet(urlPatterns = "/afficher/*")
public class AfficherProduits extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String selectCatId = req.getParameter("categorieId");
		String selectCatName = req.getParameter("categorieName");

		String selectMarque = req.getParameter("marque");

		ProduitDao produitDao = new ProduitDao();
		List<Produit> produits = produitDao.findAllProduitsByMarque(Integer.parseInt(selectMarque));

		req.setAttribute("marqueSelectionId", selectMarque);

		req.setAttribute("categorieSelectionId", selectCatId);
		req.setAttribute("categorieSelectionName", selectCatName);
		req.setAttribute("listProduits", produits);

		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/afficher.jsp");
		dispatcher.forward(req, resp);
	}
}