package com.staticdemo;

public class Employee {
	
	private int eid;
	private String ename;
	private double sal;
//1	//static String companyName;
//2	//static String companyName = "HCL";
	
//3	
	static String companyName;
	//static block executes before instance
	static {
		companyName = "HCL";
	}

	
	public Employee() {
		
	}
	public Employee(int eid, String ename, double sal) {
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
