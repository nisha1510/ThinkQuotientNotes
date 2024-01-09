package assignmetOverriding;
//WAP to create class Person with method readScript().
//create class Actor which extends Person implement readScript() differently in child

public class PersonMain {
	
	public static void main(String[] args) {
	     Person person = new Person();
	     Actor actor = new Actor();

	     System.out.println("Person's script reading:");
	     person.readScript(); 
	     
	     System.out.println("\nActor's script reading:");
	     actor.readScript(); 
	 }
}

class Person {
	void readScript() {
		System.out.println("Person is reading a script.");
	}
}

class Actor extends Person {
	
	@Override
	void readScript() {
		System.out.println("Actor is rehearsing the script.");
	}
}

