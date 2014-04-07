package uk.me.paulgarner.model;

public class Match {
	private int index;
	private int team1Index;
	private int team2Index;
	private String team1Name;
	private String team2Name;
	private String date;
	private String time;
	private String venue;
	
	private int Team1Goals;
	private int Team2Goals;
	private int Team1GoalsAdam;
	private int Team2GoalsAdam;
	private int Team1GoalsEmily;
	private int Team2GoalsEmily;
	private int Team1GoalsLuke;
	private int Team2GoalsLuke;
	private int Team1GoalsPaul;
	private int Team2GoalsPaul;
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getTeam1Index() {
		return team1Index;
	}
	public void setTeam1Index(int team1Index) {
		this.team1Index = team1Index;
	}
	public int getTeam2Index() {
		return team2Index;
	}
	public void setTeam2Index(int team2Index) {
		this.team2Index = team2Index;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getTeam1Name() {
		return team1Name;
	}
	public void setTeam1Name(String team1Name) {
		this.team1Name = team1Name;
	}
	public String getTeam2Name() {
		return team2Name;
	}
	public void setTeam2Name(String team2Name) {
		this.team2Name = team2Name;
	}
}
