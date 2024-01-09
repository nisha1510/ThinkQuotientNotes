package com.inheritance;

@FunctionalInterface
interface Showable{
	
	void display();//FunctionalInterface can have only one abstract method
	//void printMe();
}

interface Printable{
	
	void display();
}

class Demo implements Showable,Printable{

	@Override
	public void display() {
		System.out.println("Welcome");
	}		
}

public class MultipleInheritance {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.display();

	}

}
