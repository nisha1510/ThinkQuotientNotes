package com.containmentAssignment;

public class Person {
	
	private String name;
	private String gender;
	private double age;
	private Address addr;
	
	public Person() {
		
	}
	public Person(String name, String gender, double age, Address addr) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", " + addr + "]";
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Nisha");
		p.setGender("Female");
		p.setAge(23);
		p.setAddr(new Address());
		p.getAddr().setCity("Pune");
		p.getAddr().setState("Maharastra");
		p.getAddr().setContry("India");
		System.out.println(p);
		
	}
	
}
