package com.containment;

public class Cake {

	private String flavours;
	private double price;
	
	Cake(){
		
	}
	Cake(String flavours, double price){
		this.flavours=flavours;
		this.price=price;
	}
	
	public String getFlavours() {
		return flavours;
	}
	public void setFlavours(String flavours) {
		this.flavours = flavours;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "["+flavours+" "+price+"]";
	}
}
