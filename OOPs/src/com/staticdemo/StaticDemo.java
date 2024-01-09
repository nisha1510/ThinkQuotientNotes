package com.staticdemo;

public class StaticDemo {

	int x = 10;//instance variable
	static int y = 10;
	
	void show() {
		x++;
		y++;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	public static void main(String[] args) {
		
		StaticDemo obj1 = new StaticDemo();
		obj1.show();
		
		System.out.println("----------");
		StaticDemo obj2 = new StaticDemo();
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
