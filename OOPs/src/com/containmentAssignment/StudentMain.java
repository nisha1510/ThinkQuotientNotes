package com.containmentAssignment;

import java.util.Scanner;

public class StudentMain {
	public static void enterStudDetails(Student s) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student roll number ");
		s.setRoll(sc.nextInt());
		System.out.println("Enter Student name ");
		s.setName(sc.next());
		
		s.setDept(new Department());
		System.out.println("Enter department id");
		s.getDept().setDeptId(sc.nextInt());
		System.out.println("Enter department name");
		s.getDept().setDeptName(sc.next());
	}

	public static void main(String[] args) {
		Student st = new Student();
		enterStudDetails(st);
		System.out.println(st);
	}

}
