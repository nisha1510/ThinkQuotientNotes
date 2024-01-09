package com.staticdemo;

public class AccessStatic {

	int x = 10;
	static int y = 20;
	
	void instanceMethod() {
		System.out.println(x);
		System.out.println(y);
		staticMethod();
	}
	
	static void staticMethod() {
//		System.out.println(x);//need to create obj
		System.out.println(y);
		AccessStatic obj1 = new AccessStatic();
		System.out.println(obj1.x);
		
	}
	public static void main(String[] args) {
		
		staticMethod();
		
		AccessStatic obj2 = new AccessStatic();
		obj2.instanceMethod();

	}

}
