package uk.me.paulgarner.model;

public class Person implements Comparable {
	private String name;
	private int exact;
	private int result;
	private int bonus;
	private int points;
	
	public int getPoints() {
		return (exact * 4) + (result) + (bonus);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExact() {
		return exact;
	}

	public void setExact(int exact) {
		this.exact = exact;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int compareTo(Object o) {
		Person that = (Person)o;
		
		if (this.getPoints() == that.getPoints()) {
			if (this.getExact() == that.getExact())
				return 0;
			else if (this.getExact() < that.getExact())
				return 1;
			else
				return -1;
		} else if (this.getPoints() < that.getPoints())
			return 1;
		else
			return -1;
	}
}
