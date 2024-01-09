package com.containment;

public class Employee {

	private int eid;
	private String ename;
	private double salary;
	private Department dept;
	
	Employee(){
		
	}
	Employee(int eid, String ename, double salary, Department dept){
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
		this.dept=dept;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept=dept;
	}
	public String toString() {
		return "Employee : [EmpId : "+eid+", EmpName : "+ename+
				", EmpSalary : "+salary+", Department : "+dept+"]";
	}
}








