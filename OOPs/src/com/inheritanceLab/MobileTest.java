package com.inheritanceLab;

public class MobileTest {

	public static void main(String[] args) {
		

	}

}
class Mobile{
	
	public String model;
	public String operatingSystem;
		
	public static void message() {
		System.out.println("sending message");
	}
	public static void calling() {
		System.out.println("calling");
	}

	Mobile(){
		
	}
	public Mobile(String model, String operatingSystem) {
		super();
		this.model = model;
		this.operatingSystem = operatingSystem;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
	@Override
	public String toString() {
		return "Mobile [model=" + model + ", operatingSystem=" + operatingSystem + "]";
	}	
}


class Android extends Mobile{
	
	private String brand;
	Android(){
		
	}
	Android(String brand,String model, String operatingSystem){
		super(model,operatingSystem);
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Android [brand=" + brand + "]"+
				"Mobile [model=" + model + ", operatingSystem=" + operatingSystem + "]";
	}
	
	
}
class IOSMObile extends Mobile{
	
	static String brand = "Apple";
	
}