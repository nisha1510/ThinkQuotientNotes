package com.intermediate;

import java.util.Arrays;

public class RotateElementsInArray {

	public static void rotateOnce(int ar[])
	{
		int lastElement = ar[ar.length - 1];
		for (int i = ar.length - 1; i > 0; i--) {
			ar[i] = ar[i-1];
		}
		ar[0] = lastElement;
	}
	
	public static void leftRotate(int ar[])
	{
		int first = ar[ar.length];
		for (int i = 0; i < 1; i++) {//shift by 1
			
			
		}

	}
	
	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4, 5, 6, 7, 8};
		System.out.println(Arrays.toString(arr));
		
		System.out.println("After Rotation");
		rotateOnce(arr);
		System.out.println(Arrays.toString(arr));

	
//		System.out.println("After Rotating 3 times");
//		for(int i = 0; i < 3; i++) {
//			rotateOnce(arr);
//		}
//		System.out.println(Arrays.toString(arr));
		
//		System.out.println("After Rotation");
//		leftRotate(arr);
//		System.out.println(Arrays.toString(arr));
	}

}
