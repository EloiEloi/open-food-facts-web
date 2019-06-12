package fr.diginamic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.diginamic.connexion.ConnectionManager;
import fr.diginamic.exceptions.TechnicalException;
import fr.diginamic.modeles.Marque;

public class MarqueDao {

	public List<Marque> findAllMarquesByCat(Integer idCat) {

		Connection conn = ConnectionManager.getInstance();
		PreparedStatement monStatement = null;
		ResultSet resultSet = null;

		List<Marque> listeMarque = new ArrayList<>();

		try {

			monStatement = conn.prepareStatement(
					"SELECT distinct(mrq.id), mrq.nom FROM PRODUITS prd, MARQUES mrq WHERE id_mrq = mrq.id AND id_cat = "
							+ idCat);
			resultSet = monStatement.executeQuery();

			while (resultSet.next()) {
				Integer id = resultSet.getInt("id");
				String nom = resultSet.getString("nom");
				listeMarque.add(new Marque(id, nom));
			}
			return listeMarque;

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

}
