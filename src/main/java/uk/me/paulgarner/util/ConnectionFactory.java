package uk.me.paulgarner.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class ConnectionFactory {

	static Logger logger = Logger.getLogger("uk.me.paulgarner");	
	
	public static Connection getConnection() throws SQLException {
		
		Connection conn = null;
		
		try {
			Class.forName("org.postgresql.Driver");

			if (System.getenv("DATABASE_URL") != null) {
				conn = DriverManager.getConnection(
						"jdbc:postgresql://ec2-107-20-224-35.compute-1.amazonaws.com:5432/d83nparjc40mn3",
						"cpjwhqyuffnbfl", "SXW92-4b0j8VEsb-24gXQoUJqW");

			} else {
				conn = DriverManager.getConnection(
						"jdbc:postgresql://localhost:5433/worldcup",
						"postgres", "Tazzle11!");
			}
		} catch (Exception exception) {
			logger.info(exception.getMessage());
		}
		
		return conn;
	}
		
	public static void closeConnection(Connection connection) {
		if (connection == null) return;
		try {
			connection.close();
		} catch (SQLException exception) {
			logger.info(exception.getMessage());
		}
	}
}
