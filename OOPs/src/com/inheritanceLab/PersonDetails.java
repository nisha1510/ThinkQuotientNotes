package com.inheritanceLab;

import java.util.Scanner;

public class PersonDetails {
	public static void main(String[] args) {
		Student s1 = new Student("Nisha",23,101);
		System.out.println(s1);
		s1.display();
		Person p = new Person();
		p.show();
		
	}

}
class Person{
	
	protected String perName;
	protected int perAge;
	
	public Person() {
		
	}
	public Person(String perName, int perAge) {
		this.perName = perName;
		this.perAge = perAge;
	}
	
	public String getPerName() {
		return perName;
	}
	public void setPerName(String perName) {
		this.perName = perName;
	}
	public int getPerAge() {
		return perAge;
	}
	public void setPerAge(int perAge) {
		this.perAge = perAge;
	}
	
	@Override
	public String toString() {
		return "Person [perName=" + perName + ", perAge=" + perAge + "]";
	}
	
	public static void show() {
		
		System.out.println("Inside Parent class method");
		
	}
}

class Student extends Person{
	
	private int rollNo;
	
	public Student() {
		
	}
	public Student(String perName, int perAge, int rollNo) {
		super(perName, perAge);
		this.rollNo = rollNo;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	void display() {
		System.out.println("invoking parent method using super");
		super.show();
	}
	@Override
	public String toString() {
		
		return "Person [perName=" + perName + ", perAge=" + perAge + "]"+"Student [rollNo=" + rollNo + "]";
	}
}
















