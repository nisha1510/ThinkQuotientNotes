package com.containmentAssignment;

public class SubTopic {
	
	private int id;
	private String name;
	private Question que;
	
	public SubTopic() {
		
	}
	public SubTopic(int id, String name, Question que) {
		super();
		this.id = id;
		this.name = name;
		this.que = que;
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

	public Question getQue() {
		return que;
	}

	public void setQue(Question que) {
		this.que = que;
	}

	@Override
	public String toString() {
		return "SubTopic [id=" + id + ", name=" + name + ", " + que + "]";
	}
	
}
