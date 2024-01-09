package com.constructorLab;

import java.util.Scanner;

public class CustomerTest {
	
	public static void insertCust(Customer c) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Id");
		int id = sc.nextInt();
		c.setCustId(id);
		
		System.out.println("Enter Customer Name");
		c.setCustName(sc.next());
		
		System.out.println("Enter Customer EmailId");
		c.setCustEmail(sc.next());
		
		System.out.println("Enter Customer MobileNumber");
		c.setCustMob(sc.nextLong());
		
		System.out.println("Enter Customer Password");
		c.setCustPassword(sc.next());

	}
	
	public static void showDetails(Customer c) {
		System.out.println(c);
	}

	public static void main(String[] args) {
		Customer c1 = new Customer();
		insertCust(c1);
		showDetails(c1);

	}

}


























//Customer c2 = new Customer(c2.setCustId(sc.nextInt()), c2.setCustName(sc.next()), 
//							c2.setCustEmail(sc.next()),c2.setCustMob(sc.nextLong()),
//							c2.setCustPassword(sc.next()));

