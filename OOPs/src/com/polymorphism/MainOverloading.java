package com.polymorphism;

public class MainOverloading {

	public static void main(String[] args) {
		System.out.println("Inside main method");
		main(5);
	}
	
	public static void main(int n) {
		System.out.println("Int main");
	}
}
