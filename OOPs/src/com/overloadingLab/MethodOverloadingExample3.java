package com.overloadingLab;

public class MethodOverloadingExample3 {
	
	public void methodTest(Object object) {
		System.out.println("calling object method");
	}
	
	public void methodTest(String object) {
		System.out.println("calling string method");
	}
	public void methodTest(Number object) {
		System.out.println("calling number method");
	}
	public void methodTest(Integer object) {
		System.out.println("calling int method");
	}
	public void methodTest(Float object) {
		System.out.println("calling float method");
	}
	public void methodTest(Double object) {
		System.out.println("calling double method");
	}
	public static void main(String[] args) {
		MethodOverloadingExample3 obj1 = new MethodOverloadingExample3();
//		obj1.methodTest(null);
//		//child class called first
		
		
		obj1.methodTest(10);
		obj1.methodTest(10.0);
		obj1.methodTest(10f);
		
	}
}
