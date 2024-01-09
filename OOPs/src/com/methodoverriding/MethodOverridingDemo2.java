package com.methodoverriding;

class MyPerson{
	void display() {
		System.out.println("I am Person");
	}
}

class MyEmployee extends MyPerson{
	
	@Override
	public void display() {//same or increase visibility
		System.out.println("I am employee");
	}
	
	void show() {
		System.out.println("Employee is calling showing skills");
	}
}

public class MethodOverridingDemo2 {

	public static void main(String[] args) {
		
		MyPerson p = new MyPerson();
		p.display();

		MyEmployee e = new MyEmployee();
		e.display();
		e.show();
		
		System.out.println("Dynamic method binding");
		MyPerson p1;
		p1 = new MyPerson();
		p1.display();
		
		
		p1 = new MyEmployee();
		p1.display();
//		p1.show();
	}

}
