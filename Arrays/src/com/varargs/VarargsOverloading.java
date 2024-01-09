package com.varargs;

public class VarargsOverloading {

	//type of arguments
	public static void display(int ...ar) {
		System.out.println("In int");
		for(int a : ar) {
			System.out.println(a);
		}
	}
	public static void display(double ...ar) {
		System.out.println("In double");
		for(double a : ar) {
			System.out.println(a);
		}
	}
	public static void display(String ...ar) {
		System.out.println("In String");
		for(String a : ar) {
			System.out.println(a);
		}
	}
	
	public static void displayMe(int x, char ...ar) {
		
		System.out.println(x);
		System.out.println("In Method1");
		for(char a : ar) {
			System.out.println(a);
		}
	}
	
	public static void displayMe(char x, int ...ar) {
		
		System.out.println(x);
		System.out.println("In Method2");
		for(int a : ar) {
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		
		display(2,3,4);
		display(34, 5, 67.3, 90.2);
		display("c","java");
		
		displayMe('A', 2, 3, 4, 5);
		displayMe(2, 'A', 'B', 'C');
		
	//	displayMe(65, 66, 67, 68);//ambiguity...no type promotion allowed

		
	}

}
