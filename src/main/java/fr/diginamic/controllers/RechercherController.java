package fr.diginamic.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.diginamic.dao.CategorieDao;
import fr.diginamic.dao.MarqueDao;
import fr.diginamic.modeles.Marque;

@WebServlet(urlPatterns = "/rechercher/*")
public class RechercherController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String selectCatId = req.getParameter("categorie");
		CategorieDao categorieDao = new CategorieDao();
		String selectCatName = categorieDao.findCategorieNameById(Integer.parseInt(selectCatId));

		MarqueDao marqueDao = new MarqueDao();
		List<Marque> marques = marqueDao.findAllMarquesByCat(Integer.parseInt(selectCatId));

		req.setAttribute("categorieSelectionId", selectCatId);
		req.setAttribute("categorieSelectionName", selectCatName);
		req.setAttribute("listMarques", marques);

		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/rechercher.jsp");
		dispatcher.forward(req, resp);
	}
}