package com.constructor;

class EmpDetails {

	private int eid;
	private String ename;
	private double salary;
	
	public EmpDetails(){
		
	}
	public EmpDetails(int eid, String ename, double salary) {
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
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
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return eid+" "+ename+" "+salary;
	}
}
public class Emp{
	public static void main(String[] args) {
		
		EmpDetails e1 = new EmpDetails(101,"nisha",50000);//tight-coupling or initialization
		System.out.println(e1);
		
		EmpDetails e2 = new EmpDetails();//lazy initialization
		e2.setEid(102);
		e2.setEname("isha");
		e2.setSalary(90000);
		System.out.println(e2);
	}
}
