package com.containmentAssignment;

public class Employee {

	private int eid;
	private String ename;
	private double salary;
	private Department dept;
	private Mydate mydate;
	
	Employee(){
		
	}
	
	public Employee(int eid, String ename, double salary, Department dept, Mydate mydate) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.dept = dept;
		this.mydate = mydate;
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
	
	public Mydate getMydate() {
		return mydate;
	}

	public void setMydate(Mydate mydate) {
		this.mydate = mydate;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", " + dept + ", "
				+ mydate + "]";
	}
}








