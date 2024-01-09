//package com.loosecoupling;
//
//interface Payment1{
//	
//	boolean doTransaction(float amount);
//}
//
//
//class CreditCard1 implements Payment{
//
//	private int cardNo;
//	private int cvv;
//	private double limit;
//	
//	public CreditCard1() {
//		
//	}
//	public CreditCard1(int cardNo, int cvv, double limit) {
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
//		if((limit-amount)>0) 
//		{
//			System.out.println("Credit card is debited by : "+amount);
//			this.limit-=amount;
//			return true;
//		}
//		else
//		{
//			System.out.println("Overlimit...Credit limit : "+limit);
//			return false;
//		}	
//	}
//	
//	public void payBill(Payment p, float amt, float discount)
//	{
//		float totalAmount = amt;
//		amt = amt - ((discount/100)*amt);
//		if(p.doTransaction(amt))
//		{
//			this.bill - =
//		}
//	}
//}
//
//class DebitCard1 implements Payment{
//
//	private int cardNo;
//	private double balance;
//	
//	public DebitCard1() {
//		
//	}
//	public DebitCard1(int cardNo, double balance) {
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
//	public void doTransaction(float amount) {
//		if((this.balance-amount)>=1000)
//		{
//			System.out.println("Debit card is debited by :"+amount);
//			this.balance-=amount;
//			System.out.println("Balance left :"+this.balance);
//		}
//		else
//		{
//			System.out.println("insufficient balance ");
//		}	
//	}
//}
//
//
//public class Shopping2 {
//	
//	String name;
//	long mobileNo;
//	
//	public Shopping2() {
//		
//	}
//	public Shopping2(String name, long mobileNo) {
//		super();
//		this.name = name;
//		this.mobileNo = mobileNo;
//	}
//	//tight coupling
//	public void payBill(CreditCard c, float amt) {
//		c.doTransaction(amt);
//	}
//
//	public static void main(String[] args) {
//		
//		Shopping2 s = new Shopping2("Bhaskar", 45446);
//		CreditCard c = new CreditCard(765342, 333, 50000);
//		DebitCard d = new DebitCard(234567, 222);
//		s.payBill(c, 40000);
////		d.paybill(d, 34000);
//	}
//
//}
