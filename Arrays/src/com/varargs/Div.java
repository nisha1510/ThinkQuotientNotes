package com.varargs;

public class Div {

	
	public static void main(String[] args) {
		int num = 15;
		if(num%3==0 && num%5==0)
			System.out.println("final");
		else
			if(num%3==0)
				System.out.println("hi");
			else 
				System.out.println("bye");
	}
}
