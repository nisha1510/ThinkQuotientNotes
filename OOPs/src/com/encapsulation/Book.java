package com.encapsulation;

public class Book {

	private int id;
	private String bname;
	private double price;
	
	public void setId(int id) {
		this.id=id;
	} 
	public int getId() {
		return id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "{ID : "+id+", BookName : "+bname+", Price : "+price+"}";
		
		
	}
}
