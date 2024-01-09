package com.staticLab;

import com.staticdemo.StaticDemo;

public class Counter {
	int x = 10;//instance variable
	static int y = 10;
	
	void show() {
		x++;
		y++;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}

	public static void main(String[] args) {
		Counter obj1 = new Counter();
		obj1.show();
		
		System.out.println("----------");
		Counter obj2 = new Counter();
		obj2.show();
	}
}
