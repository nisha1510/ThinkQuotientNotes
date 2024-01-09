package assignmetOverriding;
/*
WAP to create class Vehicle with methods accelerate(long mph) with long type parameter ,
stop(),run() all method return string type of value. 
Create class car which extends Vehicle implement accelerate(long mph)differently in car class.
*/
public class VehicleMain {

	public static void main(String[] args) {
	
		Vehicle vehicle = new Vehicle();
        Car car = new Car();

        // Using methods of Vehicle class
		System.out.println(vehicle.accelerate(60));
	    System.out.println(vehicle.stop());  
        System.out.println(vehicle.run()); 
        
        // Using methods of Car class
        System.out.println(car.accelerate(80));
        System.out.println(car.stop());    
        System.out.println(car.run());  

	}

}

class Vehicle {

	String accelerate(long mph) {
		return "Vehicle is accelerating at " + mph + " mph";
	}

	String stop() {
		return "Vehicle has stopped";
	}

	String run() {
		return "Vehicle is running";
	}
}


class Car extends Vehicle {
 
	@Override
	String accelerate(long mph) {
		return "Car is accelerating at " + mph + " mph";
	}
}

