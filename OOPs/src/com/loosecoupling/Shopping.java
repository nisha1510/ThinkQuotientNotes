//package com.loosecoupling;
//
//interface Payment{
//	
//	boolean doTransaction(float amount);
//}
//
//
//class CreditCard implements Payment{
//
//	private int cardNo;
//	private int cvv;
//	private double limit;
//	
//	public CreditCard() {
//		
//	}
//	public CreditCard(int cardNo, double limit) {
//		this.cardNo = cardNo;
//		this.limit = limit;
//	}
//	public CreditCard(int cardNo, int cvv, double limit) {
//		this.cardNo = cardNo;
//		this.cvv = cvv;
//		this.limit = limit;
//	}
//
//	public int getCardNo() {
//		return cardNo;
//	}
//	public void setCardNo(int cardNo) {
//		this.cardNo = cardNo;
//	}
//	public int getCvv() {
//		return cvv;
//	}
//	public void setCvv(int cvv) {
//		this.cvv = cvv;
//	}
//	public double getLimit() {
//		return limit;
//	}
//	public void setLimit(double limit) {
//		this.limit = limit;
//	}
//	@Override
//	public boolean doTransaction(float amount) {
//		if((limit-amount)>0) {
//			System.out.println("Credit card is debited by : "+amount);
//			this.limit-=amount;
//			return true;
//		}
//		else
//		{
//			System.out.println("Overlimit...Credit limit "+limit);
//			return false;
//		}	
//	}
//}
//
//class DebitCard implements Payment{
//
//	private int cardNo;
//	private double balance;
//	public DebitCard() {
//		
//	}
//	public DebitCard(int cardNo, double balance) {
//		super();
//		this.cardNo = cardNo;
//		this.balance = balance;
//	}
//	public int getCardNo() {
//		return cardNo;
//	}
//	public void setCardNo(int cardNo) {
//		this.cardNo = cardNo;
//	}
//	public double getBalance() {
//		return balance;
//	}
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
//	@Override
//	public boolean doTransaction(float amount) {
//		if((this.balance-amount)>=1000)
//		{
//			System.out.println("Debit card is debited by :"+amount);
//			this.balance-=amount;
//			System.out.println("Balance left :"+this.balance);
//			System.out.println("======");
//			return true;
//		}
//		else
//		{
//			System.out.println("insufficient balance : "+balance);
//			return false;
//		}	
//	}
//}
//
//
//public class Shopping {
//	
//	String name;
//	long mobileNo;
//	int bill;
//	
//	public Shopping() {
//		
//	}
//	public Shopping(String name, long mobileNo) {
//		super();
//		this.name = name;
//		this.mobileNo = mobileNo;
//	}
//	
//	public Shopping(String name, long mobileNo, int bill) {
//		super();
//		this.name = name;
//		this.mobileNo = mobileNo;
//		this.bill = bill;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public long getMobileNo() {
//		return mobileNo;
//	}
//	public void setMobileNo(long mobileNo) {
//		this.mobileNo = mobileNo;
//	}
//	public int getBill() {
//		return bill;
//	}
//	public void setBill(int bill) {
//		this.bill = bill;
//	}
//	//loose coupling
//	public void payBill(Payment p, float amt, float discount) {
//		float totalamount = amt;
//		amt = amt - ((discount/100)*amt);
//		if(p.doTransaction(amt))
//		{
//			this.bill-=totalamount;
//		}
//		System.out.println("Bill to be paid : "+this.bill);
//		
//	}
//
//	public static void main(String[] args) {
//		
//		Shopping s = new Shopping("Bhaskar", 9786545446l);
//		s.setBill(70000);
//		CreditCard c = new CreditCard(765342, 333, 50000);
//		DebitCard d = new DebitCard(234567, 35000);
//		
//		System.out.println("Total bill :"+s.bill);
//		System.out.println("-------");
//		s.payBill(c, 40000);
//		System.out.println("-------");
//		s.payBill(d, 20000, 10);
//
//		
//	}
//
//}
