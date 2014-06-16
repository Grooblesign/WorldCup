package uk.me.paulgarner.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import uk.me.paulgarner.model.Team;
import uk.me.paulgarner.util.ConnectionFactory;

public class TeamService {
	public Team find(int index) throws SQLException {
		Team team = null;
		
		Connection conn = ConnectionFactory.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs;
		
		rs = st.executeQuery(String.format("SELECT \"Name\" FROM \"Teams\" WHERE \"Index\"='%s'", index));
		
		if (rs.next()) {
			team = new Team();
			team.setName(rs.getString(1));
		}

		rs.close();

		ConnectionFactory.closeConnection(conn);

		return team;
	}
}
