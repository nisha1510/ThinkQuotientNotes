package assignmentInteritanceAndPolymorphism;

public class CakeEx {

	public static void main(String[] args) {
		
		Strawberry strawberryCake = new Strawberry();
		BlackForest blackForestCake = new BlackForest();
	
		strawberryCake.bake();
		blackForestCake.bake();
	}
}


interface Cake {
	void bake();
}

class Strawberry implements Cake {
	@Override
	public void bake() {
		System.out.println("Baking Strawberry Cake.");
	}
}

class BlackForest implements Cake {
	@Override
	public void bake() {
		System.out.println("Baking Black Forest Cake.");
	}
}

