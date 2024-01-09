package com.abstractLab;

public class PrintFactorialOfNum {

	public static long calFact(int num) {
		long fact = 1;
		for(int i = 1; i <= num; i++) {
			fact = fact * i;
	//		System.out.println(fact);
		}
		return fact;
		
	}
	public static void main(String[] args) {
		
		for(int i = 1; i<= 10; i++) {
			System.out.println("Factorial of "+i+" is : "+ calFact(i));
		}
	

	}

}
