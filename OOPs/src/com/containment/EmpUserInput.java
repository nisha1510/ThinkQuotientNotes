package com.containment;

import java.util.Scanner;

public class EmpUserInput {
	
	static Scanner sc = new Scanner(System.in);
	
	static void enterEmpDetails(Employee e) {
		System.out.println("Enter Employee Id");
		e.setEid(sc.nextInt());
		System.out.println("Enter Employee Name");
		e.setEname(sc.next());
		System.out.println("Enter Employee Salary");
		e.setSalary(sc.nextDouble());
		
		e.setDept(new Department());
		System.out.println("Enter Department Id");
		e.getDept().setDid(sc.nextInt());
		System.out.println("Enter Department Name");
		e.getDept().setDname(sc.next());
		
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
		enterEmpDetails(emp);
		System.out.println(emp);

	}

}
