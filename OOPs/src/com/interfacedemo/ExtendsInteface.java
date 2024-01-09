package com.interfacedemo;

interface Movable{
	public void move();
}

interface Displayable extends Movable{
	void printMe(String msg);
}

class Car implements Displayable{

	@Override
	public void move() {
		System.out.println("Car is moving");		
	}

	@Override
	public void printMe(String msg) {
		System.out.println("MyCar : "+msg);		
	}
}

class Bike implements Movable{

	@Override
	public void move() {
		System.out.println("Bike is moving");	
	}
	
}
public class ExtendsInteface {

	public static void main(String[] args) {
		Displayable d;
		d = new Car();
		d.move();
		d.printMe("bmw");
		
		System.out.println("-----");
		
		Movable m;
		m = new Car();
		m.move();
		
		m = new Bike();
		m.move();

	}

}
