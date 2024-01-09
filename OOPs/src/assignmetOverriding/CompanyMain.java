package assignmetOverriding;
/*
WAP to create class company with method address. 
create class eBay which extends company implement address() differently in eBay class.
Here the method address ()has been overridden in child class.
*/
public class CompanyMain {
	
	public static void main(String[] args) {

		Company company = new Company();
        eBay ebay = new eBay();

        System.out.println("Calling Company's address:");
        company.address();
        System.out.println("Calling eBay's address:");
        ebay.address(); 
    }
}

class Company {
	
	 void address() {
       System.out.println("Company address: blueridge town");
   }
}

class eBay extends Company {
	    
	    @Override
	    void address() {
	        System.out.println("eBay's address: teerthTechnospace");
	    }
	}


