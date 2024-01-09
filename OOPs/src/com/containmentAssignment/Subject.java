package com.containmentAssignment;

public class Subject {
	private int id;
	private String name;
	private Topic topic;
	
	public Subject() {

	}
	public Subject(int id, String name, Topic topic) {
		super();
		this.id = id;
		this.name = name;
		this.topic = topic;
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

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", " + topic + "]";
	}
	
}
