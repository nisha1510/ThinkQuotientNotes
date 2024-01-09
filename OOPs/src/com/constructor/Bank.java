package com.constructor;

public class Bank {

	public static void main(String[] args) {

		AccDetails a1 = new AccDetails(34567,"Nisha",5000);
		System.out.println(a1);
//		a1.deposit(5000);
		a1.withdraw(3000);
	}

}
