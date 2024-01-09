package com.abstractLab;

abstract class DemoAbstract {
	
	DemoAbstract(){
		System.out.println("This is contructor of abstract class");
	}
	
	abstract void abstMethod();
	
	void nonAbstMethod() {
		System.out.println("Normal method of abstract class");
	}
}
