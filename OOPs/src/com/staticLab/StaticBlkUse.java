package com.staticLab;

public class StaticBlkUse {
	
	private int id;
//	static String sclName;
	static String sclName="ABC";
	
	StaticBlkUse(){
		System.out.println("In Default Constructor");
	}
	
	public StaticBlkUse(int id) {
		this.id = id;
	}

	public static void display() {
		System.out.println("In Method");
	}
	
	static {
		System.out.println("in static Block");
	}

	public String toString() {
		return "StaticBlkUse [id=" + id + " SchoolNAME : " + sclName+"]";
	}

	public static void main(String[] args) {
		StaticBlkUse obj1 = new StaticBlkUse (1);
		System.out.println(obj1);
		display() ;
	}

}
