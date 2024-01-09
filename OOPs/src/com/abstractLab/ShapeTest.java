package com.abstractLab;

public class ShapeTest{
	
	public static void main(String[] args) {
		
		Square sq = new Square(5);
		sq.calculateArea();
		sq.calculateCir();
		System.out.println();
		
		Rectangle rect = new Rectangle();
		rect.length=4;
		rect.width=6;
		rect.calculateArea();
		rect.calculateCir();
		
		System.out.println();
		Circle circle = new Circle();
		circle.setRadius(4);
		circle.calculateArea();
		circle.calculateCir();
		
		
	}

}
class Square extends Shape{

	double side;
	Square(){
		
	}
	Square(double side){
		this.side=side;
	}
	@Override
	void calculateArea() {
		System.out.println("Area Of Square : "+side * side);
	}

	@Override
	void calculateCir() {
		System.out.println("Circumference Of Square : "+(4 * side));	
	}
}

class Rectangle extends Shape{
	
	double length;
	double width;

	@Override
	void calculateArea() {
		System.out.println("Area of Rectangle : "+(length*width));
		
	}

	@Override
	void calculateCir() {
		System.out.println("Circumference Of Rectangle : "+(2 *(length*width)));
		
	}	
}

class Circle extends Shape{
	double radius;
	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	void calculateArea() {
//		System.out.println("Area of Circle : "+(3.14*radius*radius));//pi*r*r
		System.out.println("Area of Circle : "+(Math.PI*radius*radius));//pi*r*r
		
	}

	@Override
	void calculateCir() {
		System.out.println("Circumference Of Circle : "+(2 * 3.14 * radius));//2*pi*r
//		System.out.println("Circumference Of Circle : "+(2 * Math.PI * radius));
		
	}
}

