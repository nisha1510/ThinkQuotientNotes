package com.constructorLab;

public class PrintPrime {

	public static boolean checkPrime(int num) {
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
		 return status;
	}

	public static void main(String[] args) {
	
		for(int i = 1; i <= 100; i++) {
			if(checkPrime(i)) {
				System.out.println(i);
			}	
		}
	}
}
