package demoAccess;

public class Demo2 extends AccessModifiersProtected{
	
	public static void main(String[] args) {
		
		Demo2 obj= new Demo2();
		
		//obj.a=90; //private is not accessible
		obj.b=89;
		obj.c=67;
		obj.d=71;
		
		//obj.show();
		obj.display();
		obj.printMe();
		obj.display1();
		
	}

}
