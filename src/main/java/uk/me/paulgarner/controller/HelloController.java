package uk.me.paulgarner.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.me.paulgarner.model.Match;
import uk.me.paulgarner.model.Team;
import uk.me.paulgarner.util.ConnectionFactory;
import uk.me.paulgarner.util.DataLoader;

@Controller
public class HelloController {

	@RequestMapping(value = "/info")
	public String Info(Model model) {
		model.addAttribute("datetime", new Date().toString());
		model.addAttribute("os", System.getProperty("os.name"));
		model.addAttribute("databaseurl", System.getenv("DATABASE_URL"));

		return "info";
	}

	@RequestMapping(value = "/matches")
	public String Matches(Model model) throws SQLException {
		/*
		SELECT m."Index", "Team1", t1."Name", "Team2", t2."Name", "Date", "Time", "Venue"
		  FROM "Matches" m LEFT JOIN "Teams" t1 ON m."Team1" = t1."Index" LEFT JOIN "Teams" t2 ON m."Team2" = t2."Index"
		*/
		
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
		
		List<Match> matches = new ArrayList<Match>();
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
		
		model.addAttribute("matches", matches);
		
		return "matches";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String Save(Model model) {
		return "hello";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Index(Model model) throws SQLException {

		DataLoader.Load();

		Connection conn = ConnectionFactory.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs;

		rs = st.executeQuery("SELECT \"Group\", \"Index\", \"Name\" FROM \"Teams\" WHERE \"Group\"='A' ORDER BY \"Index\"");
		List<Team> groupA = new ArrayList<Team>();
		while (rs.next()) {
			Team team = new Team();
			team.setGroup(rs.getString(1));
			team.setIndex(rs.getInt(2));
			team.setName(rs.getString(3));

			groupA.add(team);
		}

		rs = st.executeQuery("SELECT \"Group\", \"Index\", \"Name\" FROM \"Teams\" WHERE \"Group\"='B' ORDER BY \"Index\"");
		List<Team> groupB = new ArrayList<Team>();
		while (rs.next()) {
			Team team = new Team();
			team.setGroup(rs.getString(1));
			team.setIndex(rs.getInt(2));
			team.setName(rs.getString(3));

			groupB.add(team);
		}

		rs = st.executeQuery("SELECT \"Group\", \"Index\", \"Name\" FROM \"Teams\" WHERE \"Group\"='C' ORDER BY \"Index\"");
		List<Team> groupC = new ArrayList<Team>();
		while (rs.next()) {
			Team team = new Team();
			team.setGroup(rs.getString(1));
			team.setIndex(rs.getInt(2));
			team.setName(rs.getString(3));

			groupC.add(team);
		}

		rs = st.executeQuery("SELECT \"Group\", \"Index\", \"Name\" FROM \"Teams\" WHERE \"Group\"='D' ORDER BY \"Index\"");
		List<Team> groupD = new ArrayList<Team>();
		while (rs.next()) {
			Team team = new Team();
			team.setGroup(rs.getString(1));
			team.setIndex(rs.getInt(2));
			team.setName(rs.getString(3));

			groupD.add(team);
		}

		rs = st.executeQuery("SELECT \"Group\", \"Index\", \"Name\" FROM \"Teams\" WHERE \"Group\"='E' ORDER BY \"Index\"");
		List<Team> groupE = new ArrayList<Team>();
		while (rs.next()) {
			Team team = new Team();
			team.setGroup(rs.getString(1));
			team.setIndex(rs.getInt(2));
			team.setName(rs.getString(3));

			groupE.add(team);
		}

		rs = st.executeQuery("SELECT \"Group\", \"Index\", \"Name\" FROM \"Teams\" WHERE \"Group\"='F' ORDER BY \"Index\"");
		List<Team> groupF = new ArrayList<Team>();
		while (rs.next()) {
			Team team = new Team();
			team.setGroup(rs.getString(1));
			team.setIndex(rs.getInt(2));
			team.setName(rs.getString(3));

			groupF.add(team);
		}

		rs = st.executeQuery("SELECT \"Group\", \"Index\", \"Name\" FROM \"Teams\" WHERE \"Group\"='G' ORDER BY \"Index\"");
		List<Team> groupG = new ArrayList<Team>();
		while (rs.next()) {
			Team team = new Team();
			team.setGroup(rs.getString(1));
			team.setIndex(rs.getInt(2));
			team.setName(rs.getString(3));

			groupG.add(team);
		}

		rs = st.executeQuery("SELECT \"Group\", \"Index\", \"Name\" FROM \"Teams\" WHERE \"Group\"='H' ORDER BY \"Index\"");
		List<Team> groupH = new ArrayList<Team>();
		while (rs.next()) {
			Team team = new Team();
			team.setGroup(rs.getString(1));
			team.setIndex(rs.getInt(2));
			team.setName(rs.getString(3));

			groupH.add(team);
		}

		rs.close();

		ConnectionFactory.closeConnection(conn);

		model.addAttribute("groupA", groupA);
		model.addAttribute("groupB", groupB);
		model.addAttribute("groupC", groupC);
		model.addAttribute("groupD", groupD);
		model.addAttribute("groupE", groupE);
		model.addAttribute("groupF", groupF);
		model.addAttribute("groupG", groupG);
		model.addAttribute("groupH", groupH);

		model.addAttribute("message", "Connected");

		return "index";
	}
}
