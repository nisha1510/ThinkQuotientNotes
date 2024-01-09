package com.outside;

import demoAccess.AccessModifiersProtected;

public class DemoOutside2 extends AccessModifiersProtected {
	
	public static void main(String[] args) {
				
		DemoOutside2 obj= new DemoOutside2();
		
		//obj.a=90;// private is not accessible
		//obj.b=89;// default is not accessible
		obj.c=67;
		obj.d=89;
		
		//obj.show();
		//obj.display();
		obj.printMe();
		obj.display1();
	}

}
