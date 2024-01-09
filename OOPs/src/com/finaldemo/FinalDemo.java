package com.finaldemo;

/*
Final - restrict user
Applied : variable, class, method

initialized during compilation

instance - final : initialize them in every constructor
					,if initialized in instance block then remove from constructor 
					because the value is allocated and cannot be changed
					
no setters for final variables
fina; class - cant be inherited
Ex - String class is final class
					
FInal needs to be initialized during compilation
so we dont make instance variable final
if we make instance variable final initialize there OR we can initialize in constructor
if we make variable final static initialize there OR we can initialize in static block
*/
class Developer{
	
	String ename;
	float salary;
	final static String companyName;
	final String panNo;
//	final int noOfHours=8;
	final int noOfHours;
	
	static
	{
		companyName="TQ";
	}
	
	public  Developer() {//initialize 
		ename="unknown";
		panNo="unknown";
	}
	{
	  noOfHours=8;
	}
	
	Developer(String ename, float salary, String panNo){
		super();
		this.ename = ename;
		this.salary=salary;
		this.panNo=panNo;
	}
	
	final void skillSet() {
		System.out.println("Java");
	}
}
class FullStack extends Developer{
	
//	final void skillSet() {
//		System.out.println("Java");
//	}
//Final method cant be overriden	
}
public class FinalDemo {

	public static void main(String[] args) {
		Developer d = new Developer();
//		d.noOfHours=9;
		

	}

}
