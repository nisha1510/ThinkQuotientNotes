package com.basics;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);//gives default value of int
		}
		System.out.println("-------------");
		
		arr[0] = 90;
		arr[1] = 67;
		arr[2] = 78;
		arr[3] = 100;
		arr[4] = 38;
		
		
//		for(int i = 0; i <= arr.length-1; i++) {
//			System.out.println(arr[i]);
//		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-------------");
		int arr1[]= {25,30,35,11};
		System.out.println(arr1);//gives hashcode because jvm calls toString method internally
		System.out.println(Arrays.toString(arr1));//java.util.Arrays;
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}
