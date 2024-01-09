package com.containmentAssignment;

public class PersonTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEid(1);
		emp.setEname("nisha");
		emp.setSalary(50000);
		
		emp.setDept(new Department());
		emp.getDept().setDeptId(01);
		emp.getDept().setDeptName("IT");
		
		emp.setMydate(new Mydate());
		emp.getMydate().setDate(11);
		emp.getMydate().setMonth(11);
		emp.getMydate().setYear(2023);
		
		System.out.println(emp);
	}
}
