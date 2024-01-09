package assignmentStatic;

public class Ambiguity {
	
	public void add(int num1, float num2){
		System.out.println("first");
		System.out.println(num1+num2);
	}
	
	public void add(float num1, int num2){
		System.out.println("second");
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) {
		
		Ambiguity a1 = new Ambiguity();
//		a1.add(10, 10);//the method is ambigious
	}

}
