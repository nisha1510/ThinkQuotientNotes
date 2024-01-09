package com.polymorphism;

class Room{
	
	int length;
	int breadth;
	int height;
	
	Room()
	{
		length=breadth=height=0;
	}
	Room(int length)
	{
		this.length=length;
		this.breadth=length;
		this.height=length;
	}
	public Room(int length, int breadth, int height) 
	{
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	void calculateArea() {
		System.out.println("Area : "+length*breadth);
	}
	void calcVolume() {
		System.out.println("Volume : "+length*breadth*height);
	}
} 

public class OverloadingRoomDemo {

	public static void main(String[] args) {
		Room r1 = new Room();
		r1.calculateArea();
		r1.calcVolume();
	}

}
