package assignmetOverriding;

class Derived  
{ 
    public void getDetails(String temp) 
    { 
        System.out.println("Derived class " + temp); 
    } 
} 
  
public class Test extends Derived 
{ 
//    public int getDetails(String temp) 
//    { 
//        System.out.println("Test class " + temp); 
//        return 0; 
//    } 
	
    public void getDetails(String temp) { 
        System.out.println("Test class " + temp); 
    } 
    
    public static void main(String[] args) { 
     
    	Test obj = new Test(); 
        obj.getDetails("Hello"); 
    } 
}
