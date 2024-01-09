package com.basics;

import java.util.Arrays;

public class SumOfEven {

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

		int arr[]= {4,6,7,8,9,10};
		System.out.println(Arrays.toString(arr));
		System.out.println("SUm of even "+findEvenSum(arr));
		System.out.println("SUm of Odd "+findOddSum(arr));
	}

}
