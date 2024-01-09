package com.inheritance;

class Employee{
	private int id;
	private String name;
	protected double salary;
	
	public Employee() {
		System.out.println("In Employee Default constructor");
	}
	public Employee(int id, String name, double salary) {
		System.out.println("In Employee Parameterized constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;	
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}

class Manager extends Employee{
	private String role;
	private float exp;
	
	public Manager() {
		System.out.println("In Manager Default constructor");
	}
	public Manager(int id, String name, double salary, String role, float exp) {
//		System.out.println("In Employee parameterized constructor");
		super(id,name,salary);
		this.role = role;
		this.exp = exp;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public float getExp() {
		return exp;
	}
	public void setExp(float exp) {
		this.exp = exp;
	}
	
//	public String toString() {
		//return "Manager [role=" + role + ", exp=" + exp + "]";
//		return "Manager ["+" Id : "+getId()+", Name : "+getName()+", Salary : "+salary+
//				", Role = " + role + ", exp=" + exp + "]";
//	}
}


public class SingleInheritance {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Nisha", 50000);
		System.out.println(e1);
		System.out.println("--------------");
		
		Manager m1 = new Manager(101,"Rutuja",45000,"IT",5);
		System.out.println(m1);
		
	}

}
