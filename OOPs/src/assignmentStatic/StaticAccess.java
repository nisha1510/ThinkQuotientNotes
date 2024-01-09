package assignmentStatic;

import com.staticdemo.AccessStatic;

public class StaticAccess {

	int x = 10;
	static int y = 20;
	
	void instanceMethod() {
		System.out.println(x);
		System.out.println(y);
		staticMethod();
	}
	
	static void staticMethod() {
//		System.out.println(x);//need to create obj
		System.out.println(y);
		StaticAccess obj1 = new StaticAccess();
		System.out.println(obj1.x);
		
	}
	public static void main(String[] args) {
		
		staticMethod();
		
		StaticAccess obj2 = new StaticAccess();
		obj2.instanceMethod();

	}
}
/*
4.	Check following variations:
a.	Static variable and Non-Static (Instance Variable) – Just declare and print it.
b.	See if you can access static variable in static method
c.	non static variable in static method
d.	then static variable in non-static method
e.	non static variable in non-static method Note: non static means instance variable

*/