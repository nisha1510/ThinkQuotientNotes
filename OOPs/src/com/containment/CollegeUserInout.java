package com.containment;
import java.util.*;
public class CollegeUserInout {

	static Scanner sc= new Scanner(System.in);
	
	static void enterStudDetails(Student s) {
	
		System.out.println("Enter Student Id");
		s.setSid(sc.nextInt());	
		System.out.println("Enter Student name");
		s.setSname(sc.next());
		
		s.setCourse(new Course());
		System.out.println("Enter Course Id");
		s.getCourse().setCid(sc.nextInt());
		System.out.println("Enter Course name");
		s.getCourse().setCname(sc.next());
		System.out.println("Enter Course Fees");
		s.getCourse().setFees(sc.nextDouble());	
		
	}
	
	public static void main(String[] args) {
		
		Student stud = new Student();
		enterStudDetails(stud);
		System.out.println(stud);

	}

}
