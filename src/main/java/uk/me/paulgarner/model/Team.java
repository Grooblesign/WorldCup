package uk.me.paulgarner.model;

public class Team {

	private int index;
	private String name;
	private String group;
	
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
}
