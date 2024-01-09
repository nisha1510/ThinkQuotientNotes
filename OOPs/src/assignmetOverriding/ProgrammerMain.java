package assignmetOverriding;
//WAP to create class Programmer with Method workingHours().
//create class Employee which extends Programmer implement workingHours()differently in child.
public class ProgrammerMain {
	
	public static void main(String[] args) {
	  
		Programmer programmer = new Programmer();
	     Employee employee = new Employee();

	     System.out.println("Programmer's working hours:");
	     programmer.workingHours(); 

	     System.out.println("\nEmployee's working hours:");
	     employee.workingHours();
	 }

}

class Programmer {

	void workingHours() {
		System.out.println("A programmer typically works 40 hours a week.");
	}
}

class Employee extends Programmer {
	@Override
	void workingHours() {
		System.out.println("An employee works based on company policies.");
	}
}

