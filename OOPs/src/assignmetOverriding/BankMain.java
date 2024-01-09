package assignmetOverriding;

public class BankMain {
	
	public static void main(String[] args) {
	
		Bank bank = new Bank();
		
		bank.displayInterestRate("default"); 
	    bank.displayInterestRate("savings"); 
	    bank.displayInterestRate("current"); 
	    bank.displayInterestRate("unknown"); 
	}
}

class Bank {
	
	double defaultInterestRate = 2.0; 


	void displayInterestRate(String accountType) {
		
		switch (accountType.toLowerCase()) {
        	case "default":
        		System.out.println("Default account interest rate: " + defaultInterestRate + "%");
        		break;
        	case "savings":
        		System.out.println("Savings account interest rate: 3%");
        		break;
        	case "current":
        		System.out.println("Current account interest rate: 5%");
        		break;
        	default:
        		System.out.println("Invalid account type");
		}
	}
}
