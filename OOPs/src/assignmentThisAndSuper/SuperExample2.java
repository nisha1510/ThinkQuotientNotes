package assignmentThisAndSuper;

//2.	super can be used to invoke immediate parent class method. 
public class SuperExample2 {

	public static void main(String[] args) {
	     
		Child1 child = new Child1();
	    child.display();
	}
}


class Parent1 {
	
	void display() {
		System.out.println("Inside Parent class display method.");
	}
}


class Child1 extends Parent1 {
	@Override
	void display() {
		System.out.println("Inside Child class display method.");
		super.display(); // Invoking Parent class display method using super
	}
}
