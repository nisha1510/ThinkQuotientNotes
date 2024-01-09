package com.encapsulation;

public class StudDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setSid(1);
		s1.setSname("Nisha");
		s1.setMarks(99);
		
		System.out.println(s1.getSid());
		System.out.println(s1.getSname());
		System.out.println(s1.getMarks());
		

	}

}
