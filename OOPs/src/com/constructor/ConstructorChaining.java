package com.constructor;

class Student{
	int id;
	String name;
	float marks;
	
	Student(){
		this(0,"Unknown");
	}

	public Student(int id, String name) {
//		this.id = id;
//		this.name = name;
//		marks=33;
		
		this(id,name,33);
	}

	public Student(int id, String name, float marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1);
		Student s2 = new Student(1,"Nisha");
		System.out.println(s2);
		Student s3 = new Student(2,"isha",33);
		System.out.println(s3);

	}

}
