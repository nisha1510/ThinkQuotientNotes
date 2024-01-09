package assignmentStatic;


public class CarMain {

	public static void main(String[] args) {
		
		System.out.println(Car.model = "Kia");
		System.out.println(Car.totalCarSold = 2);

		System.out.println("----------------");
		Car c1 = new Car();
		Car c2 = new Car();
		c1.model="Scorpio";
		System.out.println(c2.model);
	}

}
/*
1.	Create a class Car with String model and inttotalCarSold as static variable in main() method.
2.	Change the value of variable by class name then Print it.
3.	Create two object of Car class and change value of static variable by 1st object and print it by accessing 2nd object.

*/