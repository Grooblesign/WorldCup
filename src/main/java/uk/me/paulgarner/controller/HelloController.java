package uk.me.paulgarner.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.me.paulgarner.model.Team;

@Controller
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String Save(Model model) {
		return "hello";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Index(Model model) {

		// postgres://postgres:Quizzle1792@localhost:5432/familyhistory
		// postgres://cpjwhqyuffnbfl:SXW92-4b0j8VEsb-24gXQoUJqW@ec2-107-20-224-35.compute-1.amazonaws.com:5432/d83nparjc40mn3

		try {
			Class.forName("org.postgresql.Driver");

			Connection conn = null;

			if (System.getenv("DATABASE_URL") != null) {
				conn = DriverManager.getConnection(
						"jdbc:postgresql://ec2-107-20-224-35.compute-1.amazonaws.com:5432/d83nparjc40mn3",
						"cpjwhqyuffnbfl", "SXW92-4b0j8VEsb-24gXQoUJqW");

			} else {
				conn = DriverManager.getConnection(
						"jdbc:postgresql://localhost:5433/worldcup",
						"postgres", "Tazzle11!");
			}

			Statement st = conn.createStatement();
			
			st.executeUpdate("TRUNCATE Table \"Teams\"");
			
			List<Team> teams = new ArrayList<Team>();
			teams.add(new Team("Brazil","A", 1));
			teams.add(new Team("Croatia", "A", 2));
			teams.add(new Team("Mexico", "A", 3));
			teams.add(new Team("Cameroon", "A", 4));
			teams.add(new Team("Spain", "B", 5));
			teams.add(new Team("Netherlands", "B",6));
			teams.add(new Team("Chile", "B", 7));
			teams.add(new Team("Australia", "B", 8));
			teams.add(new Team("Colombia", "C",	9));
			teams.add(new Team("Greece", "C", 10));
			teams.add(new Team("Ivory Coast", "C", 11));
			teams.add(new Team("Japan", "C", 12));
			teams.add(new Team("Uruguay", "D", 13));
			teams.add(new Team("Costa Rica", "D", 14));
			teams.add(new Team("England", "D", 15));
			teams.add(new Team("Italy", "D", 16));
			teams.add(new Team("Switzerland", "E", 17));
			teams.add(new Team("Equador", "E", 18));
			teams.add(new Team("France", "E", 19));
			teams.add(new Team("Honduras", "E",	20));
			teams.add(new Team("Argentina", "F",21));
			teams.add(new Team("Bosnia and Herzegovina", "F", 22));
			teams.add(new Team("Iran", "F",	23));
			teams.add(new Team("Nigeria", "F", 24));
			teams.add(new Team("Germany", "G", 25));
			teams.add(new Team("Portugal", "G", 26));
			teams.add(new Team("Ghana", "G", 27));
			teams.add(new Team("United States", "G", 28));
			teams.add(new Team("Belgium", "H",29));
			teams.add(new Team("Algeria", "H", 30));
			teams.add(new Team("Russia", "H", 31));
			teams.add(new Team("South Korea", "H", 32));
			
			for (Team team : teams) {
				st.executeUpdate(String.format("INSERT INTO \"Teams\" (\"Group\", \"Index\", \"Name\") VALUES ('%s', %s, '%s')", team.getGroup(), team.getIndex(), team.getName()));
			}
			
			ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM \"Teams\"");

			if (rs.next()) {
				model.addAttribute("teamcount", rs.getInt(1));
			}

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

			conn.close();

			model.addAttribute("groupA", groupA);
			model.addAttribute("groupB", groupB);
			model.addAttribute("groupC", groupC);
			model.addAttribute("groupD", groupD);
			model.addAttribute("groupE", groupE);
			model.addAttribute("groupF", groupF);
			model.addAttribute("groupG", groupG);
			model.addAttribute("groupH", groupH);

			model.addAttribute("message", "Connected");
		} catch (Exception exception) {
			model.addAttribute("message",
					"Exception: " + exception.getMessage());
		}

		return "index";
	}

	@RequestMapping(value = "/info")
	public String SayHello(Model model) {
		model.addAttribute("datetime", new Date().toString());
		model.addAttribute("os", System.getProperty("os.name"));
		model.addAttribute("databaseurl", System.getenv("DATABASE_URL"));

		return "info";
	}
}
