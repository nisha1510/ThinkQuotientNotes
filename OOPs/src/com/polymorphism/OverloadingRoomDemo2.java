package com.polymorphism;

class Room1{
	
	void calculateArea(int length) {
		System.out.println("Area : "+length*length);
	}
//doesnot differentiate on the basis of return type	
//	int calculateArea(int length) {
//		System.out.println("Area : "+length*2);
//	}
	
	void calculateArea(int length, int breadth) {
		System.out.println("Area : "+length*breadth);
	}
	void calcVolume(int length) {
		System.out.println("Volume : "+length*length*length);
	}
	void calcVolume(int length, int breadth, int height) {
		System.out.println("Volume : "+length*breadth*height);
	}
	
} 

public class OverloadingRoomDemo2 {

	public static void main(String[] args) {
		Room1 r1 = new Room1();
		r1.calculateArea(5);
		r1.calcVolume(5);
		
		Room1 r2 = new Room1();
		r2.calculateArea(3, 4);
		r2.calcVolume(2, 3, 5);

	}

}
