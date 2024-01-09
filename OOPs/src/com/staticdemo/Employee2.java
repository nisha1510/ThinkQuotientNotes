package com.staticdemo;

public class Employee2 {
	
	private int eid;
	private String ename;
	private double sal;
//1	//static String companyName;
//2	//static String companyName = "HCL";
	
//3	
//	static String companyName;
//	//static block executes before instance
//	static {
//		companyName = "HCL";
//	}

//4	
	static String companyName;
	//instance block
	{
		System.out.println("inside instance block");
		companyName = "HCL";
	}
	
	public Employee2() {
		System.out.println("in default constructor");
//5	//	companyName = "HCL";
	}
	
	public Employee2(int eid, String ename, double sal) {
		this();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid=eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename=ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal=sal;
	}
	
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}

}
