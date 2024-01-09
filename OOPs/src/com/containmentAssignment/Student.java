package com.containmentAssignment;

public class Student {
	private int roll;
	private String name;
	private Department dept;
	
	Student(){
		
	}

	public Student(int roll, String name, Department dept) {
		this.roll = roll;
		this.name = name;
		this.dept = dept;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", " + dept + "]";
	}
	
	
}
/*
WAP to have Department class created with id, name . Student class has
roll, name and Department object should have id and name. Assign and
print individual values in main method

*/