package com.varargs;

public class DemoVarArgs2 {

	static void display(int ar[]) {
		for(int x : ar)
		{
			System.out.print(x+" ");
		}
	}
	
	//ellipsis
	static void display1(int ...ar) {
		for(int x : ar)
		{
			System.out.print(x+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		int arr1[] = {2, 3, 4, 5};
		int arr2[] = {5, 6};
		int arr3[] = {3, 4, 5};

		display(arr1);
		display(arr2);
		display(arr3);
		
		System.out.println("\n==Using VarArgs==");
		display1(2, 3, 4);
		display1(2, 3, 4, 5);
	}

}
