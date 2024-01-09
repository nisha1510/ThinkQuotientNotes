package assignmentInteritanceAndPolymorphism;
//Create interface IceCream with method eat and Juice with method drink. 
//Create class Mastani which implements both interfaces.
public class IcecreamTest {

	public static void main(String[] args) {
		
		Mastani mastani = new Mastani();
		mastani.eat();
		mastani.drink();
	}
}

interface IceCream {
	void eat();
}


interface Juice {
	void drink();
}

class Mastani implements IceCream, Juice {
	
	@Override
	public void eat() {
		System.out.println("Enjoying Mastani Ice Cream.");
	}

	@Override
	public void drink() {
		System.out.println("Sipping Mastani Juice.");
	}
}
