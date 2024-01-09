package com.methodoverriding;

class Account{
	private int accNo;
	private String name;
	protected double balance;
	public Account() {
		
	}
	public Account(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	void deposit(float amount) {
		balance = balance + amount;
		System.out.println("Account Number : "+accNo);
		System.out.println("Account is credited by "+amount);
		System.out.println("New Balance "+balance);
	}
	void withdraw(float amount) {
		if((balance-amount)>0) {
			balance = balance - amount;
			System.out.println("Account Number : "+accNo);
			System.out.println("Account is credited by "+amount);
			System.out.println("New Balance "+balance);
		}
		else
		{
			System.out.println("Account Number : "+accNo);
			System.out.println("insufficient Balance "+balance);
		}
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
}
	

class SavingAccount extends Account{
	
	private String panNo;
	
	public SavingAccount() {
		
	}
	public SavingAccount(int accNo, String name, double balance) {
		super(accNo, name, balance);
	}
	public SavingAccount(int accNo, String name, double balance,String panNo) {
		super(accNo, name, balance);
		this.panNo = panNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	void deposit(float amount) 
	{
		if(((balance+amount)>50000) && (panNo==null)) 
		{
			System.out.println("please provide pan number as balance exceeds 50000");
		}
		else
		{
			super.deposit(amount);
		}
			
	}
	@Override
	public String toString() {
		return "SavingAccount [panNo=" + panNo + ", balance=" + balance + ", getPanNo()=" + getPanNo() + ", getAccNo()="
				+ getAccNo() + ", getName()=" + getName() + ", getBalance()=" + getBalance() + "]";
	}
	
}


public class BankOverriding {

	public static void main(String[] args) {
		
		Account a1 = new Account(1234,"Nisha",1000);
		System.out.println(a1);
		System.out.println("-------");
		a1.deposit(2000);
		System.out.println("--------");
		a1.withdraw(3500);
		System.out.println("--------");
		a1.deposit(56000);
		System.out.println("====================");
		
		SavingAccount s1 = new SavingAccount(1021, "Rutuja", 20000);
		//System.out.println(s1);
		s1.deposit(20000);
		s1.deposit(20000);
		s1.setPanNo("BVWPJ215");
		s1.deposit(20000);
		System.out.println("-------");
		
	}
}
