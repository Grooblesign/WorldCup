package uk.me.paulgarner.model;

public class Team {

	private int index;
	private String name;
	private String group;
	
	private int won;
	private int drawn;
	private int lost;
	private int goalsFor;
	private int goalsAgainst;
	private int points;
	
	public Team() {
	
	}
	
	public Team(String name, String group, int index) {
		this.name = name;
		this.group = group;
		this.index = index;
	}

	public int getIndex() {
		return index;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGroup() {
		return group;
	}
	
	public void setGroup(String group) {
		this.group = group;
	}

	public int getWon() {
		return won;
	}

	public void setWon(int won) {
		this.won = won;
	}

	public int getDrawn() {
		return drawn;
	}

	public void setDrawn(int drawn) {
		this.drawn = drawn;
	}

	public int getLost() {
		return lost;
	}

	public void setLost(int lost) {
		this.lost = lost;
	}

	public int getGoalsFor() {
		return goalsFor;
	}

	public void setGoalsFor(int goalsFor) {
		this.goalsFor = goalsFor;
	}

	public int getGoalsAgainst() {
		return goalsAgainst;
	}

	public void setGoalsAgainst(int goalsAgainst) {
		this.goalsAgainst = goalsAgainst;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
}
