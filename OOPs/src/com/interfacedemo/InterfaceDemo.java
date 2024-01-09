package com.interfacedemo;

interface Bakery{
	
	String bname="MyBakery";//public static final
	void bake();//public abstract
}

class Cake implements Bakery{

	@Override
	public void bake() {
		System.out.println("Cake : pineapple, Butterscotch, chocolate");	
	}
}

class Biscuits implements Bakery{

	@Override
	public void bake() {
		System.out.println("Biscuits : Almond, Chocopie, KajuPista");	
	}
	
	public void minOrder() {
		System.out.println("Biscuits = Min Odr is : 250grm");
	}
}


public class InterfaceDemo {
	public static void main(String[] args) {
		
		System.out.println("Bakey anem : "+Bakery.bname);
		System.out.println("--------");
		
//		Cake c = new Cake();
//		c.bake();
//		
//		Biscuits b = new Biscuits();
//		b.bake();
//		b.minOrder();
		
		Bakery b;
		b = new Cake();
		b.bake();
		
		b = new Biscuits();
		b.bake();
//		b.minOrder();//no such method in interface
	}
}
