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
		
		rs = st.executeQuery(String.format("SELECT \"Name\", \"TeamIndex\", \"Position\", \"Assists\", \"CleanSheets\", \"Full\", \"Goals\", \"Half\", \"PenaltyMiss\", \"RedCards\", \"YellowCards\" FROM \"Players\" WHERE \"Index\"='%s'", index));
		
		if (rs.next()) {
			player = new Player();
			player.setName(rs.getString(1));
			player.setTeamIndex(rs.getInt(2));
			player.setPosition(rs.getString(3));
			player.setAssists(rs.getInt(4));
			player.setCleanSheets(rs.getInt(5));
			player.setFull(rs.getInt(6));
			player.setGoals(rs.getInt(7));
			player.setHalf(rs.getInt(8));
			player.setPenaltyMiss(rs.getInt(9));
			player.setRedCards(rs.getInt(10));
			player.setYellowCards(rs.getInt(11));
		}
		
		rs.close();

		ConnectionFactory.closeConnection(conn);

		return player;
	}
}
