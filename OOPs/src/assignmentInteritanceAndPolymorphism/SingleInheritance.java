package assignmentInteritanceAndPolymorphism;

public class SingleInheritance {

	public static void main(String[] args) {
	   
		Car myCar = new Car();
	    myCar.drive(); 
	    myCar.accelerate(); 
	}
}

class Vehicle {
	void drive() {
		System.out.println("Vehicle is being driven.");
	}
}

class Car extends Vehicle {
	void accelerate() {
		System.out.println("Car is accelerating.");
	}
}

