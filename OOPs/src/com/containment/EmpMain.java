package com.containment;

public class EmpMain {

	public static void main(String[] args) {
		
		Department d = new Department();
		d.setDid(1);
		d.setDname("IT");
		Employee e = new Employee();
		e.setEid(101);
		e.setEname("Nisha");
		e.setSalary(50000);
		e.setDept(d);
		
		System.out.println(e);
		

	}

}
