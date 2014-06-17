package uk.me.paulgarner.model;

import java.sql.SQLException;

import uk.me.paulgarner.service.TeamService;

public class Player {
	private int index;
	private String name;
	private String position;
	private int teamIndex;
	private int goals;
	private int assists;
	private int cleanSheets;
	private int half;
	private int full;
	private int yellowCards;
	private int redCards;
	private int penaltyMiss;

	public String getTeamName() throws SQLException {
		TeamService service = new TeamService();
		Team team = service.find(teamIndex);

		return team.getName();
	}

	public int getPoints() {
		int points = (assists * 4) + (cleanSheets * 4) + (half * 1) + (full * 2) + (penaltyMiss * -2) + (yellowCards * -1) + (redCards * -2);
		
		if (position == "D")
			points = points + (goals * 6);
		else if (position == "M")
			points = points + (goals * 5);
		else
			points = points + (goals * 4);
				
		return points;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}

	public int getCleanSheets() {
		return cleanSheets;
	}

	public void setCleanSheets(int cleanSheets) {
		this.cleanSheets = cleanSheets;
	}

	public int getHalf() {
		return half;
	}

	public void setHalf(int half) {
		this.half = half;
	}

	public int getFull() {
		return full;
	}

	public void setFull(int full) {
		this.full = full;
	}

	public int getYellowCards() {
		return yellowCards;
	}

	public void setYellowCards(int yellowCards) {
		this.yellowCards = yellowCards;
	}

	public int getRedCards() {
		return redCards;
	}

	public void setRedCards(int redCards) {
		this.redCards = redCards;
	}

	public int getPenaltyMiss() {
		return penaltyMiss;
	}

	public void setPenaltyMiss(int penaltyMiss) {
		this.penaltyMiss = penaltyMiss;
	}

	public void setTeamIndex(int teamIndex) {
		this.teamIndex = teamIndex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getTeamIndex() {
		return teamIndex;
	}
}
