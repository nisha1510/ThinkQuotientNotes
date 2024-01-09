package assignmetOverriding;
/*
 WAP to create a class Kid with method readBook() and another method readBook () with 2
parameters. The method readBook here is over-loaded (same method name but different
parameters) Create a class BigKid which extends Kid created above. Implement readBook() differently in
BigKid class. Here the method readBook() has been over-ridden in the child class BigKid()
*/
public class KidMain {
	public static void main(String[] args) {
		Kid k = new Kid();
		k.readBook();
		Kid k1 = new BigKid();
		k1.readBook();
		
	}

}

class Kid{
	void readBook() {
		System.out.println("reading from KidClass");
	}
	void readBook(String s) {
		System.out.println("reading Books");	
	}
}

class BigKid extends Kid{
	
	void readBook() {
		System.out.println("reading from BigKidClass");
	}
}