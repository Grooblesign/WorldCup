package uk.me.paulgarner.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import uk.me.paulgarner.model.Constants;
import uk.me.paulgarner.model.Match;
import uk.me.paulgarner.model.Team;

public class DataLoader {

	static Logger logger = Logger.getLogger("uk.me.paulgarner");

	public static void Load() throws SQLException {
		Connection conn = ConnectionFactory.getConnection();
		Statement st = conn.createStatement();

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
							team.getGroup(), team.getIndex(), team.getName()));
		}

		st.executeUpdate("TRUNCATE Table \"Matches\"");

		List<Match> matches = new ArrayList<Match>();
		Match match = null;

		// Group A
		match = new Match();
		match.setTeam1Index(Constants.BRAZIL);
		match.setTeam2Index(Constants.CROATIA);
		match.setIndex(1);
		match.setDate("12 June 2014");
		match.setTime("17:00");
		match.setVenue("Arena de São Paulo, São Paulo");
		matches.add(match);

		match = new Match();
		match.setTeam1Index(Constants.MEXICO);
		match.setTeam2Index(Constants.CAMEROON);
		match.setIndex(2);
		match.setDate("13 June 2014");
		match.setTime("13:00");
		match.setVenue("Arena das Dunas, Natal");
		matches.add(match);

		match = new Match();
		match.setTeam1Index(Constants.BRAZIL);
		match.setTeam2Index(Constants.MEXICO);
		match.setIndex(17);
		match.setDate("17 June 2014");
		match.setTime("16:00");
		match.setVenue("Estádio Castelão, Fortaleza");
		matches.add(match);

		match = new Match();
		match.setTeam1Index(Constants.CAMEROON);
		match.setTeam2Index(Constants.CROATIA);
		match.setIndex(18);
		match.setDate("18 June 2014");
		match.setTime("19:00");
		match.setVenue("Arena Amazônia, Manaus");
		matches.add(match);

		match = new Match();
		match.setTeam1Index(Constants.CAMEROON);
		match.setTeam2Index(Constants.BRAZIL);
		match.setIndex(33);
		match.setDate("23 June 2014");
		match.setTime("17:00");
		match.setVenue("Estádio Nacional Mané Garrincha, Brasília");
		matches.add(match);

		match = new Match();
		match.setTeam1Index(Constants.CROATIA);
		match.setTeam2Index(Constants.MEXICO);
		match.setIndex(34);
		match.setDate("23 June 2014");
		match.setTime("17:00");
		match.setVenue("Arena Pernambuco, Recife");
		matches.add(match);

		// Group B
		match = new Match();
		match.setTeam1Index(Constants.SPAIN);
		match.setTeam2Index(Constants.NETHERLANDS);
		match.setIndex(3);
		match.setDate("13 June 2014");
		match.setTime("16:00");
		match.setVenue("Arena Fonte Nova, Salvador");
		matches.add(match);

		match = new Match();
		match.setTeam1Index(Constants.CHILE);
		match.setTeam2Index(Constants.AUSTRALIA);
		match.setIndex(4);
		match.setDate("13 June 2014");
		match.setTime("19:00");
		match.setVenue("Arena Pantanal, Cuiabá");
		matches.add(match);

		match = new Match();
		match.setIndex(20);
		match.setTeam1Index(Constants.AUSTRALIA);
		match.setTeam2Index(Constants.NETHERLANDS);
		match.setDate("18 June 2014");
		match.setTime("13:00");
		match.setVenue("Estádio Beira-Rio, Porto Alegre");
		matches.add(match);

		match = new Match();
		match.setIndex(19);
		match.setTeam1Index(Constants.SPAIN);
		match.setTeam2Index(Constants.CHILE);
		match.setDate("18 June 2014");
		match.setTime("16:00");
		match.setVenue("Estádio do Maracanã, Rio de Janeiro");
		matches.add(match);

		match = new Match();
		match.setIndex(35);
		match.setTeam1Index(Constants.AUSTRALIA);
		match.setTeam2Index(Constants.SPAIN);
		match.setDate("23 June 2014");
		match.setTime("13:00");
		match.setVenue("Arena da Baixada, Curitiba");
		matches.add(match);

		match = new Match();
		match.setIndex(36);
		match.setTeam1Index(Constants.NETHERLANDS);
		match.setTeam2Index(Constants.CHILE);
		match.setDate("23 June 2014");
		match.setTime("13:00");
		match.setVenue("Arena de São Paulo, São Paulo");
		matches.add(match);

		// Group C
		match = new Match();
		match.setIndex(5);
		match.setTeam1Index(Constants.COLOMBIA);
		match.setTeam2Index(Constants.GREECE);
		match.setDate("14 June 2014");
		match.setTime("13:00");
		match.setVenue("Estádio Mineirão, Belo Horizonte");
		matches.add(match);

		match = new Match();
		match.setIndex(6);
		match.setTeam1Index(Constants.IVORY_COAST);
		match.setTeam2Index(Constants.JAPAN);
		match.setDate("14 June 2014");
		match.setTime("22:00");
		match.setVenue("Arena Pernambuco, Recife");
		matches.add(match);

		match = new Match();
		match.setIndex(21);
		match.setTeam1Index(Constants.COLOMBIA);
		match.setTeam2Index(Constants.IVORY_COAST);
		match.setDate("19 June 2014");
		match.setTime("13:00");
		match.setVenue("Estádio Nacional Mané Garrincha, Brasília");
		matches.add(match);

		match = new Match();
		match.setIndex(22);
		match.setTeam1Index(Constants.JAPAN);
		match.setTeam2Index(Constants.GREECE);
		match.setDate("19 June 2014");
		match.setTime("19:00");
		match.setVenue("Arena das Dunas, Natal");
		matches.add(match);

		match = new Match();
		match.setIndex(37);
		match.setTeam1Index(Constants.JAPAN);
		match.setTeam2Index(Constants.COLOMBIA);
		match.setDate("24 June 2014");
		match.setTime("17:00");
		match.setVenue("Arena Pantanal, Cuiabá");
		matches.add(match);

		match = new Match();
		match.setIndex(38);
		match.setTeam1Index(Constants.GREECE);
		match.setTeam2Index(Constants.IVORY_COAST);
		match.setDate("24 June 2014");
		match.setTime("17:00");
		match.setVenue("Estádio Castelão, Fortaleza");
		matches.add(match);

		// Group D
		match = new Match();
		match.setIndex(7);
		match.setTeam1Index(Constants.URUGUAY);
		match.setTeam2Index(Constants.COSTA_RICA);
		match.setDate("14 June 2014");
		match.setTime("16:00");
		match.setVenue("Estádio Castelão, Fortaleza");
		matches.add(match);
		
		match = new Match();
		match.setIndex(8);
		match.setTeam1Index(Constants.ENGLAND);
		match.setTeam2Index(Constants.ITALY);
		match.setDate("14 June 2014");
		match.setTime("19:00");
		match.setVenue("Arena Amazônia, Manaus");
		matches.add(match);
		
		match = new Match();
		match.setIndex(23);
		match.setTeam1Index(Constants.URUGUAY);
		match.setTeam2Index(Constants.ENGLAND);
		match.setDate("19 June 2014");
		match.setTime("16:00");
		match.setVenue("Arena de São Paulo, São Paulo");
		matches.add(match);
		
		match = new Match();
		match.setIndex(24);
		match.setTeam1Index(Constants.ITALY);
		match.setTeam2Index(Constants.COSTA_RICA);
		match.setDate("20 June 2014");
		match.setTime("13:00");
		match.setVenue("Arena Pernambuco, Recife");
		matches.add(match);
		
		match = new Match();
		match.setIndex(39);
		match.setTeam1Index(Constants.ITALY);
		match.setTeam2Index(Constants.URUGUAY);
		match.setDate("24 June 2014");
		match.setTime("13:00");
		match.setVenue("Arena das Dunas, Natal");
		matches.add(match);
		
		match = new Match();
		match.setIndex(40);
		match.setTeam1Index(Constants.COSTA_RICA);
		match.setTeam2Index(Constants.ENGLAND);
		match.setDate("24 June 2014");
		match.setTime("13:00");
		match.setVenue("Estádio Mineirão, Belo Horizonte");
		matches.add(match);
		
		// Group E
		match = new Match();
		match.setIndex(9);
		match.setTeam1Index(Constants.SWITZERLAND);
		match.setTeam2Index(Constants.ECUADOR);
		match.setDate("15 June 2014");
		match.setTime("13:00");
		match.setVenue("Estádio Nacional Mané Garrincha, Brasília");
		matches.add(match);
		
		match = new Match();
		match.setIndex(10);
		match.setTeam1Index(Constants.FRANCE);
		match.setTeam2Index(Constants.HONDURAS);
		match.setDate("15 June 2014");
		match.setTime("16:00");
		match.setVenue("Estádio Beira-Rio, Porto Alegre");
		matches.add(match);
		
		match = new Match();
		match.setIndex(25);
		match.setTeam1Index(Constants.SWITZERLAND);
		match.setTeam2Index(Constants.FRANCE);
		match.setDate("20 June 2014");
		match.setTime("16:00");
		match.setVenue("Arena Fonte Nova, Salvador");
		matches.add(match);

		match = new Match();
		match.setIndex(26);
		match.setTeam1Index(Constants.HONDURAS);
		match.setTeam2Index(Constants.ECUADOR);
		match.setDate("20 June 2014");
		match.setTime("19:00");
		match.setVenue("Arena da Baixada, Curitiba");
		matches.add(match);
		
		match = new Match();
		match.setIndex(41);
		match.setTeam1Index(Constants.HONDURAS);
		match.setTeam2Index(Constants.SWITZERLAND);
		match.setDate("25 June 2014");
		match.setTime("17:00");
		match.setVenue("Arena Amazônia, Manaus");
		matches.add(match);
		
		match = new Match();
		match.setIndex(42);
		match.setTeam1Index(Constants.ECUADOR);
		match.setTeam2Index(Constants.FRANCE);
		match.setDate("25 June 2014");
		match.setTime("17:00");
		match.setVenue("Estádio do Maracanã, Rio de Janeiro");
		matches.add(match);
		
		// Group F
		match = new Match();
		match.setIndex(11);
		match.setTeam1Index(Constants.ARGENTINA);
		match.setTeam2Index(Constants.BOSNIA_AND_HERZEGOVINA);
		match.setDate("15 June 2014");
		match.setTime("19:00");
		match.setVenue("Estádio do Maracanã, Rio de Janeiro");
		matches.add(match);
		
		match = new Match();
		match.setIndex(12);
		match.setTeam1Index(Constants.IRAN);
		match.setTeam2Index(Constants.NIGERIA);
		match.setDate("16 June 2014");
		match.setTime("16:00");
		match.setVenue("Arena da Baixada, Curitiba");
		matches.add(match);
		
		match = new Match();
		match.setIndex(27);
		match.setTeam1Index(Constants.ARGENTINA);
		match.setTeam2Index(Constants.IRAN);
		match.setDate("21 June 2014");
		match.setTime("13:00");
		match.setVenue("Estádio Mineirão, Belo Horizonte");
		matches.add(match);
		
		match = new Match();
		match.setIndex(28);
		match.setTeam1Index(Constants.NIGERIA);
		match.setTeam2Index(Constants.BOSNIA_AND_HERZEGOVINA);
		match.setDate("21 June 2014");
		match.setTime("19:00");
		match.setVenue("Arena Pantanal, Cuiabá");
		matches.add(match);
		
		match = new Match();
		match.setIndex(43);
		match.setTeam1Index(Constants.NIGERIA);
		match.setTeam2Index(Constants.ARGENTINA);
		match.setDate("25 June 2014");
		match.setTime("13:00");
		match.setVenue("Estádio Beira-Rio, Porto Alegre");
		matches.add(match);

		match = new Match();
		match.setIndex(44);
		match.setTeam1Index(Constants.BOSNIA_AND_HERZEGOVINA);
		match.setTeam2Index(Constants.IRAN);
		match.setDate("25 June 2014");
		match.setTime("13:00");
		match.setVenue("Arena Fonte Nova, Salvador");
		matches.add(match);
		
		// Group G
		match = new Match();
		match.setIndex(13);
		match.setTeam1Index(Constants.GERMANY);
		match.setTeam2Index(Constants.PORTUGAL);
		match.setDate("16 June 2014");
		match.setTime("13:00");
		match.setVenue("Arena Fonte Nova, Salvador");
		matches.add(match);
		
		match = new Match();
		match.setIndex(14);
		match.setTeam1Index(Constants.GHANA);
		match.setTeam2Index(Constants.UNITED_STATES);
		match.setDate("16 June 2014");
		match.setTime("19:00");
		match.setVenue("Arena das Dunas, Natal");
		matches.add(match);
		
		match = new Match();
		match.setIndex(29);
		match.setTeam1Index(Constants.GERMANY);
		match.setTeam2Index(Constants.GHANA);
		match.setDate("21 June 2014");
		match.setTime("16:00");
		match.setVenue("Estádio Castelão, Fortaleza");
		matches.add(match);
		
		match = new Match();
		match.setIndex(30);
		match.setTeam1Index(Constants.UNITED_STATES);
		match.setTeam2Index(Constants.PORTUGAL);
		match.setDate("22 June 2014");
		match.setTime("19:00");
		match.setVenue("Arena Amazônia, Manaus");
		matches.add(match);
		
		match = new Match();
		match.setIndex(45);
		match.setTeam1Index(Constants.UNITED_STATES);
		match.setTeam2Index(Constants.GERMANY);
		match.setDate("26 June 2014");
		match.setTime("13:00");
		match.setVenue("Arena Pernambuco, Recife");
		matches.add(match);
		
		match = new Match();
		match.setIndex(46);
		match.setTeam1Index(Constants.PORTUGAL);
		match.setTeam2Index(Constants.GHANA);
		match.setDate("26 June 2014");
		match.setTime("13:00");
		match.setVenue("Estádio Nacional Mané Garrincha, Brasília");
		matches.add(match);
		
		// Group H
		match = new Match();
		match.setIndex(15);
		match.setTeam1Index(Constants.BELGIUM);
		match.setTeam2Index(Constants.ALGERIA);
		match.setDate("17 June 2014");
		match.setTime("13:00");
		match.setVenue("Estádio Mineirão, Belo Horizonte");
		matches.add(match);
		
		match = new Match();
		match.setIndex(16);
		match.setTeam1Index(Constants.RUSSIA);
		match.setTeam2Index(Constants.SOUTH_KOREA);
		match.setDate("17 June 2014");
		match.setTime("19:00");
		match.setVenue("Arena Pantanal, Cuiabá");
		matches.add(match);

		match = new Match();
		match.setIndex(31);
		match.setTeam1Index(Constants.BELGIUM);
		match.setTeam2Index(Constants.RUSSIA);
		match.setDate("22 June 2014");
		match.setTime("13:00");
		match.setVenue("Estádio do Maracanã, Rio de Janeiro");
		matches.add(match);

		match = new Match();
		match.setIndex(32);
		match.setTeam1Index(Constants.SOUTH_KOREA);
		match.setTeam2Index(Constants.ALGERIA);
		match.setDate("22 June 2014");
		match.setTime("16:00");
		match.setVenue("Estádio Beira-Rio, Porto Alegre");
		matches.add(match);

		match = new Match();
		match.setIndex(47);
		match.setTeam1Index(Constants.SOUTH_KOREA);
		match.setTeam2Index(Constants.BELGIUM);
		match.setDate("26 June 2014");
		match.setTime("17:00");
		match.setVenue("Arena de São Paulo, São Paulo");
		matches.add(match);
		
		match = new Match();
		match.setIndex(48);
		match.setTeam1Index(Constants.ALGERIA);
		match.setTeam2Index(Constants.RUSSIA);
		match.setDate("26 June 2014");
		match.setTime("17:00");
		match.setVenue("Arena da Baixada, Curitiba");
		matches.add(match);
		
		try {

			for (Match _match : matches) {
				st.executeUpdate(String
						.format("INSERT INTO \"Matches\" (\"Date\", \"Index\", \"Team1\", \"Team2\", \"Time\", \"Venue\") VALUES ('%s', %s, %s, %s, '%s', '%s')",
								_match.getDate(), _match.getIndex(),
								_match.getTeam1Index(), _match.getTeam2Index(),
								_match.getTime(), _match.getVenue()));
			}
		} catch (Exception ex) {
			logger.info(ex.getMessage());
		}

		ConnectionFactory.closeConnection(conn);
	}
}
