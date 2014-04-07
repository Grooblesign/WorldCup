package uk.me.paulgarner.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import uk.me.paulgarner.model.Match;
import uk.me.paulgarner.util.ConnectionFactory;

public class MatchService {

	public List<Match> findAll() throws SQLException {
		List<Match> matches = new ArrayList<Match>();
		
		Connection conn = ConnectionFactory.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs;

		StringBuilder SQL = new StringBuilder();
		SQL.append("SELECT m.\"Index\", \"Team1\", t1.\"Name\", \"Team2\", t2.\"Name\", \"Date\", \"Time\", \"Venue\"");
		SQL.append("FROM \"Matches\" m ");
		SQL.append("LEFT JOIN \"Teams\" t1 ON m.\"Team1\" = t1.\"Index\" ");
		SQL.append("LEFT JOIN \"Teams\" t2 ON m.\"Team2\" = t2.\"Index\"");
		SQL.append("ORDER BY m.\"Index\"");

		rs = st.executeQuery(SQL.toString());
		
		while (rs.next()) {
			Match match = new Match();
			match.setDate(rs.getString(6));
			match.setIndex(rs.getInt(1));
			match.setTeam1Index(rs.getInt(2));
			match.setTeam1Name(rs.getString(3));
			match.setTeam2Index(rs.getInt(4));
			match.setTeam2Name(rs.getString(5));
			match.setTime(rs.getString(7));
			match.setVenue(rs.getString(8));

			matches.add(match);
		}

		ConnectionFactory.closeConnection(conn);
		
		return matches;
	}
}
