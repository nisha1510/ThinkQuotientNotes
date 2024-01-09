package com.containmentLab;

import java.util.Scanner;

public class CarTest {

	public static void enterCarDetails(Car c) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Car ");
		c.setCar(sc.next());
		System.out.println("Enter CarModel ");
		c.setCarModel(sc.next());
		System.out.println("Enter Car price");
		c.setPrice(sc.nextDouble());
		
		c.setEngine(new CarEngine());
		System.out.println("Enter Engine-Type ");
		c.getEngine().setType(sc.next());	
		
	}
	public static void main(String[] args) {
		
		Car car = new Car();
		enterCarDetails(car);
		System.out.println(car);
				

	}

}
