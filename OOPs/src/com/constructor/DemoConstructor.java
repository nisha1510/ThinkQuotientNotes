package com.constructor;

public class DemoConstructor {

	String name;
	
	DemoConstructor(){
		System.out.println("inside default");
		name = "default";
	}
	public DemoConstructor(String name) {
		System.out.println("inside parameterized");
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		
		DemoConstructor obj = new DemoConstructor();
		System.out.println((obj.getName()));
		
		DemoConstructor obj1 = new DemoConstructor("Nisha");
		System.out.println((obj1.getName()));
		
	}

}
