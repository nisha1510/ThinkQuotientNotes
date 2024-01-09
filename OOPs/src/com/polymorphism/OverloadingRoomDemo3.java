package com.polymorphism;

class Room3{
			
		void calculateArea(int length) {
			System.out.println("Area : "+length*length);
		}
//doesnot differentiate on the basis of return type	
//		int calculateArea(int length) {
//			System.out.println("Area : "+length*2);
//		}
		
//		void calculateArea(int length, int breadth) {
//			System.out.println("Area : "+length*breadth);
//		}
		int calculateArea(int length, int breadth) {
			return length*breadth;
		}
		
		void calcVolume(int length) {
			System.out.println("Volume : "+length*length*length);
		}
		void calcVolume(int length, int breadth, int height) {
			System.out.println("Volume : "+length*breadth*height);
		}
		
	} 

public class OverloadingRoomDemo3 {

	public static void main(String[] args) {
		Room3 r1 = new Room3();
		r1.calculateArea(5);
		System.out.println(r1.calculateArea(4, 5));
	}

}
