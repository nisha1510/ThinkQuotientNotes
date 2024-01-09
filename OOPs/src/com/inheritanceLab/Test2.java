package com.inheritanceLab;

public class Test2 {
	
	Test2(){
		System.out.println("inside default const");
	}
	
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
		Test2 t = new Test2();
		System.out.println(t);

	}

}
