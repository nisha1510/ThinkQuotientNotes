package assignmentThisAndSuper;
//3.	super() can be used to invoke immediate parent class constructor. 

public class SuperExample3 {

	public static void main(String[] args) {
	 
		Child2 child = new Child2();
	}
}

class Parent2 {
	Parent2() {
		System.out.println("Inside Parent class constructor.");
	}
}

class Child2 extends Parent2 {
	Child2() {
		super(); // Invoking Parent class constructor using super()
		System.out.println("Inside Child class constructor.");
	}
}

