package com.varargs;

class Parent{
	public static void display(int ...ar) {
		System.out.println("In int");
		for(int a : ar) {
			System.out.println(a);
		}
	}
}

//class Child extends Parent{
	
//	@Override
//	public static void display(int ...ar) {
//		
//		int sum = 0;
//		System.out.println("In int");
//		for(int a : ar) {
//			sum+=a;
//		}
//		System.out.println(sum);
//	}
//}

public class VarargsOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
