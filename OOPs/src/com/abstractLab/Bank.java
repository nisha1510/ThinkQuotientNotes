package com.abstractLab;

public abstract class Bank {
	
	abstract void getBalance();
}

class BankA extends Bank{

	@Override
	void getBalance() {
		System.out.println("rs100 deposited in Bank A");
		
	}
}

class BankB extends Bank{

	@Override
	void getBalance() {
		System.out.println("rs150 deposited in Bank B");
		
	}
}

class BankC extends Bank{

	@Override
	void getBalance() {
		System.out.println("rs200 deposited in Bank C");
		
	}
}