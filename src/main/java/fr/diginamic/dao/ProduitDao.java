package fr.diginamic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.diginamic.connexion.ConnectionManager;
import fr.diginamic.exceptions.TechnicalException;
import fr.diginamic.modeles.Produit;

public class ProduitDao {

	public List<Produit> findAllProduitsByMarque(Integer idMrq) {

		Connection conn = ConnectionManager.getInstance();
		PreparedStatement monStatement = null;
		ResultSet resultSet = null;

		List<Produit> listeProduit = new ArrayList<>();

		try {

			monStatement = conn.prepareStatement("SELECT * FROM PRODUITS WHERE id_mrq = " + idMrq);
			resultSet = monStatement.executeQuery();

			while (resultSet.next()) {

				Integer id = resultSet.getInt("id");
				Integer energie = resultSet.getInt("energie");

				Integer fibre = resultSet.getInt("fibres");

				String grade = resultSet.getString("grade");

				Integer graisse = resultSet.getInt("graisse");

				String nom = resultSet.getString("nom");

				String pays = resultSet.getString("pays");

				String paysManufact = resultSet.getString("paysManufact");

				Integer proteine = resultSet.getInt("proteines");

				Integer sel = resultSet.getInt("sel");

				Integer sucre = resultSet.getInt("sucre");

				Integer idCat = resultSet.getInt("id_Cat");

				Integer idMarq = resultSet.getInt("id_Mrq");

				listeProduit.add(new Produit(id, energie, fibre, grade, graisse, nom, pays, paysManufact, proteine, sel,
						sucre, idCat, idMarq));
			}
			return listeProduit;

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
