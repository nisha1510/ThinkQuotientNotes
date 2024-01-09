package com.encapsulation;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Book b = new Book();
		System.out.println("Enter id");
		b.setId(sc.nextInt());
		//int id = sc.nextInt();
		//b.setId(id);
		
		System.out.println("Enter Book Name");
		b.setBname(sc.next());
		
		System.out.println("Enter Book Price");
		b.setPrice(sc.nextDouble());
		
		System.out.println("Book-1 : "+b.getId()+", "+b.getBname()+", "+b.getPrice());
	}

}
