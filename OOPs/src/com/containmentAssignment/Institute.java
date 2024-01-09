package com.containmentAssignment;

public class Institute {
	private int id;
	private String name;
	private Branch branch;
	
	public Institute() {
		super();
	}

	public Institute(int id, String name, Branch branch) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Institute [id=" + id + ", name=" + name + ", " + branch + "]";
	}
	
	
}
