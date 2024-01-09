package com.containmentAssignment;

public class Department {
	
	private int deptId;
	private String deptName;
	
	public Department() {
		
	}
	public Department(int deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
}
/*
WAP to have Department class created with id, name . Student class has
roll, name and Department object should have id and name. Assign and
print individual values in main method

*/