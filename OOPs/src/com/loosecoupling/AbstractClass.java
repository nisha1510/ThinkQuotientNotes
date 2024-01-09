package com.loosecoupling;

abstract class Student{
	int id;
	String name;
	
	Student(){
		
	}
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	abstract void display();
	
}

class SchoolStudent extends Student{

	public SchoolStudent() {
		
	}
	public SchoolStudent(int id, String name) {
		super(id, name);
	}

	@Override
	void display() {
		System.out.println("i'm school student");	
	}
}

class CollegeStudent extends Student{

	public CollegeStudent() {
		
	}
	public CollegeStudent(int id, String name) {
		super(id, name);
	}

	@Override
	void display() {
		System.out.println("i'm college student");	
	}
}

public class AbstractClass {
	
	void displayDetails(Student s) {
		System.out.println(s.id+" "+s.name);
		s.display();
	}

	public static void main(String[] args) {
		
		AbstractClass obj1 = new AbstractClass();
		Student s1;
		s1 = new SchoolStudent(101, "nisha");
		obj1.displayDetails(s1);

		s1 = new CollegeStudent(100,"isha");
		obj1.displayDetails(s1);

	}

}
