package com.overloadingLab;

public class Addition {
	
	public void add(int a, int b) {
		System.out.println("in int");
		System.out.println(a+b);
	}
	
	public void add(int a, float b) {
		System.out.println(a+b);
	}
	
	public void add(long a, long b) {
		System.out.println("in long");
		System.out.println(a+b);
	}
	
	public void add(float a, float b) {
		System.out.println("in float");
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
		Addition a1 = new Addition();
		a1.add(4, 5);
		a1.add(4, 4f);
		a1.add(4l, 3l);
		a1.add(5f, 5f);
	}
}
