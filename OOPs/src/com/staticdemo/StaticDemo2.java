package com.staticdemo;

public class StaticDemo2 {

	int x = 10;//instance variable
	static int y = 10;
	static String color="Red";
	
	void show() {
		x++;
		y++;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	public static void main(String[] args) {
		
		StaticDemo2 obj1 = new StaticDemo2();
		obj1.show();
		
		System.out.println("----------");
		StaticDemo2 obj2 = new StaticDemo2();
		obj2.show();
		/*
		 * x = 11 
		 * y = 11
		 * ---------- 
		 * x = 11 
		 * y = 12
		 */
	}

}
