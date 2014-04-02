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

import uk.me.paulgarner.model.Team;

@Controller
public class HelloController {

	@RequestMapping(value="/")
	public String Index(Model model) {
		model.addAttribute("datetime", new Date().toString());
		model.addAttribute("os", System.getProperty("os.name"));
		model.addAttribute("databaseurl", System.getenv("DATABASE_URL"));

		// postgres://postgres:Quizzle1792@localhost:5432/familyhistory
		// postgres://cpjwhqyuffnbfl:SXW92-4b0j8VEsb-24gXQoUJqW@ec2-107-20-224-35.compute-1.amazonaws.com:5432/d83nparjc40mn3
		
		try {
			Class.forName("org.postgresql.Driver");

			Connection conn = DriverManager.getConnection(
				"jdbc:postgresql://ec2-107-20-224-35.compute-1.amazonaws.com:5432/d83nparjc40mn3",
				"cpjwhqyuffnbfl", "SXW92-4b0j8VEsb-24gXQoUJqW");

			/*
			DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/familyhistory",
					"postgres", "Quizzle1792");
			*/
			
			Statement st = conn.createStatement();
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
			model.addAttribute("message", "Exception: " + exception.getMessage());
		}
		
		return "index";
	}

	@RequestMapping(value = "/greeting")
	public String SayHello(Model model) {
		model.addAttribute("greeting", "Hello World");
		model.addAttribute("datetime", new Date().toString());

		return "hello";
	}
}
