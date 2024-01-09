package com.overloadingLab;

public class MethodOverloadingExample2 {
	
	public void methodTest(Object object) {
		System.out.println("calling object method");
	}
	
	public void methodTest(String object) {
		System.out.println("calling string method");
	}

	public static void main(String[] args) {
		MethodOverloadingExample2 obj1 = new MethodOverloadingExample2();
		obj1.methodTest(null);//child class called first null as a string
				
		obj1.methodTest(10);//Parent class
		
	}
}
