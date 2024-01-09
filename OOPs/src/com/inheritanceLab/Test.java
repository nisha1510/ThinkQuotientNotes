package com.inheritanceLab;

public class Test {
	{
		System.out.println("instance block 1");
	}
	{
		System.out.println("instance block 2");
	}
	static
	{
		System.out.println("static block 1");
	}
	static
	{
		System.out.println("static block 2");
	}
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t);

	}

}
