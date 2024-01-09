package com.intermediate;

public class EnhancedFor {

	public static void main(String[] args) {
		int arr[] = {2, 3, 5, 13, 24, 17, 19, 21};
		for(int x :arr) {
//			System.out.println(x);
			System.out.print(x+" ");
		}
		//here x is reference so cant update aray using enhanced for loop
		//no access to index
		
		System.out.println("\n----");
		for(int x :arr) {
			x = x*x;//no updation
		}
		for(int x :arr) {
			System.out.println(x);//no change is visible
		}
	}

}
