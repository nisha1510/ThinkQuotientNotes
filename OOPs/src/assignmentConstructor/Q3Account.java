package assignmentConstructor;

/*
3. Create default constructor assign new value to all variables. Write SOP I am in default
constructor
*/
public class Q3Account {

	public static void main(String[] args) {
		AccDetails a1 = new AccDetails();
		System.out.println(a1);
		
		AccDetails a2 = new AccDetails();
		System.out.println(a2);
	}
}


class AccDetails {
	
	public long accountNo; 
	public String customerName;
	
	AccDetails(){
		System.out.println("Inside Default");
		accountNo = 12345;
		customerName = "Nisha";		
	}

	@Override
	public String toString() {
		return "AccDetails [accountNo=" + accountNo + ", customerName=" + customerName + "]";
	}
	
}