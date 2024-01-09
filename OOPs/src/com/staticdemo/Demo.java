package com.staticdemo;

public class Demo {
	static
	{
		System.out.println("static");
	}
	Demo(){
		System.out.println("const");
	}
	{
		System.out.println("inst");
	}
	public static void main(String[] args) {
		Demo obj = new Demo();

	}

}
