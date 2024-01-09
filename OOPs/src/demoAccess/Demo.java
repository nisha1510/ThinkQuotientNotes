package demoAccess;

import com.encapsulation.AccessModifiersDemo;

public class Demo {

	public static void main(String[] args) {
		AccessModifiersDemo obj = new AccessModifiersDemo();
//		obj.a=90;//private - only within class
//		obj.b=80;//default - within package
		obj.c=77;//public - everywhere in project
		
//		obj.show();//private-only within class
//		obj.display();//default - within package
		obj.printMe();//public - everywhere
		


	}

}
