package com.containmentLab;

public class Car {
	
	private String car;
	private String carModel;
	private double price;
	private CarEngine engine;
	
	public Car() {
		
	}
	public Car(String car, String carModel, double price, CarEngine engine) {
		this.car = car;
		this.carModel = carModel;
		this.price = price;
		this.engine = engine;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public CarEngine getEngine() {
		return engine;
	}
	public void setEngine(CarEngine engine) {
		this.engine = engine;
	}

	public String toString() {
		return "Car [car=" + car + ", carModel=" + carModel + ", price=" + price + ", engine=" + engine + "]";
	}
	
	
}
