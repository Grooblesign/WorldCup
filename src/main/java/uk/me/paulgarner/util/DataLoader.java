package uk.me.paulgarner.util;

import java.io.File;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

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
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			match.setIndex(16);
			match.setTeam1Index(Constants.RUSSIA);
			match.setTeam2Index(Constants.SOUTH_KOREA);
			match.setDate("17 June 2014");
			match.setTime("19:00");
			match.setVenue("Arena Pantanal, Cuiabá");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			match.setTeam1Index(Constants.BRAZIL);
			match.setTeam2Index(Constants.MEXICO);
			match.setIndex(17);
			match.setDate("17 June 2014");
			match.setTime("16:00");
			match.setVenue("Estádio Castelão, Fortaleza");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			match.setTeam1Index(Constants.CAMEROON);
			match.setTeam2Index(Constants.CROATIA);
			match.setIndex(18);
			match.setDate("18 June 2014");
			match.setTime("19:00");
			match.setVenue("Arena Amazônia, Manaus");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			match.setIndex(19);
			match.setTeam1Index(Constants.SPAIN);
			match.setTeam2Index(Constants.CHILE);
			match.setDate("18 June 2014");
			match.setTime("16:00");
			match.setVenue("Estádio do Maracanã, Rio de Janeiro");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			match.setIndex(20);
			match.setTeam1Index(Constants.AUSTRALIA);
			match.setTeam2Index(Constants.NETHERLANDS);
			match.setDate("18 June 2014");
			match.setTime("13:00");
			match.setVenue("Estádio Beira-Rio, Porto Alegre");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			match.setIndex(21);
			match.setTeam1Index(Constants.COLOMBIA);
			match.setTeam2Index(Constants.IVORY_COAST);
			match.setDate("19 June 2014");
			match.setTime("13:00");
			match.setVenue("Estádio Nacional Mané Garrincha, Brasília");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			match.setTeam1Index(Constants.JAPAN);
			match.setTeam2Index(Constants.GREECE);
			match.setDate("19 June 2014");
			match.setTime("19:00");
			match.setVenue("Arena das Dunas, Natal");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			match.setIndex(23);
			match.setTeam1Index(Constants.URUGUAY);
			match.setTeam2Index(Constants.ENGLAND);
			match.setDate("19 June 2014");
			match.setTime("16:00");
			match.setVenue("Arena de São Paulo, São Paulo");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

			match.setTeam1GoalsAdam(2);
			match.setTeam2GoalsAdam(2);
			
			match.setTeam1GoalsEmily(0);
			match.setTeam2GoalsEmily(1);

			match.setTeam1GoalsJohn(4);
			match.setTeam2GoalsJohn(2);

			match.setTeam1GoalsKyle(1);
			match.setTeam2GoalsKyle(1);

			match.setTeam1GoalsLuke(2);
			match.setTeam2GoalsLuke(1);

			match.setTeam1GoalsPaul(1);
			match.setTeam2GoalsPaul(1);
			
			matches.add(match);

			match = new Match();
			match.setIndex(24);
			match.setTeam1Index(Constants.ITALY);
			match.setTeam2Index(Constants.COSTA_RICA);
			match.setDate("20 June 2014");
			match.setTime("13:00");
			match.setVenue("Arena Pernambuco, Recife");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			match.setTeam1Index(Constants.NIGERIA);
			match.setTeam2Index(Constants.BOSNIA_AND_HERZEGOVINA);
			match.setDate("21 June 2014");
			match.setTime("19:00");
			match.setVenue("Arena Pantanal, Cuiabá");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			match.setIndex(29);
			match.setTeam1Index(Constants.GERMANY);
			match.setTeam2Index(Constants.GHANA);
			match.setDate("21 June 2014");
			match.setTime("16:00");
			match.setVenue("Estádio Castelão, Fortaleza");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			match.setIndex(30);
			match.setTeam1Index(Constants.UNITED_STATES);
			match.setTeam2Index(Constants.PORTUGAL);
			match.setDate("22 June 2014");
			match.setTime("19:00");
			match.setVenue("Arena Amazônia, Manaus");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			match.setIndex(31);
			match.setTeam1Index(Constants.BELGIUM);
			match.setTeam2Index(Constants.RUSSIA);
			match.setDate("22 June 2014");
			match.setTime("13:00");
			match.setVenue("Estádio do Maracanã, Rio de Janeiro");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);
			
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
			match.setIndex(32);
			match.setTeam1Index(Constants.SOUTH_KOREA);
			match.setTeam2Index(Constants.ALGERIA);
			match.setDate("22 June 2014");
			match.setTime("16:00");
			match.setVenue("Estádio Beira-Rio, Porto Alegre");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			match.setTeam1Index(Constants.CAMEROON);
			match.setTeam2Index(Constants.BRAZIL);
			match.setIndex(33);
			match.setDate("23 June 2014");
			match.setTime("17:00");
			match.setVenue("Estádio Nacional Mané Garrincha, Brasília");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			match.setIndex(34);
			match.setDate("23 June 2014");
			match.setTime("17:00");
			match.setVenue("Arena Pernambuco, Recife");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			match.setIndex(35);
			match.setTeam1Index(Constants.AUSTRALIA);
			match.setTeam2Index(Constants.SPAIN);
			match.setDate("23 June 2014");
			match.setTime("13:00");
			match.setVenue("Arena da Baixada, Curitiba");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);
			
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
			match.setIndex(36);
			match.setTeam1Index(Constants.NETHERLANDS);
			match.setTeam2Index(Constants.CHILE);
			match.setDate("23 June 2014");
			match.setTime("13:00");
			match.setVenue("Arena de São Paulo, São Paulo");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			match.setIndex(37);
			match.setTeam1Index(Constants.JAPAN);
			match.setTeam2Index(Constants.COLOMBIA);
			match.setDate("24 June 2014");
			match.setTime("17:00");
			match.setVenue("Arena Pantanal, Cuiabá");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			match.setIndex(38);
			match.setTeam1Index(Constants.GREECE);
			match.setTeam2Index(Constants.IVORY_COAST);
			match.setDate("24 June 2014");
			match.setTime("17:00");
			match.setVenue("Estádio Castelão, Fortaleza");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			match.setIndex(39);
			match.setTeam1Index(Constants.ITALY);
			match.setTeam2Index(Constants.URUGUAY);
			match.setDate("24 June 2014");
			match.setTime("13:00");
			match.setVenue("Arena das Dunas, Natal");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			match.setIndex(40);
			match.setTeam1Index(Constants.COSTA_RICA);
			match.setTeam2Index(Constants.ENGLAND);
			match.setDate("24 June 2014");
			match.setTime("13:00");
			match.setVenue("Estádio Mineirão, Belo Horizonte");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			match.setIndex(41);
			match.setTeam1Index(Constants.HONDURAS);
			match.setTeam2Index(Constants.SWITZERLAND);
			match.setDate("25 June 2014");
			match.setTime("17:00");
			match.setVenue("Arena Amazônia, Manaus");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			match.setIndex(42);
			match.setTeam1Index(Constants.ECUADOR);
			match.setTeam2Index(Constants.FRANCE);
			match.setDate("25 June 2014");
			match.setTime("17:00");
			match.setVenue("Estádio do Maracanã, Rio de Janeiro");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			match.setIndex(43);
			match.setTeam1Index(Constants.NIGERIA);
			match.setTeam2Index(Constants.ARGENTINA);
			match.setDate("25 June 2014");
			match.setTime("13:00");
			match.setVenue("Estádio Beira-Rio, Porto Alegre");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			match.setIndex(44);
			match.setTeam1Index(Constants.BOSNIA_AND_HERZEGOVINA);
			match.setTeam2Index(Constants.IRAN);
			match.setDate("25 June 2014");
			match.setTime("13:00");
			match.setVenue("Arena Fonte Nova, Salvador");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			match.setIndex(45);
			match.setTeam1Index(Constants.UNITED_STATES);
			match.setTeam2Index(Constants.GERMANY);
			match.setDate("26 June 2014");
			match.setTime("13:00");
			match.setVenue("Arena Pernambuco, Recife");
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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
			
			match.setTeam1Goals(-1);    
			match.setTeam2Goals(-1);

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

			File fXmlFile = new File(
					"c:\\dev\\WorldCup\\app\\data\\players.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

			doc.getDocumentElement().normalize();

			System.out.println("Root element :"
					+ doc.getDocumentElement().getNodeName());

			NodeList nList = doc.getElementsByTagName("player");

			List<Player> player = new ArrayList<Player>();

			ConnectionFactory.closeConnection(conn);
		} catch (Exception ex) {
			System.out.println("Exception in data loader: " + ex.getMessage());
		}
	}
}
