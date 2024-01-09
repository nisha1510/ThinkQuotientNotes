package assignmentInteritanceAndPolymorphism;

public class MultilevelInheritance {
    
	public static void main(String[] args) {
		
		SportsCar mySportsCar = new SportsCar();
        mySportsCar.drive(); // Accessing method from Vehicle class
        mySportsCar.accelerate(); // Accessing method from Car class
        mySportsCar.turboBoost(); // Accessing method from SportsCar class
    }
}	
	
class Vehicle1 {
	void drive() {
		System.out.println("Vehicle is being driven.");
	}
}

class Car1 extends Vehicle1 {
	void accelerate() {
		System.out.println("Car is accelerating.");
	}
}

class SportsCar extends Car1 {
	void turboBoost() {
		System.out.println("Sports car turbo boosts.");
	}
}

