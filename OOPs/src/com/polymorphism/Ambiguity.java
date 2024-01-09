package com.polymorphism;

public class Ambiguity {

//	static void display(int n) {
//		System.out.println("in int");
//		System.out.println(n);
//	}
	
	static void display(float n) {
		System.out.println("in float");
		System.out.println(n);
	}
	
	static void display(long n) {
		System.out.println("in long");
		System.out.println(n);
	}
	
	static void display(int n, double m) {
		System.out.println("in first");
		System.out.println(n+m);	
	}
	static void display(long n, float m) {
		System.out.println("in second");
		System.out.println(n+m);
		
	}
	
	public static void main(String[] args) {
		display('A');
		display(5);
		
		//display(56,9);
		display(56l,9f);
	}

}
