package com.staticdemo;

public class Cake {

	private String flavors;
	private float price;
	
	static int totalcount;
	static double amount;
//	
//	static
//	{
//		totalcount=0;
//		amount=0;
//	}
	
	{
		totalcount++;
	}
	
	public Cake() {
		
	}

	public Cake(String flavors, float price) {
		this.flavors = flavors;
		this.price = price;
	}

	public String getFlavors() {
		return flavors;
	}

	public void setFlavors(String flavors) {
		this.flavors = flavors;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public static int getTotalcount() {
		return totalcount;
	}

	public static void setTotalcount(int totalcount) {
		Cake.totalcount = totalcount;
	}

	public static double getAmount() {
		return amount;
	}

	public static void setAmount(double amount) {
		Cake.amount = amount;
	}
	
	
	

}
