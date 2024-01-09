package com.abstractLab;

public class DemoAbstractSUbClass extends DemoAbstract{

	@Override
	void abstMethod() {
		System.out.println("this is abstract method of sub class");	
	}

	public static void main(String[] args) {
		
		DemoAbstractSUbClass obj = new DemoAbstractSUbClass();
		obj.abstMethod();
		obj.nonAbstMethod();
		
		/*
		This is contructor of abstract class
		this is abstract method of sub class
		Normal method of abstract class
		*/
	}
}
