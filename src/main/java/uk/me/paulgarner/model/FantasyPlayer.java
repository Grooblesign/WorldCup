package uk.me.paulgarner.model;

public class FantasyPlayer implements Comparable {
	private String name;
	private int points;
	
	public int compareTo(Object o) {
		FantasyPlayer that = (FantasyPlayer)o;
		
		if (this.getPoints() == that.getPoints()) {
			return 0;
		} else if (this.getPoints() < that.getPoints())
			return 1;
		else
			return -1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
}
