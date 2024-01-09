package com.basics;

import java.util.Arrays;

public class SumOfElementsInArray {
	
	public static int findSum(int ar[]) {
		int sum = 0;
		for (int i = 0; i<ar.length;i++){
			sum = sum+ar[i];
		}
		return sum;
	}
	
	public static int findEvenSum(int ar1[]) {
		int evenSum = 0;
		for (int i = 0; i<ar1.length;i++)
		{
			if(i%2==0)
			evenSum = evenSum+ar1[i];
		}
		
		return evenSum;
		
	}
	
	public static int findOddSum(int ar1[]) {
		int oddSum = 0;
		for (int i = 0; i<ar1.length;i++)
		{
			if(i%2!=0)
			oddSum = oddSum+ar1[i];
		}
		
		return oddSum;
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {2,3,4,5};
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum of elements in array is : "+findSum(arr));
		System.out.println("Sum of Number at Even position : "+findEvenSum(arr));
		System.out.println("Sum of Number at odd position : "+findOddSum(arr));
		System.out.println("-------------------");
		int arr1[]= {1,2,3,4,5};
				//   0 1 2 3 4
		System.out.println("Sum of Number at Even position : "+findEvenSum(arr1));//
		System.out.println("Sum of Number at Odd position : "+findOddSum(arr1));
		

	}

}
