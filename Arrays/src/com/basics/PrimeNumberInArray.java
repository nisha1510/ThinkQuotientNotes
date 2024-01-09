package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumberInArray {
	public static boolean checkPrime(int num) {
		
		
		if(num==0 || num ==1) {
			return false;
		}
		else
		{
			for(int i = 2; i < num; i++)
				if(num%2==0) {
					return false;
				}
		}
		return true;
	}
	public static void main(String[] args) {
	
		int arr[] = {2, 3, 5, 13, 24, 17, 19, 21};
		System.out.println(Arrays.toString(arr));
		
		System.out.println("\nPrime numbers in arrays are :");
		
		for(int i = 0; i < arr.length; i++) {
			if(checkPrime(arr[i])) {
				System.out.print(arr[i]+" ");
			}
		}
		
//		System.out.println("\nSum of prime numbers in array :");
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(checkPrime(arr[i])) 
				sum=sum+arr[i];		
		}
		System.out.println("\nSum of prime numbers in array :"+sum);
		
		
		
	}
}
