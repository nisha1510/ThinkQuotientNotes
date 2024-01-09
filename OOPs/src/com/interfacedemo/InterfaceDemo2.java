package com.interfacedemo;

interface Payment{
	
	void pay(float amount);//public abstract
}

class Student implements Payment{

	int id;
	String name;
	double qfees;
	
	public Student(){
		
	}	
	public Student(int id, String name, double qfees) {
		this.id = id;
		this.name = name;
		this.qfees = qfees;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", qfees=" + qfees + "]";
	}
	@Override
	public void pay(float amount) {
		System.out.println("Id :"+ id+" Name : "+name);
		System.out.println("your total fees : "+qfees);
		System.out.println("Fees paid : "+amount);
		if((qfees-amount)!=0)
			System.out.println("remaining fees to be paid : "+(qfees-amount));
	}	
}

class Celebrity implements Payment{

	String adharCard;
	String celebname;
	double income;
	
	public Celebrity(){
		
	}
	public Celebrity(String adharCard, String celebname) {
		super();
		this.adharCard = adharCard;
		this.celebname = celebname;
	}
	@Override
	public void pay(float amount) {
		
		double taxAmount;
		System.out.println("Welcome to Tax Payment : "+celebname);
		System.out.println("Total income "+ amount);
		
		if(amount>1000000)
			taxAmount=0.3*amount;
		else if(amount>700000)
			taxAmount=0.2*amount;
		else if(amount>500000)
			taxAmount=0.1*amount;
		else
			taxAmount=0;
		
		System.out.println("Tax to be paid : "+taxAmount);
		income = amount - taxAmount;
		System.out.println("Income after paying tax "+income);
	}	
}

public class InterfaceDemo2 {
	
	public static void main(String[] args) {
		
		Payment p;
		p = new Student(101,"nisha",34000);
		p.pay(23000);
		
		System.out.println("---------");
		p = new Celebrity("BVw23", "Abc");
		p.pay(900000);
		
	}
}
