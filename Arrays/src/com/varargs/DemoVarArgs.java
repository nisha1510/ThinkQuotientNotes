package com.varargs;

public class DemoVarArgs {

	//ellipsis
	static void displaySum(int ...ar) {
		int sum = 0;
		for(int x : ar)
		{
			System.out.print(x+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
	
		
		System.out.println();
		displaySum(2, 3, 4);
		displaySum(2, 3, 4, 5);
	}

}
