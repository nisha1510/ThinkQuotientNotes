package com.constructorLab;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void checkPrime(int num) {
		 boolean status = true;
		 if(num==0 || num==1)
			 status = false;
		 else
		 {
			 for(int i = 2; i < num; i++) {
				 if(num%i==0) {
					 status = false;
					 break;
				 }
			 }
		 }
		 if(status)
			 System.out.println(num+" is a prime number");
		 else
			 System.out.println(num+" is not a prime number");
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		checkPrime(n);
		
	}
}
