package com.basics;

import java.util.Scanner;

public class SearchNumInArray {

	public static boolean findElement(int ar[], int n) {
		
		for(int i =0; i<ar.length;i++) {
			if(ar[i]==n)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2,4,6,7,9,8};
		int num=1;
		
		if(findElement(arr,num))
			System.out.println("number is present in an array");
		else
			System.out.println("number is present in an array");

	}
}
