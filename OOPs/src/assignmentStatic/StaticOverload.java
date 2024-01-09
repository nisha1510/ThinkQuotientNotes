package assignmentStatic;

public class StaticOverload {

	//We can have two or more static methods with the same name, but differences in input parameters.
	public static void add(int n1) {
		System.out.println("in int : " +(n1+n1));
	}
	public static void add(int n1,float n2) {
		System.out.println("in float : "+n1+n2);
	}
	
	//We cannot overload two methods in Java if they differ only by static keyword 
	//(the number of parameters and types of parameters is the same).
	
	public static void sub() {
		System.out.println("in method Static");
	}
//	public void sub() {
//		System.out.println("in non-static sub");
//	}
	public static void main(String[] args) {
		
		add(5);
		add(5,2);
		sub();
		
	}

}
