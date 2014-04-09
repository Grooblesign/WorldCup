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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import uk.me.paulgarner.model.Match;
import uk.me.paulgarner.model.Player;
import uk.me.paulgarner.model.Team;
import uk.me.paulgarner.service.MatchService;
import uk.me.paulgarner.util.ConnectionFactory;

@Controller
public class HelloController {

	@RequestMapping(value = "/info")
	public String Info(Model model) {
		model.addAttribute("datetime", new Date().toString());
		model.addAttribute("os", System.getProperty("os.name"));
		model.addAttribute("databaseurl", System.getenv("DATABASE_URL"));

		return "info";
	}

	@RequestMapping(value = "/post", method = RequestMethod.GET)
	public String PostTest(Model model) {
		Player player = new Player();
		player.setLastname("Lampard");
		player.setFirstname("Frank");
		
		model.addAttribute("player", player);
		
		return "posttest";
	}
	
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public String PostTestPost(@ModelAttribute("player") Player player, BindingResult result) {
		System.out.println(player.getLastname());
		return "info";
	}
	
	@RequestMapping(value = "/spa")
	public String Spa(Model model) {
		return "spa";
	}
	
	@RequestMapping(value = "/matches/rest")
	public @ResponseBody List<Match> JsonMatches(Model model) throws SQLException {
	
		return (new MatchService()).findAll();
		
	}
	
	@RequestMapping(value = "/matches/rest/{index}")
	public @ResponseBody Match JsonMatch(@PathVariable int index) throws SQLException {
	
		return (new MatchService()).find(index);
		
	}
	
	@RequestMapping(value = "/matches/rest/team/{name}")
	public @ResponseBody List<Match> JsonMatchesForTeam(@PathVariable String name) throws SQLException {
	
		return (new MatchService()).findAllForTeam(name);
		
	}
	
	@RequestMapping(value = "/matches")
	public String Matches(Model model) throws SQLException {
		
		model.addAttribute("matches", (new MatchService()).findAll());
		
		return "matches";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String Save(Model model) {
		return "hello";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Index(Model model) throws SQLException {

		// DataLoader.Load();

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
