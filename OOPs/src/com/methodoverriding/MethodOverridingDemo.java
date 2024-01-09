package com.methodoverriding;

class Person{
	void display() {
		System.out.println("I am Person");
	}
}

class Employee extends Person{
	
	@Override
	public void display() {//same or increase visibility
		System.out.println("Invoking parent class method");
		super.display();
		System.out.println("I am employee");
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.display();

		Employee e = new Employee();
		e.display();
	}

}
