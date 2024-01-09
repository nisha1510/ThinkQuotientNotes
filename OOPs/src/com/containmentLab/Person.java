package com.containmentLab;

public class Person {
	
	private String name;
	private double age;
	private String email;
	private Address addr;
	
	public Person() {
		
	}
	public Person(String name, double age, String email, Address addr) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email + ", addr=" + addr + "]";
	}
	
}
