package com.containmentLab;

import java.util.Scanner;

public class PersonTest {

	public static void enterDetails(Person p) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter person name");
		p.setName(sc.next());
		System.out.println("Enter person age");
		p.setAge(sc.nextDouble());
		System.out.println("Enter person email");
		p.setEmail(sc.next());
		
		p.setAddr(new Address());
		System.out.println("Enter roonNumber");
		p.getAddr().setRoomNo(sc.nextInt());
		System.out.println("Enter City name");
		p.getAddr().setCity(sc.next());
		System.out.println("Enter pincode");
		p.getAddr().setPincode(sc.nextInt());
	}
	
	public static void main(String[] args) {
		
		Person person = new Person();
		enterDetails(person);
		System.out.println(person);

	}

}
