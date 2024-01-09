package demoAccess;

public class AccessModifiersProtected {
	
	// instance variable and method
	
	private int a;
	int b; // default
	protected int d;
	public int c;
	
	private void show()
	{
		System.out.println("Private method");
	}
	
	void display()
	{
		System.out.println("Default method");
	}
	
	public void printMe()
	{
		System.out.println("Public method");
	}
	
	protected void display1()
	{
		System.out.println("Protected method");
	}
	
	
	public static void main(String[] args) {
		
		// Inside the class everything is accessible
		
		AccessModifiersProtected a1= new AccessModifiersProtected();
		
		a1.a=90;
		a1.b=67;
		a1.c=56;
		a1.d=71;
		
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a1.c);
		System.out.println(a1.d);
		
		a1.show();
		a1.printMe();
		a1.display();
		a1.display1();
		
		
	}

}
