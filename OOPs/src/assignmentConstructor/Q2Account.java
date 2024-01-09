package assignmentConstructor;


public class Q2Account{
	public static void main(String[] args) {
		Q1AccDetails a1 = new Q1AccDetails();
		System.out.println(a1);	
		
		Q1AccDetails a2 = new Q1AccDetails();
		System.out.println(a2);
		
		Q1AccDetails a3 = new Q1AccDetails(45678, "Isha");
		System.out.println(a3);
		
		Q1AccDetails a4 = new Q1AccDetails();
		a4.setAccountNo(34568);
		a4.setCustomerName("Rutuja");
		System.out.println(a4);
		
		Q1AccDetails a5 = new Q1AccDetails();
		a4.setAccountNo(99568);
		a4.setCustomerName("Vaishnavi");
		System.out.println(a5);
		
	}
}

class Q1AccDetails {
	
		public long accountNo; 
		public String customerName;
		
		Q1AccDetails(){
			System.out.println("Inside Default");
			accountNo = 12345;
			customerName = "Nisha";		
		}
		Q1AccDetails(long accountNo, String customerName){
			System.out.println("inside parameterized");
			this.accountNo = accountNo;
			this.customerName = customerName;
		}
		public long getAccountNo() {
			return accountNo;
		}
		public void setAccountNo(long accountNo) {
			this.accountNo=accountNo;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		@Override
		public String toString() {
			return "Q1AccDetails [accountNo=" + accountNo + ", customerName=" + customerName + "]";
		}
		
		
}
/*
1. Create a class Account with member Variable: long accountNo, String customerName.
Make them public.
2. In main, create a new object of the Account class and print the member variables value.
Note – Default constructor is provided by Java to facilitate the creation of a new object.
Here variables are assigned default values
3. Create default constructor assign new value to all variables. Write SOP I am in default
constructor
4. In main, create another object of the Account class and print the member variables
value. Note – Since you have defined a (default) constructor, Java does not provide
another one.
5. Define a constructor which takes all arguments and assigns those values to the member
variables. SOP I am in parameterized constructor
6. In main, to create another object of the Account class using the constructor with all
arguments and print the member variable values.
7. In main method, create 2 Account objects with different account numbers and names.
Then print the values of all the member variables of both the accounts.
8. From Account class, comment the default constructor with no arguments and try to
create an Account object by calling the default constructor. Note – If a non-default (non-
parameterized) constructor is present in the source code, Java will not provide a default
one. Hence you cannot do Account a = new Account();
*/