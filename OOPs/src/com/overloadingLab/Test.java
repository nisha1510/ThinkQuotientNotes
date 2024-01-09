package com.overloadingLab;

public class Test {

	public void add(int num1, float num2){
		System.out.println("first");
		System.out.println(num1+num2);
	}
	
	public void add(float num1, int num2){
		System.out.println("second");
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) {
		
		Test t1 = new Test();
	//	add(10,10);

	}

}
