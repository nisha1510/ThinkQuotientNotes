package com.constructor;

public class AccDetails {
	
	private long accno;
	private String holdername;
	private double balance;
	
	public AccDetails() {
		
	}

	public AccDetails(long accno, String holdername, double balance) {
		this.accno = accno;
		this.holdername = holdername;
		this.balance = balance;
	}

	public long getAccno() {
		return accno;
	}

	public void setAccno(long accno) {
		this.accno = accno;
	}

	public String getHoldername() {
		return holdername;
	}

	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	void deposit(double amount) {
		this.balance=amount;
		System.out.println("AccountNumber : "+accno+" Balance has been credited to : "+amount);
		System.out.println("AccountNumber : "+accno+", current balance : "+(balance+amount));
	}
	
	void withdraw(double amount) {
		if((balance-amount)>0) 
		{
			balance-=amount;
			System.out.println("AccountNumber : "+accno+" Balance has been debited by : "+amount);
			System.out.println("Available Balance in "+accno+" is "+balance);
		}
		else
		{
			System.out.println("AccountNumber : "+accno+" has insufficient balance");
		}
	}

	@Override
	public String toString() {
		return "AccDetails [accno=" + accno + ", \nholdername=" + holdername + ", \nbalance=" + balance + "]";
	}

}
