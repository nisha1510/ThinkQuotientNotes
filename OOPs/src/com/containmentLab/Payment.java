package com.containmentLab;

import java.util.Scanner;

public class Payment {
	public static void pay() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Card payment, 2. Cash");
		System.out.println("Enter paymentType");
		int choice = sc.nextInt();
		if(choice==1) {
			System.out.println("1.Debit card, 2. Credit card");
			int option = sc.nextInt();
			if(option == 1) {
				System.out.println("Enter Debit card number");
				long debitNo = sc.nextLong();
				System.out.println("Enter CVV");
				int cvv = sc.nextInt();
				System.out.println("Thank you for payment");
			}
			else
			{
				System.out.println("Enter Credit card pin");
				int pin = sc.nextInt();
				System.out.println("Thank you for payment");
			}		
		}
		else
		{
			System.out.println("Thanks for payment");
		}
	}
	
	public static void makePayment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Online Payment, 2. Card Payment, 3. Cash");
		System.out.println("Enter paymentType");
		int paymentType = sc.nextInt();
		switch(paymentType) {
		case 1 :
			System.out.println("Enter UPI pin");
			int pin = sc.nextInt();
			System.out.println("Thanks for payment");
			break;
		case 2:
			System.out.println("Enter Card details");
			System.out.println("Enter Card number");
			long cardNo = sc.nextLong();
			System.out.println("Enter CVV");
			int cvv = sc.nextInt();
			System.out.println("Thank you");
			break;
		case 3:
			System.out.println("Thnks for payment");
			break;
		
		default :
			System.out.println("Please enter correct option....");
		}	
	}
	public static void main(String[] args) {
		
//		makePayment();
		pay();
	}

}
