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
		SQL.append("SELECT m.\"Index\", \"Team1\", t1.\"Name\", \"Team2\", t2.\"Name\", \"Date\", \"Time\", \"Venue\", ");
		SQL.append("\"Team1GoalsAdam\", \"Team2GoalsAdam\",");
		SQL.append("\"Team1GoalsEmily\", \"Team2GoalsEmily\",");
		SQL.append("\"Team1GoalsKyle\", \"Team2GoalsKyle\",");
		SQL.append("\"Team1GoalsLuke\", \"Team2GoalsLuke\",");
		SQL.append("\"Team1GoalsNicola\", \"Team2GoalsNicola\",");
		SQL.append("\"Team1GoalsPaul\", \"Team2GoalsPaul\",");
		SQL.append("\"Team1GoalsJohn\", \"Team2GoalsJohn\",");
		SQL.append("\"Team1Goals\", \"Team2Goals\"");
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
			
			match.setTeam1GoalsAdam(rs.getInt(9));
			match.setTeam2GoalsAdam(rs.getInt(10));

			match.setTeam1GoalsEmily(rs.getInt(11));
			match.setTeam2GoalsEmily(rs.getInt(12));
			
			match.setTeam1GoalsKyle(rs.getInt(13));
			match.setTeam2GoalsKyle(rs.getInt(14));
			
			match.setTeam1GoalsLuke(rs.getInt(15));
			match.setTeam2GoalsLuke(rs.getInt(16));
			
			match.setTeam1GoalsNicola(rs.getInt(17));
			match.setTeam2GoalsNicola(rs.getInt(18));
			
			match.setTeam1GoalsPaul(rs.getInt(19));
			match.setTeam2GoalsPaul(rs.getInt(20));
			
			match.setTeam1GoalsJohn(rs.getInt(21));
			match.setTeam2GoalsJohn(rs.getInt(22));
			
			match.setTeam1Goals(rs.getInt(23));
			match.setTeam2Goals(rs.getInt(24));

			matches.add(match);
		}

		ConnectionFactory.closeConnection(conn);
		
		return matches;
	}

	public Match find(int index) throws SQLException {
		Match match = null;
		
		Connection conn = ConnectionFactory.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs;

		StringBuilder SQL = new StringBuilder();
		SQL.append("SELECT m.\"Index\", \"Team1\", t1.\"Name\", \"Team2\", t2.\"Name\", \"Date\", \"Time\", \"Venue\"");
		SQL.append("FROM \"Matches\" m ");
		SQL.append("LEFT JOIN \"Teams\" t1 ON m.\"Team1\" = t1.\"Index\" ");
		SQL.append("LEFT JOIN \"Teams\" t2 ON m.\"Team2\" = t2.\"Index\"");
		SQL.append("WHERE m.\"Index\" = " + index);
		SQL.append("ORDER BY m.\"Index\"");

		rs = st.executeQuery(SQL.toString());
		
		if (rs.next()) {
			match = new Match();
			match.setDate(rs.getString(6));
			match.setIndex(rs.getInt(1));
			match.setTeam1Index(rs.getInt(2));
			match.setTeam1Name(rs.getString(3));
			match.setTeam2Index(rs.getInt(4));
			match.setTeam2Name(rs.getString(5));
			match.setTime(rs.getString(7));
			match.setVenue(rs.getString(8));
		}

		ConnectionFactory.closeConnection(conn);
		
		return match;
	}

	public List<Match> findAllForTeam(String name) throws SQLException {
		
		List<Match> matches = new ArrayList<Match>();
		
		Connection conn = ConnectionFactory.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs;

		StringBuilder SQL = new StringBuilder();
		SQL.append("SELECT m.\"Index\", \"Team1\", t1.\"Name\", \"Team2\", t2.\"Name\", \"Date\", \"Time\", \"Venue\"");
		SQL.append("FROM \"Matches\" m ");
		SQL.append("LEFT JOIN \"Teams\" t1 ON m.\"Team1\" = t1.\"Index\" ");
		SQL.append("LEFT JOIN \"Teams\" t2 ON m.\"Team2\" = t2.\"Index\"");
		SQL.append(String.format("WHERE t1.\"Name\" = '%s' OR t2.\"Name\" = '%s'", name, name));
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
