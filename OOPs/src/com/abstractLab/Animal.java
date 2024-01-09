package com.abstractLab;

abstract class Animal {
	
	abstract void voice();
	
}

class Cat extends Animal{

	@Override
	void voice() {
		System.out.println("cats meow");	
	}
	
}
class Dog extends Animal{

	@Override
	void voice() {
		System.out.println("dog barks");
		
	}
}