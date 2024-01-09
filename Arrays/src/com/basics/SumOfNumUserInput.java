package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfNumUserInput {

	public static int findEvenSum(int ar[]) {
		int evenSum = 0;
		for (int i = 0; i<ar.length;i++)
		{
			if(ar[i]%2==0)
			evenSum = evenSum+ar[i];
		}
		
		return evenSum;
		
	}
	
	public static int findOddSum(int ar[]) {
		int oddSum = 0;
		for (int i = 0; i<ar.length;i++)
		{
			if(ar[i]%2!=0)
			oddSum = oddSum+ar[i];
		}
		
		return oddSum;
		
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter elements");
		
		for (int i = 0; i<arr.length;i++){
			arr[i]=sc.nextInt();
		} 
		System.out.println(Arrays.toString(arr));
		System.out.println("SUm of even "+findEvenSum(arr));
		System.out.println("SUm of Odd "+findOddSum(arr));
		
		
	}
}
