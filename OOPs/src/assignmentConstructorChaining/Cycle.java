package assignmentConstructorChaining;

public class Cycle {
	
	private int accountNo; 
	private int noOfWheels;
	
	public Cycle(){
		System.out.println("I am Default Constructor");
	}
	public Cycle(int accountNo, int noOfWheels){
		this();
		System.out.println("I am another Constructor");
	}
	
	public static void main(String[] args) {
		Cycle c1 = new Cycle();
//		System.out.println(c1);
		System.out.println("-----------");
		Cycle c2 = new Cycle(123, 2);
//		System.out.println(c2);
		
	}
}
/*
1.	Create a class Cycle with member variables: intaccountNo, intnoOfWheels.
2.	Create a default constructor with a SOP in it “I am default constructor”
3.	Create another constructor which takes 2 arguments, calls the default constructor 
	using this() and has a SOP in it “I am another constructor”.
4.	In main method, create an object of type Cycle by using default constructor. 
    Note the output.
5.	Create another object of type Cycle by using the parameterized constructor. 
	Note the sequence of SOPs indicating that inner most constructor is called first.
*/