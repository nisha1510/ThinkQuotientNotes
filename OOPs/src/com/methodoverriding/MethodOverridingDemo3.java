package com.methodoverriding;

class MyPerson1{
	void display() {
		System.out.println("I am Person");
	}
}

class MyEmployee1 extends MyPerson{
	
	@Override
	public void display() {//same or increase visibility
		System.out.println("I am employee");
	}
	
	void show() {
		System.out.println("Employee is calling showing skills");
	}
}
class MyCelebrity1 extends MyPerson{
	
	@Override
	public void display() {
		System.out.println("I am Celebrity");
	}
	
	void show() {
		System.out.println("Celebrity is calling show()");
	}
}

public class MethodOverridingDemo3 {
	public static void main(String[] args) {
		
		MyPerson1 p = new MyPerson1();
		p.display();

		MyEmployee1 e = new MyEmployee1();
		e.display();
		e.show();
		System.out.println();
		System.out.println("Dynamic method binding");
		//At runtime it is decided that which method is called
		//CREATING REFERENCE OF A PARENT CLASS AND CREATING CHILD CLASS OBJECT USING PARENT REFERENCE
		// Only overridden method are allowed to call 
		System.out.println("------");
		MyPerson p1;
		p1 = new MyPerson();
		p1.display();
		
		p1 = new MyEmployee();
		p1.display();
//		p1.show();
		
		p1 = new MyCelebrity1();
		p1.display();
	}

}
