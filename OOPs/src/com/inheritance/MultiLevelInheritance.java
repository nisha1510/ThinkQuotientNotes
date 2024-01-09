package com.inheritance;

class Vehicle {
	private int id;
	private int modelNo;
	private double price;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int id, int modelNo, double price) {
		super();
		this.id = id;
		this.modelNo = modelNo;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "id=" + id + ", modelNo=" + modelNo + ", price=" + price ;
	}

}

class Car extends Vehicle {
	
	private String brand;
	private String fueltype;
	private int noOfGears;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int id, int modelNo, double price, String brand, String fueltype, int noOfGears) {
		super(id, modelNo, price);
		this.brand = brand;
		this.fueltype = fueltype;
		this.noOfGears = noOfGears;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getFueltype() {
		return fueltype;
	}

	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}

	public int getNoOfGears() {
		return noOfGears;
	}

	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}

	@Override
	public String toString() {
		return super.toString()+" brand=" + brand + ", fueltype=" + fueltype + ", noOfGears=" + noOfGears ;
	}

	

}

class RacingCar extends Car
{
	private float maxSpeed;
	private double mileage;
	
	public RacingCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RacingCar(int id, int modelNo, double price, String brand, String fueltype, int noOfGears, float maxSpeed,
			double mileage) {
		super(id, modelNo, price, brand, fueltype, noOfGears);
		this.maxSpeed = maxSpeed;
		this.mileage = mileage;
	}

	public float getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(float maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return super.toString()+"  maxSpeed=" + maxSpeed + ", mileage=" + mileage ;
	}
	
	
  

}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		
		Car c1= new Car(1,2001,350000,"BMW","Petrol",6);
		
		c1.setPrice(4000000);
		
		System.out.println(c1);
		
		RacingCar r1= new RacingCar();
		System.out.println(r1);
		
		r1.setId(2);
		r1.setBrand("Ferrari");
		r1.setMaxSpeed(300);
		r1.setMileage(30);
		r1.setFueltype("Diesel");
		
		System.out.println(r1);
		
		
	}
}
