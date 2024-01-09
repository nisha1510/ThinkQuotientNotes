package com.constructor;

class Student1{
	int id;
	String name;
	float marks;
	
	Student1(){
		//this(101,"Unknown");
		id=100;
		name="unknown";
		marks=33;
	}

	public Student1(int id, String name) {
		this();
		this.id=id;
		this.name = name;
	}


	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
}

public class ConstructorChaining2 {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		System.out.println(s1);
		Student1 s2 = new Student1(1,"Nisha");
		System.out.println(s2);
		

	}

}
