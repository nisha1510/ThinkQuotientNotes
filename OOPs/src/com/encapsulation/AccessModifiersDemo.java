package com.encapsulation;

public class AccessModifiersDemo {

	//instance variable & methods
	//& to access them need to create an object
	private int a;
	int b;//default
	public int c;
	
	private void show() {
		System.out.println("private method");
	}
	
	void display() {
		System.out.println("default method");
	}
	
	public void printMe() {
		System.out.println("public method");
	}
	public static void main(String[] args) {
		
		//Inside class everything is accesible
		
		AccessModifiersDemo a1 = new AccessModifiersDemo();
		a1.a = 90;
		a1.b = 67;
		a1.c = 56;
		
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a1.c);
		
		a1.show();
		a1.display();
		a1.printMe();
	}

}
