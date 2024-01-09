package com.containment;

import com.staticdemo.Cake;

public class Bakery {

	static String bakeryName = "SwissDelight";
	static int noOfCakes = 0;
	static double earnings = 0.0;
	
//	private int custId;
//	private String custName;
	
	Cake cake;
	
	public Cake getCake() {
		return cake;	
	}
	public void setCake(Cake cake) {
		this.cake=cake;
		noOfCakes++;
		earnings+=cake.getPrice();
	}
	
	public static void main(String[] args) {
		
		Cake c1 = new Cake("Butterscotch",450);
		Cake c2 = new Cake("Truffle",450);
		Cake c3 = new Cake("Butterscotch",450);

		System.out.println(Bakery.bakeryName);
		
		
		}
}
