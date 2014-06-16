package uk.me.paulgarner.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import uk.me.paulgarner.model.Player;
import uk.me.paulgarner.util.ConnectionFactory;

public class PlayerService {
	public Player find(int index) throws SQLException {
		Player player = null;
		
		Connection conn = ConnectionFactory.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs;
		
		rs = st.executeQuery(String.format("SELECT \"Name\", \"TeamIndex\", \"Position\" FROM \"Players\" WHERE \"Index\"='%s'", index));
		
		if (rs.next()) {
			player = new Player();
			player.setName(rs.getString(1));
			player.setTeamIndex(rs.getInt(2));
			player.setPosition(rs.getString(3));
		}
		
		rs.close();

		ConnectionFactory.closeConnection(conn);

		return player;
	}
}
