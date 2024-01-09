package assignmentThisAndSuper;

//1.	super can be used to refer immediate parent class instance variable. 
public class SuperExample {

	public static void main(String[] args) {
	    Child child = new Child();
	    child.displayVariables();

	}
}

class Parent {
	int parentVariable = 10;
}


class Child extends Parent {
	
	int childVariable = 20;

	void displayVariables() {
		System.out.println("Parent variable accessed using super: " + super.parentVariable);
		System.out.println("Child variable: " + childVariable);
	}
}
