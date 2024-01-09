package com.staticdemo;

class Car{
	
	String model;
	static int noOfCars=0;
	
	{
		noOfCars++;
	}
	
	Car(){
		
	}
	Car(String model){
		this.model=model;
	}
	
	public String toString() {
		return "Car [model=" + model + "No Of Cars "+ noOfCars+"]";
	}
}

public class CarShowroom {

	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1);
		

	}

}
