package fr.diginamic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.diginamic.connexion.ConnectionManager;
import fr.diginamic.exceptions.TechnicalException;
import fr.diginamic.modeles.Categorie;

public class CategorieDao {

	public List<Categorie> findAllCategories() {

		Connection conn = ConnectionManager.getInstance();
		PreparedStatement monStatement = null;
		ResultSet resultSet = null;

		List<Categorie> listeCategorie = new ArrayList<>();
		try {

			monStatement = conn.prepareStatement("SELECT * FROM categories");
			resultSet = monStatement.executeQuery();

			while (resultSet.next()) {
				Integer id = resultSet.getInt("id");
				String nom = resultSet.getString("nom");
				listeCategorie.add(new Categorie(id, nom));
			}
			return listeCategorie;

		} catch (SQLException e) {
			throw new TechnicalException("Impossible de lire les  categories", e);
		} finally {

			try {
				if (monStatement != null) {
					monStatement.close();
				}
				if (conn != null || conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				throw new TechnicalException("Impossible de fermer les connections à la BDD", e);
			}
		}

	}

	public String findCategorieNameById(Integer id) {

		Connection conn = ConnectionManager.getInstance();
		PreparedStatement monStatement = null;
		ResultSet resultSet = null;

		String categorieName = null;

		try {

			monStatement = conn.prepareStatement("SELECT * FROM categories WHERE id = " + id);
			resultSet = monStatement.executeQuery();

			while (resultSet.next()) {

				categorieName = resultSet.getString("nom");
			}
			return categorieName;

		} catch (SQLException e) {
			throw new TechnicalException("Impossible de lire les categories", e);
		} finally {

			try {
				if (monStatement != null) {
					monStatement.close();
				}
				if (conn != null || conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				throw new TechnicalException("Impossible de fermer les connections à la BDD", e);
			}
		}
	}

}
