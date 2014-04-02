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

@Controller
public class HelloController {

	@RequestMapping(value="/")
	public String Index(Model model) {
		model.addAttribute("datetime", new Date().toString());
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

			rs = st.executeQuery("SELECT \"Name\" FROM \"Teams\"");
			
			List<String> teams = new ArrayList<String>();
			
			while (rs.next()) {
				teams.add(rs.getString(1));
			}
			
			rs.close();

			conn.close();

			model.addAttribute("teams", teams);
			
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
