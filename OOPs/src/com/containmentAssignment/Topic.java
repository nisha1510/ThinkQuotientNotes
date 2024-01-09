package com.containmentAssignment;

public class Topic {
	private int id;
	private String name;
	private SubTopic subtopic;
	
	public Topic() {
		
	}
	public Topic(int id, String name, SubTopic subtopic) {
		super();
		this.id = id;
		this.name = name;
		this.subtopic = subtopic;
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

	public SubTopic getSubtopic() {
		return subtopic;
	}

	public void setSubtopic(SubTopic subtopic) {
		this.subtopic = subtopic;
	}

	@Override
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + ", " + subtopic + "]";
	}
	
}
