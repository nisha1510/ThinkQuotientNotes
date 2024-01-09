package assignmentInteritanceAndPolymorphism;

public class HierarchicalInterface {

	 public static void main(String[] args) {
	     Car2 myCar = new Car2();
	     Bike2 myBike = new Bike2();

	     myCar.drive(); // Accessing method from Vehicle class via Car class
	     myCar.accelerate(); // Accessing method from Car class
	     System.out.println();

	     myBike.drive(); // Accessing method from Vehicle class via Bike class
	     myBike.pedal(); // Accessing method from Bike class
	 
	}
}

class Vehicle2 {
	void drive() {
		System.out.println("Vehicle is being driven.");
    }
}

class Car2 extends Vehicle2 {
	void accelerate() {
		System.out.println("Car is accelerating.");
	}
}

class Bike2 extends Vehicle2 {
	void pedal() {
		System.out.println("Bike is being pedaled.");
	}
}
