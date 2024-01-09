package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class PassArray {

	public static void squareElements(int ar[]) {
		for (int i = 0; i<ar.length;i++){
			ar[i] = ar[i]*ar[i];
		}
	}
	
	public static void main(String[] args) {
			
		int arr[] = {2,3,4,5};
		
		System.out.println("Original Array "+Arrays.toString(arr));
		squareElements(arr);
		System.out.println("After Square "+Arrays.toString(arr));
		
	}

}
