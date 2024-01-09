package com.abstractDemo;

abstract class Vehicle{
	
	String color;
	private String name;
	
	Vehicle(){
		System.out.println("Inside Vehichle default const");		
	}	
	
	Vehicle(String color){
		this.color = color;
		System.out.println("Inside Vehichle Param const");		
	}
	
	Vehicle(String color, String name){
		
	}
	
	//abstract method
	abstract void run();
	
	//non-abstract method
	void speed() {
		System.out.println("Vehicle is running ata 80mph");
	}
	
	//public static void changeGear(); // beacuse static method cant be overriden
	
}

class Bike extends Vehicle{

	static String brand = "Honda";
	
	Bike(){
		System.out.println("Inside Bike default const");
	}
	Bike(String brand){
		this.brand=brand;
		System.out.println("Inside Bike default const");
	}
	
	@Override
	void run() {
		System.out.println("Bike in running");
		
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		
		

	}

}
