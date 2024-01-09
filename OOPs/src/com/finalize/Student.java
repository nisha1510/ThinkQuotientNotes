package com.finalize;

public class Student {
	private int id;
	private String name;
	
	Student(){
		
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	@SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		System.out.println("In finalize method...");
		super.finalize();
	}
}
