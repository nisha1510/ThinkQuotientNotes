package com.varargs;

public class VarargsRules {

	//Rule 1 : only one varargs as argument
//	static void display(int ...a, String ..s) {
//		
//	}
	
//	Rule2 : varargs has to be the last argument 

//	static void display1(int ...a, int a2) {
//		
//	}
	
	static void display1(int a1, int ...a2) {
		System.out.println(a1);
		for(int x : a2)
			System.out.print(x+" ");
		
		System.out.println();
	}
	
	public static void main(String[] args) {
//		display(3,4,"nish");
		
		display1(3, 4, 5, 6, 7);
	}

}
