/**
 * 
 */
package fr.diginamic.connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import fr.diginamic.exceptions.TechnicalException;

/**
 * 
 * Class permettant de se connecter à la BDD,
 * pour y effectuer des enregistrement, modifications, suppressions...
 * 
 * @author Eloi
 *
 */
public class ConnectionManager {

	private static ResourceBundle bundle = ResourceBundle.getBundle("database");
	private static Connection conn;

	public static Connection getInstance() {
		try {
			if (conn == null || conn.isClosed()) {

				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

				conn = DriverManager.getConnection(bundle.getString("database.url"), bundle.getString("database.user"),
						bundle.getString("database.password"));
				conn.setAutoCommit(false);
			}
			return conn;
		} catch (SQLException e) {
			throw new TechnicalException("Impossible de se connecter à la BDD", e);
		}
	}

	public static String getDriverName() {
		return bundle.getString("database.driver");
	}

}