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

	private int team1Goals;
	private int team2Goals;
	private int team1GoalsAdam;
	private int team2GoalsAdam;
	private int team1GoalsEmily;
	private int team2GoalsEmily;
	private int team1GoalsJohn;
	private int team2GoalsJohn;
	private int team1GoalsKyle;
	private int team2GoalsKyle;
	private int team1GoalsLuke;
	private int team2GoalsLuke;
	private int team1GoalsNicola;
	private int team2GoalsNicola;
	private int team1GoalsPaul;
	private int team2GoalsPaul;

	public int getMatchPointsForPerson(String person) {
		int goals1 = 0;
		int goals2 = 0;

		int result = 0;

		if (person.equalsIgnoreCase("Adam")) {
			goals1 = team1GoalsAdam;
			goals2 = team2GoalsAdam;
		}
		if (person.equalsIgnoreCase("Emily")) {
			goals1 = team1GoalsEmily;
			goals2 = team2GoalsEmily;
		}
		if (person.equalsIgnoreCase("John")) {
			goals1 = team1GoalsJohn;
			goals2 = team2GoalsJohn;
		}
		if (person.equalsIgnoreCase("Kyle")) {
			goals1 = team1GoalsKyle;
			goals2 = team2GoalsKyle;
		}
		if (person.equalsIgnoreCase("Luke")) {
			goals1 = team1GoalsLuke;
			goals2 = team2GoalsLuke;
		}
		if (person.equalsIgnoreCase("Paul")) {
			goals1 = team1GoalsPaul;
			goals2 = team2GoalsPaul;
		}

		if (team1Goals == goals1 && team2Goals == goals2) {
			result = 4;
		} else {
			if (team1Goals > team2Goals) {
				if (goals1 > goals2) {
					result = 1;

					if (goals1 == team1Goals || goals2 == team2Goals) {
						result += 1;
					}
				}
			}
			if (team1Goals < team2Goals) {
				if (goals1 < goals2) {
					result = 1;

					if (goals1 == team1Goals || goals2 == team2Goals) {
						result += 1;
					}
				}
			}
		}

		return result;
	}

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

	public int getTeam1Goals() {
		return team1Goals;
	}

	public void setTeam1Goals(int team1Goals) {
		this.team1Goals = team1Goals;
	}

	public int getTeam2Goals() {
		return team2Goals;
	}

	public void setTeam2Goals(int team2Goals) {
		this.team2Goals = team2Goals;
	}

	public int getTeam1GoalsAdam() {
		return team1GoalsAdam;
	}

	public void setTeam1GoalsAdam(int team1GoalsAdam) {
		this.team1GoalsAdam = team1GoalsAdam;
	}

	public int getTeam2GoalsAdam() {
		return team2GoalsAdam;
	}

	public void setTeam2GoalsAdam(int team2GoalsAdam) {
		this.team2GoalsAdam = team2GoalsAdam;
	}

	public int getTeam1GoalsEmily() {
		return team1GoalsEmily;
	}

	public void setTeam1GoalsEmily(int team1GoalsEmily) {
		this.team1GoalsEmily = team1GoalsEmily;
	}

	public int getTeam2GoalsEmily() {
		return team2GoalsEmily;
	}

	public void setTeam2GoalsEmily(int team2GoalsEmily) {
		this.team2GoalsEmily = team2GoalsEmily;
	}

	public int getTeam1GoalsLuke() {
		return team1GoalsLuke;
	}

	public void setTeam1GoalsLuke(int team1GoalsLuke) {
		this.team1GoalsLuke = team1GoalsLuke;
	}

	public int getTeam2GoalsLuke() {
		return team2GoalsLuke;
	}

	public void setTeam2GoalsLuke(int team2GoalsLuke) {
		this.team2GoalsLuke = team2GoalsLuke;
	}

	public int getTeam1GoalsPaul() {
		return team1GoalsPaul;
	}

	public void setTeam1GoalsPaul(int team1GoalsPaul) {
		this.team1GoalsPaul = team1GoalsPaul;
	}

	public int getTeam2GoalsPaul() {
		return team2GoalsPaul;
	}

	public void setTeam2GoalsPaul(int team2GoalsPaul) {
		this.team2GoalsPaul = team2GoalsPaul;
	}

	public int getTeam1GoalsKyle() {
		return team1GoalsKyle;
	}

	public void setTeam1GoalsKyle(int team1GoalsKyle) {
		this.team1GoalsKyle = team1GoalsKyle;
	}

	public int getTeam2GoalsKyle() {
		return team2GoalsKyle;
	}

	public void setTeam2GoalsKyle(int team2GoalsKyle) {
		this.team2GoalsKyle = team2GoalsKyle;
	}

	public int getTeam1GoalsNicola() {
		return team1GoalsNicola;
	}

	public void setTeam1GoalsNicola(int team1GoalsNicola) {
		this.team1GoalsNicola = team1GoalsNicola;
	}

	public int getTeam2GoalsNicola() {
		return team2GoalsNicola;
	}

	public void setTeam2GoalsNicola(int team2GoalsNicola) {
		this.team2GoalsNicola = team2GoalsNicola;
	}

	public int getTeam1GoalsJohn() {
		return team1GoalsJohn;
	}

	public void setTeam1GoalsJohn(int team1GoalsJohn) {
		this.team1GoalsJohn = team1GoalsJohn;
	}

	public int getTeam2GoalsJohn() {
		return team2GoalsJohn;
	}

	public void setTeam2GoalsJohn(int team2GoalsJohn) {
		this.team2GoalsJohn = team2GoalsJohn;
	}
}
