package uk.me.paulgarner.util;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import uk.me.paulgarner.model.Constants;
import uk.me.paulgarner.model.Match;
import uk.me.paulgarner.model.Player;
import uk.me.paulgarner.model.Team;

public class DataLoader {

	// static Logger logger = Logger.getLogger("uk.me.paulgarner");

	public static void Load() {
		try {
			Connection conn = ConnectionFactory.getConnection();
			Statement st = conn.createStatement();

			System.out.println("In data loader");
			
			st.executeUpdate("TRUNCATE Table \"People\"");
			
			String[] people = new String[] {"Adam", "Emily", "John", "Kyle", "Luke", "Nicola", "Paul" };

			for (String person : people) {
				st.executeUpdate(String
						.format("INSERT INTO \"People\" (\"Name\") VALUES ('%s')",
								person));
			}
			
			st.executeUpdate("UPDATE \"People\" SET \"Fantasy\" = true WHERE \"Name\" = 'Adam'");
			st.executeUpdate("UPDATE \"People\" SET \"Player1\" = 20 WHERE \"Name\" = 'Adam'");
			st.executeUpdate("UPDATE \"People\" SET \"Player2\" = 28 WHERE \"Name\" = 'Adam'");
			st.executeUpdate("UPDATE \"People\" SET \"Player3\" = 29 WHERE \"Name\" = 'Adam'");
			st.executeUpdate("UPDATE \"People\" SET \"Player4\" = 13 WHERE \"Name\" = 'Adam'");
			st.executeUpdate("UPDATE \"People\" SET \"Player5\" = 2 WHERE \"Name\" = 'Adam'");
			st.executeUpdate("UPDATE \"People\" SET \"Player6\" = 23 WHERE \"Name\" = 'Adam'");
			st.executeUpdate("UPDATE \"People\" SET \"Player7\" = 30 WHERE \"Name\" = 'Adam'");
			st.executeUpdate("UPDATE \"People\" SET \"Player8\" = 7 WHERE \"Name\" = 'Adam'");
			st.executeUpdate("UPDATE \"People\" SET \"Player9\" = 11 WHERE \"Name\" = 'Adam'");
			st.executeUpdate("UPDATE \"People\" SET \"Player10\" = 31 WHERE \"Name\" = 'Adam'");
			st.executeUpdate("UPDATE \"People\" SET \"Player11\" = 9 WHERE \"Name\" = 'Adam'");
			
			st.executeUpdate("UPDATE \"People\" SET \"Fantasy\" = true WHERE \"Name\" = 'Kyle'");
			st.executeUpdate("UPDATE \"People\" SET \"Player1\" = 12 WHERE \"Name\" = 'Kyle'");
			st.executeUpdate("UPDATE \"People\" SET \"Player2\" = 13 WHERE \"Name\" = 'Kyle'");
			st.executeUpdate("UPDATE \"People\" SET \"Player3\" = 14 WHERE \"Name\" = 'Kyle'");
			st.executeUpdate("UPDATE \"People\" SET \"Player4\" = 15 WHERE \"Name\" = 'Kyle'");
			st.executeUpdate("UPDATE \"People\" SET \"Player5\" = 16 WHERE \"Name\" = 'Kyle'");
			st.executeUpdate("UPDATE \"People\" SET \"Player6\" = 17 WHERE \"Name\" = 'Kyle'");
			st.executeUpdate("UPDATE \"People\" SET \"Player7\" = 18 WHERE \"Name\" = 'Kyle'");
			st.executeUpdate("UPDATE \"People\" SET \"Player8\" = 27 WHERE \"Name\" = 'Kyle'");
			st.executeUpdate("UPDATE \"People\" SET \"Player9\" = 6 WHERE \"Name\" = 'Kyle'");
			st.executeUpdate("UPDATE \"People\" SET \"Player10\" = 11 WHERE \"Name\" = 'Kyle'");
			st.executeUpdate("UPDATE \"People\" SET \"Player11\" = 19 WHERE \"Name\" = 'Kyle'");
			
			st.executeUpdate("UPDATE \"People\" SET \"Fantasy\" = true WHERE \"Name\" = 'Luke'");
			st.executeUpdate("UPDATE \"People\" SET \"Player1\" = 20 WHERE \"Name\" = 'Luke'");
			st.executeUpdate("UPDATE \"People\" SET \"Player2\" = 5 WHERE \"Name\" = 'Luke'");
			st.executeUpdate("UPDATE \"People\" SET \"Player3\" = 2 WHERE \"Name\" = 'Luke'");
			st.executeUpdate("UPDATE \"People\" SET \"Player4\" = 21 WHERE \"Name\" = 'Luke'");
			st.executeUpdate("UPDATE \"People\" SET \"Player5\" = 22 WHERE \"Name\" = 'Luke'");
			st.executeUpdate("UPDATE \"People\" SET \"Player6\" = 23 WHERE \"Name\" = 'Luke'");
			st.executeUpdate("UPDATE \"People\" SET \"Player7\" = 24 WHERE \"Name\" = 'Luke'");
			st.executeUpdate("UPDATE \"People\" SET \"Player8\" = 7 WHERE \"Name\" = 'Luke'");
			st.executeUpdate("UPDATE \"People\" SET \"Player9\" = 25 WHERE \"Name\" = 'Luke'");
			st.executeUpdate("UPDATE \"People\" SET \"Player10\" = 11 WHERE \"Name\" = 'Luke'");
			st.executeUpdate("UPDATE \"People\" SET \"Player11\" = 26 WHERE \"Name\" = 'Luke'");
			
			st.executeUpdate("UPDATE \"People\" SET \"Fantasy\" = true WHERE \"Name\" = 'Paul'");
			st.executeUpdate("UPDATE \"People\" SET \"Player1\" = 1 WHERE \"Name\" = 'Paul'");
			st.executeUpdate("UPDATE \"People\" SET \"Player2\" = 2 WHERE \"Name\" = 'Paul'");
			st.executeUpdate("UPDATE \"People\" SET \"Player3\" = 3 WHERE \"Name\" = 'Paul'");
			st.executeUpdate("UPDATE \"People\" SET \"Player4\" = 4 WHERE \"Name\" = 'Paul'");
			st.executeUpdate("UPDATE \"People\" SET \"Player5\" = 5 WHERE \"Name\" = 'Paul'");
			st.executeUpdate("UPDATE \"People\" SET \"Player6\" = 6 WHERE \"Name\" = 'Paul'");
			st.executeUpdate("UPDATE \"People\" SET \"Player7\" = 7 WHERE \"Name\" = 'Paul'");
			st.executeUpdate("UPDATE \"People\" SET \"Player8\" = 8 WHERE \"Name\" = 'Paul'");
			st.executeUpdate("UPDATE \"People\" SET \"Player9\" = 9 WHERE \"Name\" = 'Paul'");
			st.executeUpdate("UPDATE \"People\" SET \"Player10\" = 10 WHERE \"Name\" = 'Paul'");
			st.executeUpdate("UPDATE \"People\" SET \"Player11\" = 11 WHERE \"Name\" = 'Paul'");

			st.executeUpdate("UPDATE \"People\" SET \"Fantasy\" = false WHERE \"Name\" = 'Emily'");
			st.executeUpdate("UPDATE \"People\" SET \"Fantasy\" = false WHERE \"Name\" = 'John'");
			st.executeUpdate("UPDATE \"People\" SET \"Fantasy\" = false WHERE \"Name\" = 'Nicola'");

			st.executeUpdate("TRUNCATE Table \"Teams\"");

			List<Team> teams = new ArrayList<Team>();
			teams.add(new Team("Brazil", "A", 1));
			teams.add(new Team("Croatia", "A", 2));
			teams.add(new Team("Mexico", "A", 3));
			teams.add(new Team("Cameroon", "A", 4));
			teams.add(new Team("Spain", "B", 5));
			teams.add(new Team("Netherlands", "B", 6));
			teams.add(new Team("Chile", "B", 7));
			teams.add(new Team("Australia", "B", 8));
			teams.add(new Team("Colombia", "C", 9));
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
			teams.add(new Team("Honduras", "E", 20));
			teams.add(new Team("Argentina", "F", 21));
			teams.add(new Team("Bosnia and Herzegovina", "F", 22));
			teams.add(new Team("Iran", "F", 23));
			teams.add(new Team("Nigeria", "F", 24));
			teams.add(new Team("Germany", "G", 25));
			teams.add(new Team("Portugal", "G", 26));
			teams.add(new Team("Ghana", "G", 27));
			teams.add(new Team("United States", "G", 28));
			teams.add(new Team("Belgium", "H", 29));
			teams.add(new Team("Algeria", "H", 30));
			teams.add(new Team("Russia", "H", 31));
			teams.add(new Team("South Korea", "H", 32));

			for (Team team : teams) {
				st.executeUpdate(String
						.format("INSERT INTO \"Teams\" (\"Group\", \"Index\", \"Name\") VALUES ('%s', %s, '%s')",
								team.getGroup(), team.getIndex(),
								team.getName()));
			}

			st.executeUpdate("TRUNCATE Table \"Players\"");

			List<Player> players = new ArrayList<Player>();
			Player player = null;
			
			player = new Player();
			player.setIndex(1);
			player.setName("Iker Casillas");
			player.setPosition("G");
			player.setTeamIndex(Constants.SPAIN);
			
			// Spain vs Netherlands
			player.setFull(player.getFull() + 1);
			player.setYellowCards(player.getYellowCards() + 1);
			
			// Spain vs Chile
			player.setFull(player.getFull() + 1);
			
			// v Aus
			// DNP

			players.add(player);

			player = new Player();
			player.setIndex(2);
			player.setName("Sergio Ramos");
			player.setPosition("D");
			player.setTeamIndex(Constants.SPAIN);
			
			// Spain vs Netherlands
			player.setFull(player.getFull() + 1);

			// Spain vs Chile
			player.setFull(player.getFull() + 1);
			
			// v Aus
			player.setCleanSheets(player.getCleanSheets() + 1);
			player.setFull(player.getFull() + 1);
			player.setYellowCards(player.getYellowCards() + 1);

			players.add(player);

			player = new Player();
			player.setIndex(3);
			player.setName("David Luiz");
			player.setPosition("D");
			player.setTeamIndex(Constants.BRAZIL);
			
			// Brazil v Croatia
			player.setFull(player.getFull() + 1);
			
			// Brazil v Mexico
			player.setFull(player.getFull() + 1);
			player.setCleanSheets(player.getCleanSheets() + 1);
			
			// Brazil v Cam
			player.setFull(player.getFull() + 1);
			player.setAssists(player.getAssists() + 1);
			
			players.add(player);

			player = new Player();
			player.setIndex(4);
			player.setName("Pablo Zabaleta");
			player.setPosition("D");
			player.setTeamIndex(Constants.ARGENTINA);
			
			// Argentina v Bosnia
			player.setFull(player.getFull() + 1);
			
			// v Iran
			player.setFull(player.getFull() + 1);
			
			// vs Nigeria
			player.setFull(player.getFull() + 1);
			
			players.add(player);

			player = new Player();
			player.setIndex(5);
			player.setName("Daniel Alves");
			player.setPosition("D");
			player.setTeamIndex(Constants.BRAZIL);
			
			// Brazil v Croatia
			player.setFull(player.getFull() + 1);
			
			// Brazil v Mexico
			player.setFull(player.getFull() + 1);
			player.setCleanSheets(player.getCleanSheets() + 1);
			
			// Brazil v Cam
			player.setFull(player.getFull() + 1);
			
			players.add(player);

			player = new Player();
			player.setIndex(6);
			player.setName("Arjen Robben");
			player.setPosition("M");
			player.setTeamIndex(Constants.NETHERLANDS);
			
			// Spain v Netherland
			player.setFull(player.getFull() + 1);
			player.setGoals(player.getGoals() + 2);
			
			// Neth vs Aus
			player.setFull(player.getFull() + 1);
			player.setGoals(player.getGoals() + 1);
			
			// vs Chile
			player.setFull(player.getFull() + 1);
			player.setAssists(player.getAssists() + 1);
			
			players.add(player);

			player = new Player();
			player.setIndex(7);
			player.setName("Andres Iniesta");
			player.setPosition("M");
			player.setTeamIndex(Constants.SPAIN);
			
			// Spain v Netherlands
			player.setFull(player.getFull() + 1);
			
			// Spain vs Chile
			player.setFull(player.getFull() + 1);
			
			// vs Aus
			player.setAssists(player.getAssists() + 1);
			player.setFull(player.getFull() + 1);
			
			
			players.add(player);

			player = new Player();
			player.setIndex(8);
			player.setName("Andrea Pirlo");
			player.setPosition("M");
			player.setTeamIndex(Constants.ITALY);

			// Italy v England
			player.setFull(player.getFull() + 1);
			
			// Italy v Costa Rica
			player.setFull(player.getFull() + 1);
			
			// vs URU
			player.setFull(player.getFull() + 1);

			players.add(player);

			player = new Player();
			player.setIndex(9);
			player.setName("Lionel Messi");
			player.setPosition("F");
			player.setTeamIndex(Constants.ARGENTINA);
			
			// Argentina v Bosnia
			player.setFull(player.getFull() + 1);
			player.setGoals(player.getGoals() + 1);
			
			// Argentina v Iran
			player.setFull(player.getFull() + 1);
			player.setGoals(player.getGoals() + 1);
			
			// Argentina v Nigeria
			player.setFull(player.getFull() + 1);
			player.setGoals(player.getGoals() + 2);

			players.add(player);

			player = new Player();
			player.setIndex(10);
			player.setName("Sergio Aguero");
			player.setPosition("F");
			player.setTeamIndex(Constants.ARGENTINA);
			
			// Argentina v Bosnia
			player.setFull(player.getFull() + 1);
			
			// v Iran
			player.setFull(player.getFull() + 1);
			
			// vs Nigeria
			player.setHalf(player.getHalf() + 1);

			players.add(player);

			player = new Player();
			player.setIndex(11);
			player.setName("Neymar");
			player.setPosition("F");
			player.setTeamIndex(Constants.BRAZIL);
			
			// Brazil v Croatia
			player.setFull(player.getFull() + 1);
			player.setGoals(player.getGoals() + 2);
			player.setYellowCards(player.getYellowCards() + 1);
			
			// Brazil v Mexico
			player.setFull(player.getFull() + 1);
			
			// Brazil v Cam
			player.setFull(player.getFull() + 1);
			player.setGoals(player.getGoals() + 2);
			
			players.add(player);
			
			player = new Player();
			player.setIndex(12);
			player.setName("Manuel Neuer");
			player.setPosition("G");
			player.setTeamIndex(Constants.GERMANY);
			
			// Germany v Portugal
			player.setCleanSheets(player.getCleanSheets() + 1);
			player.setFull(player.getFull() + 1);
			
			// v Ghana
			player.setFull(player.getFull() + 1);
			
			// v 
			
			players.add(player);

			player = new Player();
			player.setIndex(13);
			player.setName("Philipp Lahm");
			player.setPosition("D");
			player.setTeamIndex(Constants.GERMANY);
			
			// Germany v Portugal
			player.setCleanSheets(player.getCleanSheets() + 1);
			player.setFull(player.getFull() + 1);
			
			// v Ghana
			player.setFull(player.getFull() + 1);
			
			players.add(player);

			player = new Player();
			player.setIndex(14);
			player.setName("Dante");
			player.setPosition("D");
			player.setTeamIndex(Constants.BRAZIL);
			
			// Brazil v Croatia
			// DNP
			
			// Brazil v Mexico
			// DNP
			
			// vs Cameroon
			// DNP
			
			players.add(player);
			
			player = new Player();
			player.setIndex(15);
			player.setName("Gary Cahill");
			player.setPosition("D");
			player.setTeamIndex(Constants.ENGLAND);
			
			// Italy v England
			player.setFull(player.getFull() + 1);
			
			// England v Uru
			player.setFull(player.getFull() + 1);
			
			// vs Costa
			player.setCleanSheets(player.getCleanSheets() + 1);
			player.setFull(player.getFull() + 1);
			
			
			players.add(player);

			player = new Player();
			player.setIndex(16);
			player.setName("Cesc Fabregas");
			player.setPosition("M");
			player.setTeamIndex(Constants.SPAIN);
			
			// DNP
			// DNP
			// DNP
			
			players.add(player);

			player = new Player();
			player.setIndex(17);
			player.setName("Yaya Toure");
			player.setPosition("M");
			player.setTeamIndex(Constants.IVORY_COAST);
			
			// IC v JAP
			player.setFull(player.getFull() + 1);
			
			// IC v COL
			player.setFull(player.getFull() + 1);
			
			// vs GRE
			player.setFull(player.getFull() + 1);

			players.add(player);

			player = new Player();
			player.setIndex(18);
			player.setName("Steven Gerrard");
			player.setPosition("M");
			player.setTeamIndex(Constants.ENGLAND);
			
			// Italy v England
			player.setFull(player.getFull() + 1);
			
			// ENG v URU
			player.setFull(player.getFull() + 1);
			player.setYellowCards(player.getYellowCards() + 1);
			
			// vs Costa
			player.setHalf(player.getHalf() + 1);
			
			
			players.add(player);

			player = new Player();
			player.setIndex(19);
			player.setName("Mario Mandzukic");
			player.setPosition("F");
			player.setTeamIndex(Constants.CROATIA);
			
			// DNP
			
			// CAm v CRO
			player.setFull(player.getFull() + 1);
			player.setGoals(player.getGoals() + 2);
			
			// vs Mex
			player.setFull(player.getFull() + 1);
			
			players.add(player);
			
			player = new Player();
			player.setIndex(20);
			player.setName("Thibaut Courtois");
			player.setPosition("G");
			player.setTeamIndex(Constants.BELGIUM);
			
			// Bel v Alg
			player.setFull(player.getFull() + 1);
			
			// vs Rus
			player.setCleanSheets(player.getCleanSheets() + 1);
			player.setFull(player.getFull() + 1);
			
			players.add(player);

			player = new Player();
			player.setIndex(21);
			player.setName("Eliaquim Mangala");
			player.setPosition("D");
			player.setTeamIndex(Constants.FRANCE);
			
			// DNP
			
			// v SWI
			// DNP
			
			players.add(player);

			player = new Player();
			player.setIndex(22);
			player.setName("Jordi Alba");
			player.setPosition("D");
			player.setTeamIndex(Constants.SPAIN);
			
			// Spain v Netherlands
			player.setFull(player.getFull() + 1);
			
			// Spain vs Chile
			player.setFull(player.getFull() + 1);
			
			// vs Aus
			player.setFull(player.getFull() + 1);
			
			players.add(player);

			player = new Player();
			player.setIndex(23);
			player.setName("Paul Pogba");
			player.setPosition("M");
			player.setTeamIndex(Constants.FRANCE);
			
			// France v Honduras
			player.setFull(player.getFull() + 1);
			player.setYellowCards(player.getYellowCards() + 1);
			
			// v SWi
			// DNP
			
			players.add(player);
			
			player = new Player();
			player.setIndex(24);
			player.setName("Thomas Muller");
			player.setPosition("M");
			player.setTeamIndex(Constants.GERMANY);
			
			// Germany v Portugal
			player.setFull(player.getFull() + 1);
			player.setGoals(player.getGoals() + 3);
				
			// v Ghana
			player.setFull(player.getFull() + 1);
			player.setAssists(player.getAssists() + 1);

			
			players.add(player);
			
			player = new Player();
			player.setIndex(25);
			player.setName("Cristiano Ronaldo");
			player.setPosition("F");
			player.setTeamIndex(Constants.PORTUGAL);
			
			// Germany v Portugal
			player.setFull(player.getFull() + 1);
			
			// vs USA
			player.setAssists(player.getAssists() + 1);
			player.setFull(player.getFull() + 1);
			
			players.add(player);

			player = new Player();
			player.setIndex(26);
			player.setName("Ezequiel Lavezzi");
			player.setPosition("F");
			player.setTeamIndex(Constants.ARGENTINA);
			
			// Argentina v Bosnia
			// DNP
			
			// v Iran
			player.setFull(player.getFull() + 1);
			
			// vs Nigeria
			// DNP
			
			players.add(player);
			
			player = new Player();
			player.setIndex(27);
			player.setName("Mesut Ozil");
			player.setPosition("M");
			player.setTeamIndex(Constants.GERMANY);
			
			// Germany v Portugal
			player.setFull(player.getFull() + 1);
			// v Ghana
			player.setFull(player.getFull() + 1);
			
			players.add(player);
			
			player = new Player();
			player.setIndex(28);
			player.setName("Thiago Silva");
			player.setPosition("D");
			player.setTeamIndex(Constants.BRAZIL);
			
			// Brazil v Croatia
			player.setFull(player.getFull() + 1);
			
			// Brazil v Mexico
			player.setCleanSheets(player.getCleanSheets() + 1);
			player.setFull(player.getFull() + 1);
			player.setYellowCards(player.getYellowCards() + 1);
			
			//  vs Cam
			player.setFull(player.getFull() + 1);
			
			players.add(player);
			
			player = new Player();
			player.setIndex(29);
			player.setName("Laurent Koscielny");
			player.setPosition("D");
			player.setTeamIndex(Constants.FRANCE);
			
			// DNP
			
			// v SWI
			player.setHalf(player.getHalf() + 1);
			
			players.add(player);

			player = new Player();
			player.setIndex(30);
			player.setName("Eden Hazard");
			player.setPosition("M");
			player.setTeamIndex(Constants.BELGIUM);

			// BEL v ALG
			player.setAssists(player.getAssists() + 1);
			player.setFull(player.getFull() + 1);
			
			// BEL v RUS
			player.setAssists(player.getAssists() + 1);
			player.setFull(player.getFull() + 1);

			players.add(player);
			
			player = new Player();
			player.setIndex(31);
			player.setName("Luis Suarez");
			player.setPosition("A");
			player.setTeamIndex(Constants.URUGUAY);
			
			// DNP
			
			// U v E
			player.setFull(player.getFull() + 1);
			player.setGoals(player.getGoals() + 2);
			
			// vs ITA
			player.setFull(player.getFull() + 1);
			
			players.add(player);
			

			for (Player thisPlayer : players) {
				st.executeUpdate(String
						.format("INSERT INTO \"Players\" (\"Index\", \"Name\", \"TeamIndex\", \"Position\", \"Assists\", \"CleanSheets\", \"Full\", \"Goals\", \"Half\", \"PenaltyMiss\", \"RedCards\", \"YellowCards\") VALUES (%s, '%s', %s, '%s', %s, %s, %s, %s, %s, %s, %s, %s)",
								thisPlayer.getIndex(),
								thisPlayer.getName(),
								thisPlayer.getTeamIndex(),
								thisPlayer.getPosition(),
								thisPlayer.getAssists(),
								thisPlayer.getCleanSheets(),
								thisPlayer.getFull(),
								thisPlayer.getGoals(),
								thisPlayer.getHalf(),
								thisPlayer.getPenaltyMiss(),
								thisPlayer.getRedCards(),
								thisPlayer.getYellowCards()
								));
			}

			st.executeUpdate("TRUNCATE Table \"Matches\"");

			List<Match> matches = new ArrayList<Match>();
			Match match = null;

			match = new Match();
			match.setTeam1Index(Constants.BRAZIL);
			match.setTeam2Index(Constants.CROATIA);
			match.setIndex(1);
			match.setDate("12 June 2014");
			match.setTime("17:00");
			match.setVenue("Arena de São Paulo, São Paulo");

			match.setTeam1Goals(3);    
			match.setTeam2Goals(1);

			match.setTeam1GoalsAdam(3);
			match.setTeam2GoalsAdam(0);

			match.setTeam1GoalsEmily(2);
			match.setTeam2GoalsEmily(0);

			match.setTeam1GoalsJohn(3);
			match.setTeam2GoalsJohn(1);

			match.setTeam1GoalsKyle(3);
			match.setTeam2GoalsKyle(1);

			match.setTeam1GoalsLuke(2);
			match.setTeam2GoalsLuke(0);

			match.setTeam1GoalsNicola(4);
			match.setTeam2GoalsNicola(0);

			match.setTeam1GoalsPaul(2);
			match.setTeam2GoalsPaul(1);

			matches.add(match);

			match = new Match();
			match.setTeam1Index(Constants.MEXICO);
			match.setTeam2Index(Constants.CAMEROON);
			match.setIndex(2);
			match.setDate("13 June 2014");
			match.setTime("13:00");
			match.setVenue("Arena das Dunas, Natal");
			
			match.setTeam1Goals(1);    
			match.setTeam2Goals(0);

			match.setTeam1GoalsAdam(1);
			match.setTeam2GoalsAdam(2);
			
			match.setTeam1GoalsEmily(1);
			match.setTeam2GoalsEmily(0);

			match.setTeam1GoalsJohn(2);
			match.setTeam2GoalsJohn(1);

			match.setTeam1GoalsKyle(1);
			match.setTeam2GoalsKyle(0);

			match.setTeam1GoalsLuke(1);
			match.setTeam2GoalsLuke(1);

			match.setTeam1GoalsPaul(1);
			match.setTeam2GoalsPaul(0);

			matches.add(match);

			match = new Match();
			match.setTeam1Index(Constants.SPAIN);
			match.setTeam2Index(Constants.NETHERLANDS);
			match.setIndex(3);
			match.setDate("13 June 2014");
			match.setTime("16:00");
			match.setVenue("Arena Fonte Nova, Salvador");
			
			match.setTeam1Goals(1);    
			match.setTeam2Goals(5);

			match.setTeam1GoalsAdam(1);
			match.setTeam2GoalsAdam(1);

			match.setTeam1GoalsEmily(2);
			match.setTeam2GoalsEmily(1);

			match.setTeam1GoalsJohn(3);
			match.setTeam2GoalsJohn(1);

			match.setTeam1GoalsKyle(1);
			match.setTeam2GoalsKyle(1);

			match.setTeam1GoalsLuke(2);
			match.setTeam2GoalsLuke(1);

			match.setTeam1GoalsPaul(1);
			match.setTeam2GoalsPaul(1);

			matches.add(match);

			match = new Match();
			match.setTeam1Index(Constants.CHILE);
			match.setTeam2Index(Constants.AUSTRALIA);
			match.setIndex(4);
			match.setDate("13 June 2014");
			match.setTime("19:00");
			match.setVenue("Arena Pantanal, Cuiabá");
			
			match.setTeam1Goals(3);    
			match.setTeam2Goals(1);

			match.setTeam1GoalsAdam(2);
			match.setTeam2GoalsAdam(0);

			match.setTeam1GoalsEmily(1);
			match.setTeam2GoalsEmily(0);

			match.setTeam1GoalsJohn(2);
			match.setTeam2GoalsJohn(1);

			match.setTeam1GoalsKyle(2);
			match.setTeam2GoalsKyle(0);

			match.setTeam1GoalsLuke(3);
			match.setTeam2GoalsLuke(0);

			match.setTeam1GoalsPaul(3);
			match.setTeam2GoalsPaul(0);

			matches.add(match);

			match = new Match();
			match.setIndex(5);
			match.setTeam1Index(Constants.COLOMBIA);
			match.setTeam2Index(Constants.GREECE);
			match.setDate("14 June 2014");
			match.setTime("13:00");
			match.setVenue("Estádio Mineirão, Belo Horizonte");
			
			match.setTeam1Goals(3);    
			match.setTeam2Goals(0);

			match.setTeam1GoalsAdam(2);
			match.setTeam2GoalsAdam(1);

			match.setTeam1GoalsEmily(1);
			match.setTeam2GoalsEmily(0);

			match.setTeam1GoalsJohn(2);
			match.setTeam2GoalsJohn(2);

			match.setTeam1GoalsKyle(2);
			match.setTeam2GoalsKyle(0);

			match.setTeam1GoalsLuke(3);
			match.setTeam2GoalsLuke(1);

			match.setTeam1GoalsPaul(2);
			match.setTeam2GoalsPaul(0);
			
			matches.add(match);

			match = new Match();
			match.setIndex(6);
			match.setTeam1Index(Constants.URUGUAY);
			match.setTeam2Index(Constants.COSTA_RICA);
			match.setDate("14 June 2014");
			match.setTime("16:00");
			match.setVenue("Estádio Castelão, Fortaleza");
			
			match.setTeam1Goals(1);    
			match.setTeam2Goals(3);

			match.setTeam1GoalsAdam(4);
			match.setTeam2GoalsAdam(0);
			
			match.setTeam1GoalsEmily(3);
			match.setTeam2GoalsEmily(0);

			match.setTeam1GoalsJohn(3);
			match.setTeam2GoalsJohn(0);

			match.setTeam1GoalsKyle(3);
			match.setTeam2GoalsKyle(0);

			match.setTeam1GoalsLuke(2);
			match.setTeam2GoalsLuke(1);

			match.setTeam1GoalsPaul(3);
			match.setTeam2GoalsPaul(0);
			
			matches.add(match);

			match = new Match();
			match.setIndex(7);
			match.setTeam1Index(Constants.ENGLAND);
			match.setTeam2Index(Constants.ITALY);
			match.setDate("14 June 2014");
			match.setTime("19:00");
			match.setVenue("Arena Amazônia, Manaus");
			
			match.setTeam1Goals(1);    
			match.setTeam2Goals(2);

			match.setTeam1GoalsAdam(2);
			match.setTeam2GoalsAdam(1);

			match.setTeam1GoalsEmily(1);
			match.setTeam2GoalsEmily(0);

			match.setTeam1GoalsJohn(1);
			match.setTeam2GoalsJohn(2);

			match.setTeam1GoalsKyle(1);
			match.setTeam2GoalsKyle(0);

			match.setTeam1GoalsLuke(2);
			match.setTeam2GoalsLuke(1);

			match.setTeam1GoalsPaul(2);
			match.setTeam2GoalsPaul(0);
			
			matches.add(match);

			match = new Match();
			match.setIndex(8);
			match.setTeam1Index(Constants.IVORY_COAST);
			match.setTeam2Index(Constants.JAPAN);
			match.setDate("14 June 2014");
			match.setTime("22:00");
			match.setVenue("Arena Pernambuco, Recife");
			
			match.setTeam1Goals(2);    
			match.setTeam2Goals(1);

			match.setTeam1GoalsAdam(1);
			match.setTeam2GoalsAdam(1);

			match.setTeam1GoalsEmily(1);
			match.setTeam2GoalsEmily(1);

			match.setTeam1GoalsJohn(2);
			match.setTeam2GoalsJohn(2);

			match.setTeam1GoalsKyle(3);
			match.setTeam2GoalsKyle(1);

			match.setTeam1GoalsLuke(2);
			match.setTeam2GoalsLuke(1);

			match.setTeam1GoalsPaul(2);
			match.setTeam2GoalsPaul(1);
			
			matches.add(match);

			match = new Match();
			match.setIndex(9);
			match.setTeam1Index(Constants.SWITZERLAND);
			match.setTeam2Index(Constants.ECUADOR);
			match.setDate("15 June 2014");
			match.setTime("13:00");
			match.setVenue("Estádio Nacional Mané Garrincha, Brasília");
			
			match.setTeam1Goals(2);    
			match.setTeam2Goals(1);

			match.setTeam1GoalsAdam(1);
			match.setTeam2GoalsAdam(1);

			match.setTeam1GoalsEmily(0);
			match.setTeam2GoalsEmily(0);

			match.setTeam1GoalsJohn(1);
			match.setTeam2GoalsJohn(1);
			
			match.setTeam1GoalsKyle(1);
			match.setTeam2GoalsKyle(1);

			match.setTeam1GoalsLuke(2);
			match.setTeam2GoalsLuke(1);

			match.setTeam1GoalsPaul(1);
			match.setTeam2GoalsPaul(3);

			matches.add(match);

			match = new Match();
			match.setIndex(10);
			match.setTeam1Index(Constants.FRANCE);
			match.setTeam2Index(Constants.HONDURAS);
			match.setDate("15 June 2014");
			match.setTime("16:00");
			match.setVenue("Estádio Beira-Rio, Porto Alegre");
			
			match.setTeam1Goals(3);    
			match.setTeam2Goals(0);

			match.setTeam1GoalsAdam(3);
			match.setTeam2GoalsAdam(0);

			match.setTeam1GoalsEmily(2);
			match.setTeam2GoalsEmily(0);

			match.setTeam1GoalsJohn(2);
			match.setTeam2GoalsJohn(0);

			match.setTeam1GoalsKyle(2);
			match.setTeam2GoalsKyle(1);

			match.setTeam1GoalsLuke(3);
			match.setTeam2GoalsLuke(0);

			match.setTeam1GoalsPaul(2);
			match.setTeam2GoalsPaul(0);

			matches.add(match);

			match = new Match();
			match.setIndex(11);
			match.setTeam1Index(Constants.ARGENTINA);
			match.setTeam2Index(Constants.BOSNIA_AND_HERZEGOVINA);
			match.setDate("15 June 2014");
			match.setTime("19:00");
			match.setVenue("Estádio do Maracanã, Rio de Janeiro");
			
			match.setTeam1Goals(2);    
			match.setTeam2Goals(1);

			match.setTeam1GoalsAdam(2);
			match.setTeam2GoalsAdam(1);
			
			match.setTeam1GoalsEmily(3);
			match.setTeam2GoalsEmily(1);

			match.setTeam1GoalsJohn(4);
			match.setTeam2GoalsJohn(0);

			match.setTeam1GoalsKyle(2);
			match.setTeam2GoalsKyle(0);

			match.setTeam1GoalsLuke(3);
			match.setTeam2GoalsLuke(1);

			match.setTeam1GoalsPaul(3);
			match.setTeam2GoalsPaul(0);

			matches.add(match);

			match = new Match();
			match.setIndex(12);
			match.setTeam1Index(Constants.GERMANY);
			match.setTeam2Index(Constants.PORTUGAL);
			match.setDate("16 June 2014");
			match.setTime("13:00");
			match.setVenue("Arena Fonte Nova, Salvador");
			
			match.setTeam1Goals(4);    
			match.setTeam2Goals(0);

			match.setTeam1GoalsAdam(2);
			match.setTeam2GoalsAdam(2);

			match.setTeam1GoalsEmily(2);
			match.setTeam2GoalsEmily(1);

			match.setTeam1GoalsJohn(3);
			match.setTeam2GoalsJohn(2);

			match.setTeam1GoalsKyle(1);
			match.setTeam2GoalsKyle(1);

			match.setTeam1GoalsLuke(3);
			match.setTeam2GoalsLuke(2);

			match.setTeam1GoalsPaul(2);
			match.setTeam2GoalsPaul(2);
			
			matches.add(match);
			
			match = new Match();
			match.setIndex(13);
			match.setTeam1Index(Constants.IRAN);
			match.setTeam2Index(Constants.NIGERIA);
			match.setDate("16 June 2014");
			match.setTime("16:00");
			match.setVenue("Arena da Baixada, Curitiba");
			
			match.setTeam1Goals(0);    
			match.setTeam2Goals(0);

			match.setTeam1GoalsAdam(0);
			match.setTeam2GoalsAdam(1);

			match.setTeam1GoalsEmily(0);
			match.setTeam2GoalsEmily(2);

			match.setTeam1GoalsJohn(0);
			match.setTeam2GoalsJohn(3);

			match.setTeam1GoalsKyle(0);
			match.setTeam2GoalsKyle(3);

			match.setTeam1GoalsLuke(0);
			match.setTeam2GoalsLuke(2);

			match.setTeam1GoalsPaul(0);
			match.setTeam2GoalsPaul(2);

			matches.add(match);

			match = new Match();
			match.setIndex(14);
			match.setTeam1Index(Constants.GHANA);
			match.setTeam2Index(Constants.UNITED_STATES);
			match.setDate("16 June 2014");
			match.setTime("19:00");
			match.setVenue("Arena das Dunas, Natal");
			
			match.setTeam1Goals(1);    
			match.setTeam2Goals(2);

			match.setTeam1GoalsAdam(0);
			match.setTeam2GoalsAdam(0);

			match.setTeam1GoalsEmily(1);
			match.setTeam2GoalsEmily(1);

			match.setTeam1GoalsJohn(2);
			match.setTeam2GoalsJohn(2);

			match.setTeam1GoalsKyle(0);
			match.setTeam2GoalsKyle(3);

			match.setTeam1GoalsLuke(0);
			match.setTeam2GoalsLuke(2);

			match.setTeam1GoalsPaul(1);
			match.setTeam2GoalsPaul(0);
			
			matches.add(match);

			match = new Match();
			match.setIndex(15);
			match.setTeam1Index(Constants.BELGIUM);
			match.setTeam2Index(Constants.ALGERIA);
			match.setDate("17 June 2014");
			match.setTime("13:00");
			match.setVenue("Estádio Mineirão, Belo Horizonte");
			
			match.setTeam1Goals(2);    
			match.setTeam2Goals(1);

			match.setTeam1GoalsAdam(3);
			match.setTeam2GoalsAdam(0);

			match.setTeam1GoalsEmily(2);
			match.setTeam2GoalsEmily(0);

			match.setTeam1GoalsJohn(3);
			match.setTeam2GoalsJohn(1);

			match.setTeam1GoalsKyle(3);
			match.setTeam2GoalsKyle(0);

			match.setTeam1GoalsLuke(3);
			match.setTeam2GoalsLuke(0);

			match.setTeam1GoalsPaul(2);
			match.setTeam2GoalsPaul(0);

			matches.add(match);

			match = new Match();
			match.setTeam1Index(Constants.BRAZIL);
			match.setTeam2Index(Constants.MEXICO);
			match.setIndex(16);
			match.setDate("17 June 2014");
			match.setTime("16:00");
			match.setVenue("Estádio Castelão, Fortaleza");
			
			match.setTeam1Goals(0);    
			match.setTeam2Goals(0);

			match.setTeam1GoalsAdam(3);
			match.setTeam2GoalsAdam(1);

			match.setTeam1GoalsEmily(3);
			match.setTeam2GoalsEmily(1);

			match.setTeam1GoalsJohn(3);
			match.setTeam2GoalsJohn(2);

			match.setTeam1GoalsKyle(4);
			match.setTeam2GoalsKyle(1);

			match.setTeam1GoalsLuke(3);
			match.setTeam2GoalsLuke(0);

			match.setTeam1GoalsPaul(3);
			match.setTeam2GoalsPaul(1);

			matches.add(match);

			match = new Match();
			match.setIndex(17);
			match.setTeam1Index(Constants.RUSSIA);
			match.setTeam2Index(Constants.SOUTH_KOREA);
			match.setDate("17 June 2014");
			match.setTime("19:00");
			match.setVenue("Arena Pantanal, Cuiabá");
			
			match.setTeam1Goals(1);    
			match.setTeam2Goals(1);

			match.setTeam1GoalsAdam(2);
			match.setTeam2GoalsAdam(0);

			match.setTeam1GoalsEmily(1);
			match.setTeam2GoalsEmily(0);

			match.setTeam1GoalsJohn(2);
			match.setTeam2GoalsJohn(2);

			match.setTeam1GoalsKyle(2);
			match.setTeam2GoalsKyle(1);

			match.setTeam1GoalsLuke(2);
			match.setTeam2GoalsLuke(0);

			match.setTeam1GoalsPaul(2);
			match.setTeam2GoalsPaul(0);
			
			matches.add(match);

			match = new Match();
			match.setIndex(18);
			match.setTeam1Index(Constants.AUSTRALIA);
			match.setTeam2Index(Constants.NETHERLANDS);
			match.setDate("18 June 2014");
			match.setTime("13:00");
			match.setVenue("Estádio Beira-Rio, Porto Alegre");
			
			match.setTeam1Goals(2);    
			match.setTeam2Goals(3);

			match.setTeam1GoalsAdam(0);
			match.setTeam2GoalsAdam(3);

			match.setTeam1GoalsEmily(1);
			match.setTeam2GoalsEmily(2);

			match.setTeam1GoalsJohn(1);
			match.setTeam2GoalsJohn(3);

			match.setTeam1GoalsKyle(0);
			match.setTeam2GoalsKyle(4);

			match.setTeam1GoalsLuke(0);
			match.setTeam2GoalsLuke(5);

			match.setTeam1GoalsPaul(0);
			match.setTeam2GoalsPaul(4);

			matches.add(match);

			match = new Match();
			match.setIndex(19);
			match.setTeam1Index(Constants.SPAIN);
			match.setTeam2Index(Constants.CHILE);
			match.setDate("18 June 2014");
			match.setTime("16:00");
			match.setVenue("Estádio do Maracanã, Rio de Janeiro");
			
			match.setTeam1Goals(0);    
			match.setTeam2Goals(2);

			match.setTeam1GoalsAdam(2);
			match.setTeam2GoalsAdam(0);
			
			match.setTeam1GoalsEmily(2);
			match.setTeam2GoalsEmily(0);

			match.setTeam1GoalsJohn(2);
			match.setTeam2GoalsJohn(1);

			match.setTeam1GoalsKyle(2);
			match.setTeam2GoalsKyle(1);

			match.setTeam1GoalsLuke(2);
			match.setTeam2GoalsLuke(0);

			match.setTeam1GoalsPaul(2);
			match.setTeam2GoalsPaul(0);
			
			matches.add(match);

			match = new Match();
			match.setTeam1Index(Constants.CAMEROON);
			match.setTeam2Index(Constants.CROATIA);
			match.setIndex(20);
			match.setDate("18 June 2014");
			match.setTime("19:00");
			match.setVenue("Arena Amazônia, Manaus");
			
			match.setTeam1Goals(0);    
			match.setTeam2Goals(4);

			match.setTeam1GoalsAdam(0);
			match.setTeam2GoalsAdam(1);

			match.setTeam1GoalsEmily(1);
			match.setTeam2GoalsEmily(0);

			match.setTeam1GoalsJohn(3);
			match.setTeam2GoalsJohn(2);

			match.setTeam1GoalsKyle(1);
			match.setTeam2GoalsKyle(1);

			match.setTeam1GoalsLuke(1);
			match.setTeam2GoalsLuke(2);

			match.setTeam1GoalsPaul(1);
			match.setTeam2GoalsPaul(2);

			matches.add(match);

			match = new Match();
			match.setIndex(21);
			match.setTeam1Index(Constants.COLOMBIA);
			match.setTeam2Index(Constants.IVORY_COAST);
			match.setDate("19 June 2014");
			match.setTime("13:00");
			match.setVenue("Estádio Nacional Mané Garrincha, Brasília");
			
			match.setTeam1Goals(2);    
			match.setTeam2Goals(1);

			match.setTeam1GoalsAdam(2);
			match.setTeam2GoalsAdam(0);

			match.setTeam1GoalsEmily(1);
			match.setTeam2GoalsEmily(0);

			match.setTeam1GoalsJohn(3);
			match.setTeam2GoalsJohn(1);
			
			match.setTeam1GoalsKyle(1);
			match.setTeam2GoalsKyle(2);

			match.setTeam1GoalsLuke(2);
			match.setTeam2GoalsLuke(1);

			match.setTeam1GoalsPaul(2);
			match.setTeam2GoalsPaul(1);
			
			matches.add(match);

			match = new Match();
			match.setIndex(22);
			match.setTeam1Index(Constants.URUGUAY);
			match.setTeam2Index(Constants.ENGLAND);
			match.setDate("19 June 2014");
			match.setTime("16:00");
			match.setVenue("Arena de São Paulo, São Paulo");
			
			match.setTeam1Goals(2);    
			match.setTeam2Goals(1);

			match.setTeam1GoalsAdam(2);
			match.setTeam2GoalsAdam(2);
			
			match.setTeam1GoalsEmily(0);
			match.setTeam2GoalsEmily(1);

			match.setTeam1GoalsJohn(4);
			match.setTeam2GoalsJohn(2);

			match.setTeam1GoalsKyle(1);
			match.setTeam2GoalsKyle(1);

			match.setTeam1GoalsLuke(1);
			match.setTeam2GoalsLuke(2);

			match.setTeam1GoalsPaul(1);
			match.setTeam2GoalsPaul(1);
			
			matches.add(match);

			match = new Match();
			match.setIndex(23);
			match.setTeam1Index(Constants.JAPAN);
			match.setTeam2Index(Constants.GREECE);
			match.setDate("19 June 2014");
			match.setTime("19:00");
			match.setVenue("Arena das Dunas, Natal");
			
			match.setTeam1Goals(0);    
			match.setTeam2Goals(0);

			match.setTeam1GoalsAdam(1);
			match.setTeam2GoalsAdam(0);

			match.setTeam1GoalsEmily(2);
			match.setTeam2GoalsEmily(1);

			match.setTeam1GoalsJohn(1);
			match.setTeam2GoalsJohn(2);

			match.setTeam1GoalsKyle(1);
			match.setTeam2GoalsKyle(0);

			match.setTeam1GoalsLuke(2);
			match.setTeam2GoalsLuke(0);

			match.setTeam1GoalsPaul(1);
			match.setTeam2GoalsPaul(0);
			
			matches.add(match);

			match = new Match();
			match.setIndex(24);
			match.setTeam1Index(Constants.ITALY);
			match.setTeam2Index(Constants.COSTA_RICA);
			match.setDate("20 June 2014");
			match.setTime("13:00");
			match.setVenue("Arena Pernambuco, Recife");
			
			match.setTeam1Goals(0);    
			match.setTeam2Goals(1);

			match.setTeam1GoalsAdam(2);
			match.setTeam2GoalsAdam(0);

			match.setTeam1GoalsEmily(2);
			match.setTeam2GoalsEmily(0);

			match.setTeam1GoalsJohn(2);
			match.setTeam2GoalsJohn(0);

			match.setTeam1GoalsKyle(2);
			match.setTeam2GoalsKyle(1);

			match.setTeam1GoalsLuke(2);
			match.setTeam2GoalsLuke(0);

			match.setTeam1GoalsPaul(2);
			match.setTeam2GoalsPaul(0);
			
			matches.add(match);

			match = new Match();
			match.setIndex(25);
			match.setTeam1Index(Constants.SWITZERLAND);
			match.setTeam2Index(Constants.FRANCE);
			match.setDate("20 June 2014");
			match.setTime("16:00");
			match.setVenue("Arena Fonte Nova, Salvador");
			
			match.setTeam1Goals(2);    
			match.setTeam2Goals(5);

			match.setTeam1GoalsAdam(0);
			match.setTeam2GoalsAdam(2);

			match.setTeam1GoalsEmily(1);
			match.setTeam2GoalsEmily(2);

			match.setTeam1GoalsJohn(1);
			match.setTeam2GoalsJohn(3);

			match.setTeam1GoalsKyle(2);
			match.setTeam2GoalsKyle(2);

			match.setTeam1GoalsLuke(2);
			match.setTeam2GoalsLuke(1);

			match.setTeam1GoalsPaul(2);
			match.setTeam2GoalsPaul(2);
			
			matches.add(match);

			match = new Match();
			match.setIndex(26);
			match.setTeam1Index(Constants.HONDURAS);
			match.setTeam2Index(Constants.ECUADOR);
			match.setDate("20 June 2014");
			match.setTime("19:00");
			match.setVenue("Arena da Baixada, Curitiba");
			
			match.setTeam1Goals(1);    
			match.setTeam2Goals(2);

			match.setTeam1GoalsAdam(0);
			match.setTeam2GoalsAdam(1);

			match.setTeam1GoalsEmily(0);
			match.setTeam2GoalsEmily(0);

			match.setTeam1GoalsJohn(2);
			match.setTeam2GoalsJohn(2);

			match.setTeam1GoalsKyle(0);
			match.setTeam2GoalsKyle(1);

			match.setTeam1GoalsLuke(0);
			match.setTeam2GoalsLuke(2);

			match.setTeam1GoalsPaul(0);
			match.setTeam2GoalsPaul(2);
			
			matches.add(match);

			match = new Match();
			match.setIndex(27);
			match.setTeam1Index(Constants.ARGENTINA);
			match.setTeam2Index(Constants.IRAN);
			match.setDate("21 June 2014");
			match.setTime("13:00");
			match.setVenue("Estádio Mineirão, Belo Horizonte");
			
			match.setTeam1Goals(1);    
			match.setTeam2Goals(0);

			match.setTeam1GoalsAdam(4);
			match.setTeam2GoalsAdam(0);

			match.setTeam1GoalsEmily(3);
			match.setTeam2GoalsEmily(0);

			match.setTeam1GoalsJohn(5);
			match.setTeam2GoalsJohn(0);

			match.setTeam1GoalsKyle(5);
			match.setTeam2GoalsKyle(0);

			match.setTeam1GoalsLuke(4);
			match.setTeam2GoalsLuke(0);

			match.setTeam1GoalsPaul(5);
			match.setTeam2GoalsPaul(0);
			
			matches.add(match);

			match = new Match();
			match.setIndex(28);
			match.setTeam1Index(Constants.GERMANY);
			match.setTeam2Index(Constants.GHANA);
			match.setDate("21 June 2014");
			match.setTime("16:00");
			match.setVenue("Estádio Castelão, Fortaleza");
			
			match.setTeam1Goals(2);    
			match.setTeam2Goals(2);

			match.setTeam1GoalsAdam(3);
			match.setTeam2GoalsAdam(0);

			match.setTeam1GoalsEmily(3);
			match.setTeam2GoalsEmily(1);

			match.setTeam1GoalsJohn(3);
			match.setTeam2GoalsJohn(1);

			match.setTeam1GoalsKyle(2);
			match.setTeam2GoalsKyle(1);

			match.setTeam1GoalsLuke(3);
			match.setTeam2GoalsLuke(1);

			match.setTeam1GoalsPaul(3);
			match.setTeam2GoalsPaul(0);

			matches.add(match);

			match = new Match();
			match.setIndex(29);
			match.setTeam1Index(Constants.NIGERIA);
			match.setTeam2Index(Constants.BOSNIA_AND_HERZEGOVINA);
			match.setDate("21 June 2014");
			match.setTime("19:00");
			match.setVenue("Arena Pantanal, Cuiabá");
			
			match.setTeam1Goals(1);    
			match.setTeam2Goals(0);

			match.setTeam1GoalsAdam(0);
			match.setTeam2GoalsAdam(2);
			
			match.setTeam1GoalsEmily(0);
			match.setTeam2GoalsEmily(1);

			match.setTeam1GoalsJohn(2);
			match.setTeam2GoalsJohn(2);

			match.setTeam1GoalsKyle(0);
			match.setTeam2GoalsKyle(2);

			match.setTeam1GoalsLuke(0);
			match.setTeam2GoalsLuke(2);

			match.setTeam1GoalsPaul(0);
			match.setTeam2GoalsPaul(0);
			
			matches.add(match);

			match = new Match();
			match.setIndex(30);
			match.setTeam1Index(Constants.BELGIUM);
			match.setTeam2Index(Constants.RUSSIA);
			match.setDate("22 June 2014");
			match.setTime("13:00");
			match.setVenue("Estádio do Maracanã, Rio de Janeiro");
			
			match.setTeam1Goals(1);    
			match.setTeam2Goals(0);
			
			match.setTeam1GoalsAdam(3);
			match.setTeam2GoalsAdam(1);
			
			match.setTeam1GoalsEmily(2);
			match.setTeam2GoalsEmily(1);

			match.setTeam1GoalsJohn(2);
			match.setTeam2GoalsJohn(0);

			match.setTeam1GoalsKyle(1);
			match.setTeam2GoalsKyle(1);

			match.setTeam1GoalsLuke(1);
			match.setTeam2GoalsLuke(0);

			match.setTeam1GoalsPaul(2);
			match.setTeam2GoalsPaul(1);
			
			matches.add(match);

			match = new Match();
			match.setIndex(31);
			match.setTeam1Index(Constants.SOUTH_KOREA);
			match.setTeam2Index(Constants.ALGERIA);
			match.setDate("22 June 2014");
			match.setTime("16:00");
			match.setVenue("Estádio Beira-Rio, Porto Alegre");
			
			match.setTeam1Goals(2);    
			match.setTeam2Goals(4);

			match.setTeam1GoalsAdam(0);
			match.setTeam2GoalsAdam(0);
			
			match.setTeam1GoalsEmily(1);
			match.setTeam2GoalsEmily(1);

			match.setTeam1GoalsJohn(2);
			match.setTeam2GoalsJohn(2);

			match.setTeam1GoalsKyle(2);
			match.setTeam2GoalsKyle(1);

			match.setTeam1GoalsLuke(1);
			match.setTeam2GoalsLuke(2);

			match.setTeam1GoalsPaul(1);
			match.setTeam2GoalsPaul(1);
			
			matches.add(match);

			match = new Match();
			match.setIndex(32);
			match.setTeam1Index(Constants.UNITED_STATES);
			match.setTeam2Index(Constants.PORTUGAL);
			match.setDate("22 June 2014");
			match.setTime("19:00");
			match.setVenue("Arena Amazônia, Manaus");
			
			match.setTeam1Goals(2);    
			match.setTeam2Goals(2);

			match.setTeam1GoalsAdam(0);
			match.setTeam2GoalsAdam(2);

			match.setTeam1GoalsEmily(0);
			match.setTeam2GoalsEmily(2);

			match.setTeam1GoalsJohn(1);
			match.setTeam2GoalsJohn(3);

			match.setTeam1GoalsKyle(0);
			match.setTeam2GoalsKyle(2);

			match.setTeam1GoalsLuke(1);
			match.setTeam2GoalsLuke(2);

			match.setTeam1GoalsPaul(0);
			match.setTeam2GoalsPaul(1);
			
			matches.add(match);

			match = new Match();
			match.setIndex(33);
			match.setTeam1Index(Constants.AUSTRALIA);
			match.setTeam2Index(Constants.SPAIN);
			match.setDate("23 June 2014");
			match.setTime("13:00");
			match.setVenue("Arena da Baixada, Curitiba");
			
			match.setTeam1Goals(0);    
			match.setTeam2Goals(3);
			
			match.setTeam1GoalsAdam(0);
			match.setTeam2GoalsAdam(5);

			match.setTeam1GoalsEmily(0);
			match.setTeam2GoalsEmily(1);

			match.setTeam1GoalsJohn(0);
			match.setTeam2GoalsJohn(3);

			match.setTeam1GoalsKyle(0);
			match.setTeam2GoalsKyle(4);

			match.setTeam1GoalsLuke(0);
			match.setTeam2GoalsLuke(3);

			match.setTeam1GoalsPaul(0);
			match.setTeam2GoalsPaul(4);
			
			matches.add(match);

			match = new Match();
			match.setIndex(34);
			match.setTeam1Index(Constants.NETHERLANDS);
			match.setTeam2Index(Constants.CHILE);
			match.setDate("23 June 2014");
			match.setTime("13:00");
			match.setVenue("Arena de São Paulo, São Paulo");
			
			match.setTeam1Goals(2);    
			match.setTeam2Goals(0);

			match.setTeam1GoalsAdam(2);
			match.setTeam2GoalsAdam(1);

			match.setTeam1GoalsEmily(1);
			match.setTeam2GoalsEmily(1);

			match.setTeam1GoalsJohn(3);
			match.setTeam2GoalsJohn(1);

			match.setTeam1GoalsKyle(2);
			match.setTeam2GoalsKyle(2);

			match.setTeam1GoalsLuke(3);
			match.setTeam2GoalsLuke(2);

			match.setTeam1GoalsPaul(3);
			match.setTeam2GoalsPaul(1);
			
			matches.add(match);

			match = new Match();
			match.setTeam1Index(Constants.CAMEROON);
			match.setTeam2Index(Constants.BRAZIL);
			match.setIndex(35);
			match.setDate("23 June 2014");
			match.setTime("17:00");
			match.setVenue("Estádio Nacional Mané Garrincha, Brasília");
			
			match.setTeam1Goals(1);    
			match.setTeam2Goals(4);

			match.setTeam1GoalsAdam(1);
			match.setTeam2GoalsAdam(4);

			match.setTeam1GoalsEmily(1);
			match.setTeam2GoalsEmily(4);

			match.setTeam1GoalsJohn(1);
			match.setTeam2GoalsJohn(4);

			match.setTeam1GoalsKyle(1);
			match.setTeam2GoalsKyle(3);

			match.setTeam1GoalsLuke(0);
			match.setTeam2GoalsLuke(2);

			match.setTeam1GoalsPaul(1);
			match.setTeam2GoalsPaul(3);

			matches.add(match);

			match = new Match();
			match.setTeam1Index(Constants.CROATIA);
			match.setTeam2Index(Constants.MEXICO);
			match.setIndex(36);
			match.setDate("23 June 2014");
			match.setTime("17:00");
			match.setVenue("Arena Pernambuco, Recife");
			
			match.setTeam1Goals(1);    
			match.setTeam2Goals(3);

			match.setTeam1GoalsAdam(1);
			match.setTeam2GoalsAdam(1);

			match.setTeam1GoalsEmily(2);
			match.setTeam2GoalsEmily(2);

			match.setTeam1GoalsJohn(1);
			match.setTeam2GoalsJohn(2);

			match.setTeam1GoalsKyle(1);
			match.setTeam2GoalsKyle(1);

			match.setTeam1GoalsLuke(2);
			match.setTeam2GoalsLuke(1);

			match.setTeam1GoalsPaul(2);
			match.setTeam2GoalsPaul(2);

			matches.add(match);

			match = new Match();
			match.setIndex(37);
			match.setTeam1Index(Constants.ITALY);
			match.setTeam2Index(Constants.URUGUAY);
			match.setDate("24 June 2014");
			match.setTime("13:00");
			match.setVenue("Arena das Dunas, Natal");
			
			match.setTeam1Goals(0);    
			match.setTeam2Goals(1);

			match.setTeam1GoalsAdam(1);
			match.setTeam2GoalsAdam(1);

			match.setTeam1GoalsEmily(0);
			match.setTeam2GoalsEmily(1);

			match.setTeam1GoalsJohn(2);
			match.setTeam2GoalsJohn(3);

			match.setTeam1GoalsKyle(2);
			match.setTeam2GoalsKyle(0);

			match.setTeam1GoalsLuke(1);
			match.setTeam2GoalsLuke(1);

			match.setTeam1GoalsPaul(1);
			match.setTeam2GoalsPaul(2);
			
			matches.add(match);

			match = new Match();
			match.setIndex(38);
			match.setTeam1Index(Constants.COSTA_RICA);
			match.setTeam2Index(Constants.ENGLAND);
			match.setDate("24 June 2014");
			match.setTime("13:00");
			match.setVenue("Estádio Mineirão, Belo Horizonte");
			
			match.setTeam1Goals(0);    
			match.setTeam2Goals(0);

			match.setTeam1GoalsAdam(0);
			match.setTeam2GoalsAdam(2);

			match.setTeam1GoalsEmily(1);
			match.setTeam2GoalsEmily(2);

			match.setTeam1GoalsJohn(1);
			match.setTeam2GoalsJohn(2);

			match.setTeam1GoalsKyle(0);
			match.setTeam2GoalsKyle(3);

			match.setTeam1GoalsLuke(0);
			match.setTeam2GoalsLuke(2);

			match.setTeam1GoalsPaul(0);
			match.setTeam2GoalsPaul(2);

			matches.add(match);

			match = new Match();
			match.setIndex(39);
			match.setTeam1Index(Constants.JAPAN);
			match.setTeam2Index(Constants.COLOMBIA);
			match.setDate("24 June 2014");
			match.setTime("17:00");
			match.setVenue("Arena Pantanal, Cuiabá");
			
			match.setTeam1Goals(1);    
			match.setTeam2Goals(4);

			match.setTeam1GoalsAdam(1);
			match.setTeam2GoalsAdam(2);

			match.setTeam1GoalsEmily(1);
			match.setTeam2GoalsEmily(2);

			match.setTeam1GoalsJohn(1);
			match.setTeam2GoalsJohn(2);

			match.setTeam1GoalsKyle(1);
			match.setTeam2GoalsKyle(3);

			match.setTeam1GoalsLuke(1);
			match.setTeam2GoalsLuke(2);

			match.setTeam1GoalsPaul(0);
			match.setTeam2GoalsPaul(2);
			
			matches.add(match);

			match = new Match();
			match.setIndex(40);
			match.setTeam1Index(Constants.GREECE);
			match.setTeam2Index(Constants.IVORY_COAST);
			match.setDate("24 June 2014");
			match.setTime("17:00");
			match.setVenue("Estádio Castelão, Fortaleza");
			
			match.setTeam1Goals(2);    
			match.setTeam2Goals(1);

			match.setTeam1GoalsAdam(1);
			match.setTeam2GoalsAdam(1);
			
			match.setTeam1GoalsEmily(0);
			match.setTeam2GoalsEmily(1);

			match.setTeam1GoalsJohn(2);
			match.setTeam2GoalsJohn(2);

			match.setTeam1GoalsKyle(1);
			match.setTeam2GoalsKyle(2);

			match.setTeam1GoalsLuke(0);
			match.setTeam2GoalsLuke(2);

			match.setTeam1GoalsPaul(0);
			match.setTeam2GoalsPaul(2);
			
			matches.add(match);

			match = new Match();
			match.setIndex(41);
			match.setTeam1Index(Constants.NIGERIA);
			match.setTeam2Index(Constants.ARGENTINA);
			match.setDate("25 June 2014");
			match.setTime("13:00");
			match.setVenue("Estádio Beira-Rio, Porto Alegre");
			
			match.setTeam1Goals(2);    
			match.setTeam2Goals(3);

			match.setTeam1GoalsAdam(0);
			match.setTeam2GoalsAdam(2);

			match.setTeam1GoalsEmily(1);
			match.setTeam2GoalsEmily(3);

			match.setTeam1GoalsJohn(0);
			match.setTeam2GoalsJohn(4);

			match.setTeam1GoalsKyle(0);
			match.setTeam2GoalsKyle(4);

			match.setTeam1GoalsLuke(1);
			match.setTeam2GoalsLuke(3);

			match.setTeam1GoalsPaul(0);
			match.setTeam2GoalsPaul(3);
			
			matches.add(match);

			match = new Match();
			match.setIndex(42);
			match.setTeam1Index(Constants.BOSNIA_AND_HERZEGOVINA);
			match.setTeam2Index(Constants.IRAN);
			match.setDate("25 June 2014");
			match.setTime("13:00");
			match.setVenue("Arena Fonte Nova, Salvador");
			
			match.setTeam1Goals(3);    
			match.setTeam2Goals(1);

			match.setTeam1GoalsAdam(2);
			match.setTeam2GoalsAdam(0);

			match.setTeam1GoalsEmily(2);
			match.setTeam2GoalsEmily(0);

			match.setTeam1GoalsJohn(3);
			match.setTeam2GoalsJohn(1);

			match.setTeam1GoalsKyle(3);
			match.setTeam2GoalsKyle(0);

			match.setTeam1GoalsLuke(2);
			match.setTeam2GoalsLuke(0);

			match.setTeam1GoalsPaul(3);
			match.setTeam2GoalsPaul(1);
			
			matches.add(match);

			match = new Match();
			match.setIndex(43);
			match.setTeam1Index(Constants.HONDURAS);
			match.setTeam2Index(Constants.SWITZERLAND);
			match.setDate("25 June 2014");
			match.setTime("17:00");
			match.setVenue("Arena Amazônia, Manaus");
			
			match.setTeam1Goals(0);    
			match.setTeam2Goals(3);

			match.setTeam1GoalsAdam(0);
			match.setTeam2GoalsAdam(2);

			match.setTeam1GoalsEmily(0);
			match.setTeam2GoalsEmily(2);
			
			match.setTeam1GoalsJohn(2);
			match.setTeam2GoalsJohn(2);

			match.setTeam1GoalsKyle(1);
			match.setTeam2GoalsKyle(2);

			match.setTeam1GoalsLuke(0);
			match.setTeam2GoalsLuke(3);

			match.setTeam1GoalsPaul(0);
			match.setTeam2GoalsPaul(2);
			
			matches.add(match);

			match = new Match();
			match.setIndex(44);
			match.setTeam1Index(Constants.ECUADOR);
			match.setTeam2Index(Constants.FRANCE);
			match.setDate("25 June 2014");
			match.setTime("17:00");
			match.setVenue("Estádio do Maracanã, Rio de Janeiro");
			
			match.setTeam1Goals(0);    
			match.setTeam2Goals(0);

			match.setTeam1GoalsAdam(1);
			match.setTeam2GoalsAdam(3);

			match.setTeam1GoalsEmily(0);
			match.setTeam2GoalsEmily(2);

			match.setTeam1GoalsJohn(1);
			match.setTeam2GoalsJohn(2);

			match.setTeam1GoalsKyle(1);
			match.setTeam2GoalsKyle(1);

			match.setTeam1GoalsLuke(1);
			match.setTeam2GoalsLuke(2);

			match.setTeam1GoalsPaul(1);
			match.setTeam2GoalsPaul(2);
			
			matches.add(match);

			match = new Match();
			match.setIndex(45);
			match.setTeam1Index(Constants.UNITED_STATES);
			match.setTeam2Index(Constants.GERMANY);
			match.setDate("26 June 2014");
			match.setTime("13:00");
			match.setVenue("Arena Pernambuco, Recife");
			
			match.setTeam1Goals(0);    
			match.setTeam2Goals(1);

			match.setTeam1GoalsAdam(0);
			match.setTeam2GoalsAdam(4);

			match.setTeam1GoalsEmily(0);
			match.setTeam2GoalsEmily(1);

			match.setTeam1GoalsJohn(1);
			match.setTeam2GoalsJohn(4);

			match.setTeam1GoalsKyle(1);
			match.setTeam2GoalsKyle(4);

			match.setTeam1GoalsLuke(1);
			match.setTeam2GoalsLuke(2);

			match.setTeam1GoalsPaul(0);
			match.setTeam2GoalsPaul(3);
			
			matches.add(match);

			match = new Match();
			match.setIndex(46);
			match.setTeam1Index(Constants.PORTUGAL);
			match.setTeam2Index(Constants.GHANA);
			match.setDate("26 June 2014");
			match.setTime("13:00");
			match.setVenue("Estádio Nacional Mané Garrincha, Brasília");
			
			match.setTeam1Goals(2);    
			match.setTeam2Goals(1);

			match.setTeam1GoalsAdam(3);
			match.setTeam2GoalsAdam(1);

			match.setTeam1GoalsEmily(2);
			match.setTeam2GoalsEmily(1);

			match.setTeam1GoalsJohn(3);
			match.setTeam2GoalsJohn(1);

			match.setTeam1GoalsKyle(3);
			match.setTeam2GoalsKyle(1);

			match.setTeam1GoalsLuke(2);
			match.setTeam2GoalsLuke(2);

			match.setTeam1GoalsPaul(2);
			match.setTeam2GoalsPaul(0);
			
			matches.add(match);

			match = new Match();
			match.setIndex(47);
			match.setTeam1Index(Constants.SOUTH_KOREA);
			match.setTeam2Index(Constants.BELGIUM);
			match.setDate("26 June 2014");
			match.setTime("17:00");
			match.setVenue("Arena de São Paulo, São Paulo");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

			match.setTeam1GoalsAdam(0);
			match.setTeam2GoalsAdam(2);

			match.setTeam1GoalsEmily(0);
			match.setTeam2GoalsEmily(1);

			match.setTeam1GoalsJohn(0);
			match.setTeam2GoalsJohn(3);

			match.setTeam1GoalsKyle(1);
			match.setTeam2GoalsKyle(3);

			match.setTeam1GoalsLuke(1);
			match.setTeam2GoalsLuke(2);

			match.setTeam1GoalsPaul(0);
			match.setTeam2GoalsPaul(2);
			
			matches.add(match);

			match = new Match();
			match.setIndex(48);
			match.setTeam1Index(Constants.ALGERIA);
			match.setTeam2Index(Constants.RUSSIA);
			match.setDate("26 June 2014");
			match.setTime("17:00");
			match.setVenue("Arena da Baixada, Curitiba");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

			match.setTeam1GoalsAdam(0);
			match.setTeam2GoalsAdam(1);

			match.setTeam1GoalsEmily(1);
			match.setTeam2GoalsEmily(2);
			
			match.setTeam1GoalsJohn(2);
			match.setTeam2GoalsJohn(2);

			match.setTeam1GoalsKyle(1);
			match.setTeam2GoalsKyle(2);

			match.setTeam1GoalsLuke(0);
			match.setTeam2GoalsLuke(2);

			match.setTeam1GoalsPaul(0);
			match.setTeam2GoalsPaul(1);
			
			matches.add(match);

			for (Match _match : matches) {
				StringBuilder SQL = new StringBuilder();
				SQL.append("INSERT INTO \"Matches\" (");
				SQL.append("\"Date\", \"Index\", \"Team1\", \"Team2\", \"Time\", \"Venue\", ");
				SQL.append("\"Team1Goals\", \"Team2Goals\",");
				SQL.append("\"Team1GoalsAdam\", \"Team2GoalsAdam\",");
				SQL.append("\"Team1GoalsEmily\", \"Team2GoalsEmily\",");
				SQL.append("\"Team1GoalsKyle\", \"Team2GoalsKyle\",");
				SQL.append("\"Team1GoalsLuke\", \"Team2GoalsLuke\",");
				SQL.append("\"Team1GoalsNicola\", \"Team2GoalsNicola\",");
				SQL.append("\"Team1GoalsPaul\", \"Team2GoalsPaul\",");
				SQL.append("\"Team1GoalsJohn\", \"Team2GoalsJohn\"");
				SQL.append(") VALUES ('%s', %s, %s, %s, '%s', '%s', %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)");
				
				st.executeUpdate(String.format(SQL.toString(), 
								_match.getDate(), _match.getIndex(),
								_match.getTeam1Index(), _match.getTeam2Index(),
								_match.getTime(), _match.getVenue(),
								_match.getTeam1Goals(),
								_match.getTeam2Goals(),
								_match.getTeam1GoalsAdam(),
								_match.getTeam2GoalsAdam(),
								_match.getTeam1GoalsEmily(),
								_match.getTeam2GoalsEmily(),
								_match.getTeam1GoalsKyle(),
								_match.getTeam2GoalsKyle(),
								_match.getTeam1GoalsLuke(),
								_match.getTeam2GoalsLuke(),
								_match.getTeam1GoalsNicola(),
								_match.getTeam2GoalsNicola(),
								_match.getTeam1GoalsPaul(),
								_match.getTeam2GoalsPaul(),
								_match.getTeam1GoalsJohn(),
								_match.getTeam2GoalsJohn()
								));
			}
			
			ConnectionFactory.closeConnection(conn);
		} catch (Exception ex) {
			System.out.println("Exception in data loader: " + ex.getMessage());
		}
	}
}
