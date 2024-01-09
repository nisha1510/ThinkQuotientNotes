package com.intermediate;

import java.util.Scanner;

public class PrimeNumber {
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
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(checkPrime(n))
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");

	}

}
