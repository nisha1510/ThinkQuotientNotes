package com.finalize;

public class StudTest {

	public static void main(String[] args) {
		Student s = new Student(1,"nisha");
		
		System.out.println(s);
		s=null;
		
		System.gc();
	}

}
