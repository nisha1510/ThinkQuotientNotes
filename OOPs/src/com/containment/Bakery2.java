package com.containment;

import com.staticdemo.Cake;

public class Bakery2 {

	private String bakeryName;
	static int noOfCakes = 0;
	static double earnings = 0.0;
	
//	private int custId;
//	private String custName;
	
	Bakery2(){
		
	}
	Bakery2(String bakeryName){
		this.bakeryName=bakeryName;
	}
	

	public String getBakeryName() {
		return bakeryName;
	}
	public void setBakeryName(String bakeryName) {
		this.bakeryName = bakeryName;
	}
	
	public static int getNoOfCakes() {
		return noOfCakes;
	}
	public static void setNoOfCakes(int noOfCakes) {
		Bakery2.noOfCakes = noOfCakes;
	}
	public static double getEarnings() {
		return earnings;
	}
	public static void setEarnings(double earnings) {
		Bakery2.earnings = earnings;
	}

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
		Bakery2 b1 = new Bakery2("SwissDelight");
		
		Cake c1 = new Cake("Butterscotch",450);
		Cake c2 = new Cake("Truffle",450);
		Cake c3 = new Cake("Butterscotch",450);
		
		System.out.println(b1.getBakeryName());
		System.out.println();
		
		b1.setCake(c1);
		b1.setCake(c2);
		b1.setCake(c3);
		
		System.out.println("Total Cakes Ordered : "+Bakery.noOfCakes);
		System.out.println("Total Earnings : "+Bakery.earnings);


		
		
		}
}
