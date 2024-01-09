package com.basics;

import java.util.Scanner;

public class SearchNumInArray2 {

	public static boolean findElement(int ar[], int n) {
		
		for(int i =0; i<ar.length;i++) {
			if(ar[i]==n)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		int arr[] = {2,4,6,7,9,8};
		System.out.println("Enter the number to be searched");
		int num=sc.nextInt();
		
		if(findElement(arr,num))
		{
			System.out.println(num+" number is present in an array");
		}
		else
		{
			System.out.println(num+" number is present in an array");
		}
		
		sc.close();
	}
}
