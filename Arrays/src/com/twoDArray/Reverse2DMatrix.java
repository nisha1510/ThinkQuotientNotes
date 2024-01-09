package com.twoDArray;

import java.util.Arrays;

public class Reverse2DMatrix {

	static void reverseArray(int array[])
	{
		int len = array.length;
		for (int i = 0; i < len/2; i++) {
			int temp = array[i];
			array[i] = array[len-i-1];
			array[len-i-1] = temp;
		}
		System.out.println(Arrays.toString(array));
	}
	
	static void reverse2D(int ar[][])
	{
		//System.out.println(ar.length);//no of rows
		for (int i = 0; i < ar.length; i++) {
			reverseArray(ar[i]);
		}
	}
	
	static void display(int arr[][]) {
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int m1[][] = {{1,2,3},{4,5,6}};
		
		display(m1);

		reverse2D(m1);	

	}
}
