package com.wrapperClass;

public class WrapperDemo {

	public static void main(String[] args) {
		
		//Boxing : primitive to wrapper
		int num = 23;
		Integer i1 = new Integer(45);
		Integer i2 = 77;
		Integer j = Integer.valueOf(num);
		
		//Auto
		Integer k = num;
		
		System.out.println(i1+", "+i2+", "+j+", "+k);
		
		//Unboxing : wrapper to primitive
		
		Float f1 = new Float(78.8f);
		Float f2 = f1.floatValue();
		
		//auto 
		float f3 = f1;
		System.out.println(f1+", "+f2+", "+f3);
	}

}
