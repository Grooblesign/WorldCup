package uk.me.paulgarner.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import uk.me.paulgarner.model.Match;
import uk.me.paulgarner.model.Person;
import uk.me.paulgarner.model.Player;
import uk.me.paulgarner.model.Team;
import uk.me.paulgarner.service.MatchService;
import uk.me.paulgarner.service.PlayerService;
import uk.me.paulgarner.util.ConnectionFactory;
import uk.me.paulgarner.util.DataLoader;

@Controller
public class MainController {

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Index(Model model) throws SQLException {

		Connection conn = ConnectionFactory.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs;

		rs = st.executeQuery("SELECT \"Name\" FROM \"People\" ORDER BY \"Name\"");
		List<Person> people = new ArrayList<Person>();
		while (rs.next()) {
			if (!rs.getString(1).equalsIgnoreCase("Nicola")) {
				Person person = new Person();
				person.setName(rs.getString(1));

				people.add(person);
			}
		}

		rs.close();

		/*
		 * Person adam = people.get(0); adam.setExact(4); adam.setResult(21);
		 * adam.setBonus(12);
		 * 
		 * Person paul = people.get(6); paul.setExact(6); paul.setResult(17);
		 * paul.setBonus(11);
		 */

		ConnectionFactory.closeConnection(conn);

		List<Match> matches = (new MatchService()).findAll();

		for (Match match : matches) {
			if (match.getTeam1Goals() > -1) {
				Person person = people.get(0);
				doCalc(person, match.getTeam1Goals(), match.getTeam2Goals(),
						match.getTeam1GoalsAdam(), match.getTeam2GoalsAdam());
				person = people.get(1);
				doCalc(person, match.getTeam1Goals(), match.getTeam2Goals(),
						match.getTeam1GoalsEmily(), match.getTeam2GoalsEmily());
				person = people.get(2);
				doCalc(person, match.getTeam1Goals(), match.getTeam2Goals(),
						match.getTeam1GoalsJohn(), match.getTeam2GoalsJohn());
				person = people.get(3);
				doCalc(person, match.getTeam1Goals(), match.getTeam2Goals(),
						match.getTeam1GoalsKyle(), match.getTeam2GoalsKyle());
				person = people.get(4);
				doCalc(person, match.getTeam1Goals(), match.getTeam2Goals(),
						match.getTeam1GoalsLuke(), match.getTeam2GoalsLuke());
				person = people.get(5);
				doCalc(person, match.getTeam1Goals(), match.getTeam2Goals(),
						match.getTeam1GoalsPaul(), match.getTeam2GoalsPaul());
			}
		}

		Collections.sort(people);

		model.addAttribute("people", people);

		return "index";
	}

	private void doCalc(Person person, int team1Goals, int team2Goals,
			int personTeam1Goals, int personTeam2Goals) {
		if (team1Goals == personTeam1Goals && team2Goals == personTeam2Goals) {
			person.setExact(person.getExact() + 1);
		} else {
			// result
			if (team1Goals > team2Goals) {
				if (personTeam1Goals > personTeam2Goals) {
					person.setResult(person.getResult() + 1);
					
					if (personTeam1Goals == team1Goals || personTeam2Goals == team2Goals) {
						person.setBonus(person.getBonus() + 1);
					}
				}
			}
			if (team1Goals < team2Goals) {
				if (personTeam1Goals < personTeam2Goals) {
					person.setResult(person.getResult() + 1);

					if (personTeam1Goals == team1Goals || personTeam2Goals == team2Goals) {
						person.setBonus(person.getBonus() + 1);
					}
				}
			}
			if (team1Goals == team2Goals) {
				if (personTeam1Goals == personTeam2Goals) {
					person.setResult(person.getResult() + 1);
					
					if (personTeam1Goals == team1Goals || personTeam2Goals == team2Goals) {
						person.setBonus(person.getBonus() + 1);
					}
				}
			}
		}
	}

	@RequestMapping(value = "/predictions/{name}")
	public String predictions(Model model, @PathVariable String name)
			throws SQLException {

		model.addAttribute("name", name);

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

		List<Match> matches = (new MatchService()).findAll();

		getStats(groupA, matches, name);
		getStats(groupB, matches, name);
		getStats(groupC, matches, name);
		getStats(groupD, matches, name);
		getStats(groupE, matches, name);
		getStats(groupF, matches, name);
		getStats(groupG, matches, name);
		getStats(groupH, matches, name);

		model.addAttribute("groupA", groupA);
		model.addAttribute("groupB", groupB);
		model.addAttribute("groupC", groupC);
		model.addAttribute("groupD", groupD);
		model.addAttribute("groupE", groupE);
		model.addAttribute("groupF", groupF);
		model.addAttribute("groupG", groupG);
		model.addAttribute("groupH", groupH);

		return "predictions";

	}

	private void getStats(List<Team> group, List<Match> matches, String name) {
		for (Team team : group) {
			for (Match match : matches) {
				// John
				if (name.equalsIgnoreCase("John")) {
					if ((match.getTeam1Index() == team.getIndex())
							|| (match.getTeam2Index() == team.getIndex())) {
						if (match.getTeam1Index() == team.getIndex()) {
							if (match.getTeam1GoalsJohn() > match
									.getTeam2GoalsJohn()) {
								team.setWon(team.getWon() + 1);
								team.setPoints(team.getPoints() + 3);
							}
							if (match.getTeam1GoalsJohn() == match
									.getTeam2GoalsJohn()) {
								team.setDrawn(team.getDrawn() + 1);
								team.setPoints(team.getPoints() + 1);
							}
							if (match.getTeam1GoalsJohn() < match
									.getTeam2GoalsJohn()) {
								team.setLost(team.getLost() + 1);
							}

							team.setGoalsAgainst(team.getGoalsAgainst()
									+ match.getTeam2GoalsJohn());
							team.setGoalsFor(team.getGoalsFor()
									+ match.getTeam1GoalsJohn());
						}

						if (match.getTeam2Index() == team.getIndex()) {
							if (match.getTeam2GoalsJohn() > match
									.getTeam1GoalsJohn()) {
								team.setWon(team.getWon() + 1);
								team.setPoints(team.getPoints() + 3);
							}
							if (match.getTeam2GoalsJohn() == match
									.getTeam1GoalsJohn()) {
								team.setDrawn(team.getDrawn() + 1);
								team.setPoints(team.getPoints() + 1);
							}
							if (match.getTeam2GoalsJohn() < match
									.getTeam1GoalsJohn()) {
								team.setLost(team.getLost() + 1);
							}

							team.setGoalsAgainst(team.getGoalsAgainst()
									+ match.getTeam1GoalsJohn());
							team.setGoalsFor(team.getGoalsFor()
									+ match.getTeam2GoalsJohn());
						}
					}
				}

				// Paul
				if (name.equalsIgnoreCase("Paul")) {
					if ((match.getTeam1Index() == team.getIndex())
							|| (match.getTeam2Index() == team.getIndex())) {
						if (match.getTeam1Index() == team.getIndex()) {
							if (match.getTeam1GoalsPaul() > match
									.getTeam2GoalsPaul()) {
								team.setWon(team.getWon() + 1);
								team.setPoints(team.getPoints() + 3);
							}
							if (match.getTeam1GoalsPaul() == match
									.getTeam2GoalsPaul()) {
								team.setDrawn(team.getDrawn() + 1);
								team.setPoints(team.getPoints() + 1);
							}
							if (match.getTeam1GoalsPaul() < match
									.getTeam2GoalsPaul()) {
								team.setLost(team.getLost() + 1);
							}

							team.setGoalsAgainst(team.getGoalsAgainst()
									+ match.getTeam2GoalsPaul());
							team.setGoalsFor(team.getGoalsFor()
									+ match.getTeam1GoalsPaul());
						}

						if (match.getTeam2Index() == team.getIndex()) {
							if (match.getTeam2GoalsPaul() > match
									.getTeam1GoalsPaul()) {
								team.setWon(team.getWon() + 1);
								team.setPoints(team.getPoints() + 3);
							}
							if (match.getTeam2GoalsPaul() == match
									.getTeam1GoalsPaul()) {
								team.setDrawn(team.getDrawn() + 1);
								team.setPoints(team.getPoints() + 1);
							}
							if (match.getTeam2GoalsPaul() < match
									.getTeam1GoalsPaul()) {
								team.setLost(team.getLost() + 1);
							}

							team.setGoalsAgainst(team.getGoalsAgainst()
									+ match.getTeam1GoalsPaul());
							team.setGoalsFor(team.getGoalsFor()
									+ match.getTeam2GoalsPaul());
						}
					}
				}
			}
		}
	}

	@RequestMapping(value = "/groups", method = RequestMethod.GET)
	public String Groups(Model model) throws SQLException {

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

		return "groups";
	}

	@RequestMapping(value = "/info")
	public String Info(Model model) {
		DateTime now = new DateTime();

		model.addAttribute("datetime", now.toString());
		model.addAttribute("os", System.getProperty("os.name"));
		model.addAttribute("databaseurl", System.getenv("DATABASE_URL"));

		Authentication authentication = SecurityContextHolder.getContext()
				.getAuthentication();
		String username = authentication.getName();

		model.addAttribute("username", username);

		return "info";
	}

	@RequestMapping(value = "/matches/rest")
	public @ResponseBody
	List<Match> JsonMatches(Model model) throws SQLException {

		return (new MatchService()).findAll();

	}

	@RequestMapping(value = "/matches/rest/{index}")
	public @ResponseBody
	Match JsonMatch(@PathVariable int index) throws SQLException {

		return (new MatchService()).find(index);

	}

	@RequestMapping(value = "/matches/rest/team/{name}")
	public @ResponseBody
	List<Match> JsonMatchesForTeam(@PathVariable String name)
			throws SQLException {

		return (new MatchService()).findAllForTeam(name);

	}

	@RequestMapping(value = "/matches")
	public String Matches(Model model) throws SQLException {

		model.addAttribute("matches", (new MatchService()).findAll());

		return "matches";
	}
	
	@RequestMapping(value = "/adam", method = RequestMethod.GET)
	public String Adam(Model model) throws SQLException {
		
		model.addAttribute("person", "Adam");
		model.addAttribute("team", getPlayers("Adam"));

		return "fantasy";
	}

	@RequestMapping(value = "/kyle", method = RequestMethod.GET)
	public String Kyle(Model model) throws SQLException {
		
		model.addAttribute("person", "Kyle");
		model.addAttribute("team", getPlayers("Kyle"));

		return "fantasy";
	}

	@RequestMapping(value = "/luke", method = RequestMethod.GET)
	public String Luke(Model model) throws SQLException {
		
		model.addAttribute("person", "Luke");
		model.addAttribute("team", getPlayers("Luke"));

		return "fantasy";
	}

	@RequestMapping(value = "/paul", method = RequestMethod.GET)
	public String Paul(Model model) throws SQLException {
		
		model.addAttribute("person", "Paul");
		model.addAttribute("team", getPlayers("Paul"));

		return "fantasy";
	}

	private List<Player> getPlayers(String person)  throws SQLException {
		PlayerService service = new PlayerService();
		
		Connection conn = ConnectionFactory.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs;
		
		List<Player> players = new ArrayList<Player>();
		
		rs = st.executeQuery(String.format("SELECT \"Player1\", \"Player2\", \"Player3\", \"Player4\", \"Player5\", \"Player6\", \"Player7\", \"Player8\", \"Player9\", \"Player10\", \"Player11\" FROM \"People\" WHERE \"Name\"='%s'", person));
		rs.next();
		players.add(service.find(rs.getInt(1)));
		players.add(service.find(rs.getInt(2)));
		players.add(service.find(rs.getInt(3)));
		players.add(service.find(rs.getInt(4)));
		players.add(service.find(rs.getInt(5)));
		players.add(service.find(rs.getInt(6)));
		players.add(service.find(rs.getInt(7)));
		players.add(service.find(rs.getInt(8)));
		players.add(service.find(rs.getInt(9)));
		players.add(service.find(rs.getInt(10)));
		players.add(service.find(rs.getInt(11)));
		
		rs.close();

		ConnectionFactory.closeConnection(conn);

		return players;
	}
}
