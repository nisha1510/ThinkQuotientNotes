package assignmentInteritanceAndPolymorphism;

/*
WAJP2 create a class Kid with method readBook() and another method
readBook () with 2 parameters. The method readBook here is over-loaded (same
method name but different parameters) 
*//*
Create a class BigKid which extends Kid created above. Implement readBook()
differently in BigKid class. Here the method readBook() has been over-ridden in
the child class BigKid() 
*/
/*
Create a class Teenager which extends Kid created above (#14). Implement
readBook() differently in Teenager class. In main method, declare 2 variables k1,
k2 of type Kid. Create objects of type BigKid and Teenager such that K1 should
reference object of class BigKid and K2 should reference object of class Teenager.
Call their respective readBook() methods. The output is different from both the
method calls even if the variable type is the same i.e. Kid. This is compile time
polymorphism example. 
*/
public class KidExample {

	public static void main(String[] args) {
		
		Kid kid = new Kid();
	    BigKid bigKid = new BigKid();

	    kid.readBook(); 
	    kid.readBook("Java", 30);
	    System.out.println();

	    bigKid.readBook(); 
	    bigKid.readBook("Adv Java", 60);
	    
	    Teenager teen = new Teenager();
	    
	}

}
class Kid {

	void readBook() {
		System.out.println("The kid is reading a book.");
    }

    void readBook(String bookTitle, int readingTime) {
        System.out.println("The kid is reading '" + bookTitle + "' for " + readingTime + " minutes.");
    }
}

class BigKid extends Kid {
 
    @Override
    void readBook() {
        System.out.println("The big kid is reading ");
    }
}
class Teenager extends Kid{
	
	@Override
	void readBook() {
		System.out.println("The Teenager is reading a book.");
    }
}
