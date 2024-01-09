package com.interfacedemo;

interface Calculate{
	void area();
	
	//java - 8
	//mutable and backkward compatiblity
	default void volume() {
		System.out.println("In volume method of inteface (instance method)");
		display();
		show();
	}
	
	//common im plementation for all classes
	//belong to interface
	static void info() {
		System.out.println("static method of interface");
		show();//can private static method in static method
//		display();// cant call private method in static
		}
	
	//java-9
	//give confidential info that cant be shared
	//confidential info - sensititve info belongs to areement
	//instance
	private void display() {
		System.out.println("private method of interface");
	}
	
	private static void show() {
		System.out.println("private static method of interface");
	}
}

class Square implements Calculate{
	
	int side;
	
	Square(){
		side = 10;
	}
	Square (int side){
		this.side=side;
	}
	@Override
	public void area() {
		System.out.println("Area of Square : "+(side*side));
	}

}
class Cube implements Calculate{

	int side;
	Cube(){
		side = 20;
	}
	Cube (int side){
		this.side=side;
	}
	@Override
	public void area() {
		System.out.println("Area of Cube : "+(6*side*side));	
	}
	public void volume() {
		System.out.println("Volume of Cube : "+(side*side*side));
	}
}


public class InterfaceAdvanced {

	public static void main(String[] args) {
		
		Calculate.info();//static method of interface called directly
		
		Calculate c;
		c = new Square();
		c.area();
		c.volume();
		
		System.out.println("-----------");
		
		c = new Cube();
		c.area();
		c.volume();

	}

}
