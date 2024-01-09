package com.constructorLab;

public class Customer {

	private int custId;
	private String custName;
	private String custEmail;
	private long custMob;
	private String custPassword;
	
	public Customer(){
		
	}
	public Customer(int custId, String custName, String custEmail, long custMob, String custPassword) {
		this.custId = custId;
		this.custName = custName;
		this.custEmail = custEmail;
		this.custMob = custMob;
		this.custPassword = custPassword;
	}
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public long getCustMob() {
		return custMob;
	}
	public void setCustMob(long custMob) {
		this.custMob = custMob;
	}
	public String getCustPassword() {
		return custPassword;
	}
	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}
	
	public String toString(){
		return "Customer Details[ \nCustomerId : "+custId+" \nCustomerName : "+custName+" "
				+ "\nCustomerEmail : "+custEmail+" \nCustomerContact : "+custMob+
				" \nCustomerPassword : "+custPassword+"]";
	}
	public static void main(String[] args) {
		
		Customer cust = new Customer(101, " Nisha", "nisha@gmail.com", 9856223456l, "Nisha@123");
		System.out.println(cust);
		
	}
}
