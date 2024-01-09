package com.inheritanceLab;

class Parent{
	int value = 100;
	int num = 10;
	Parent(){
		System.out.println("In parent default constructor");
	}	
	Parent(int value, int num){
		System.out.println("In parent parameterized constructor");
		this.value=value;
		this.num=num;
	}
	void display() {
		System.out.println("In Parent Class");
		System.out.println("Value "+value);
	}
}

class Child extends Parent{
	int value = 1000;
	Child(){
		super();
		System.out.println("In Child default constructor");
	}	
	Child(int value){
		this.value=value;
		
	}
	void display() {
		System.out.println("In Child Class");
		System.out.println("Value "+value);
		System.out.println("Invoking Parent Mathod : ");
		super.display();
		System.out.println("Invoking Parent variable : "+super.value);
		
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		Child c1 = new Child();
		c1.display();

	}

}
