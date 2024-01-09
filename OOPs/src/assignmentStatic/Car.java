package assignmentStatic;

public class Car {

	static String model;
	static int totalCarSold;
	
	
	public static String getModel() {
		return model;
	}
	public static void setModel(String model) {
		Car.model = model;
	}
	public static int getTotalCarSold() {
		return totalCarSold;
	}
	public static void setTotalCarSold(int totalCarSold) {
		Car.totalCarSold = totalCarSold;
	} 
}
