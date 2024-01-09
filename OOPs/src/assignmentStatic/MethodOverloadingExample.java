package assignmentStatic;

public class MethodOverloadingExample {
		
		void calcArea(int side) {
			System.out.println("Area of Square : "+side*side);
		}	
		void calcArea(float radius){
			System.out.println("Area of circle : "+(3.14*radius*radius));
		}
		void calcArea(int l, float b) {
			System.out.println("Area of Rectangle : "+(l*b));	
		}
		void calcArea(float base, int height) {
			System.out.println("Area of triangle : "+(0.5*base*height));
		}
	
	
		public void methodTest(Object object) {
			System.out.println("calling object method");
		}
		public void methodTest(String object) {
			System.out.println("calling string method");
		}
		public void methodTest(Number object) {
			System.out.println("calling number method");
		}
		public void methodTest(Integer object) {
			System.out.println("calling int method");
		}
		public void methodTest(Float object) {
			System.out.println("calling float method");
		}
		public void methodTest(Double object) {
			System.out.println("calling double method");
		}
	public static void main(String[] args) {
		
		MethodOverloadingExample obj1 = new MethodOverloadingExample();
		obj1.calcArea(0.5f);
		obj1.calcArea(3);
		obj1.calcArea(3, 5f);
		obj1.calcArea(4f, 5);

		System.out.println("---------------");
		
		MethodOverloadingExample obj2 = new MethodOverloadingExample();
		obj2.methodTest(10);
		obj2.methodTest(10.0);
		obj2.methodTest(10f);
		
	}
}
