package com.polymorphism;


class Shape{
	
	void calcArea(int side) {
		System.out.println("Area of Square : "+side*side);
	}
	
	void calcArea(float radius){
		System.out.println("Area of circle : "+(3.14*radius*radius));
	}
	
	void calcArea(int l, float b) {
		System.out.println("Area of Rectangle : "+(l*b));	
	}
	
	void calcArea(float base, int height) {
		System.out.println("Area of triangle : "+(0.5*base*height));
	}

}
public class OverloadingDemo {

	public static void main(String[] args) {
	
		Shape s1 = new Shape();
		s1.calcArea(0.5f);
		s1.calcArea(3);
		s1.calcArea(3, 5f);
		s1.calcArea(4f, 5);

	}

}
