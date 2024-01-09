package com.constructor;

class Demo{
	
	int a;
	int b;
	String name;
	
	 Demo(){
		 
//		 a = 10;
//		 b = 10;
//		 name="Nisha";
		 
		 this(10,10);//2)Constructor chaining
		 //this stmt here should always be the first statement
		 System.out.println("Inside Default");
	 }
	 
	 Demo(int a, int b){
		 //1)Differtitate b/w instance variable and argument
		 System.out.println("Inside Parameterized");
		 this.a = a;
		 this.b = b;
		 name="Nisha";
	 }
	 
	 
	 void display() {
		 System.out.println(a);
		 System.out.println(b);
		 addition(this);//3)To pass current object to another method this is used
	 }
	 
	 void addition(Demo d) {
		 System.out.println("Sum : "+(d.a+d.b));
	 }
	 
	 Demo show() {
		 a=a+10;
		 b=b+10;
		 name=name+"TQ";
		 
		 return this;//4)return the current object
	 }
	 
	 void printMe() {
		 //5)to differentiate bet local and instance variable
		 int a=100;
		 System.out.println("Local : "+a);
		 System.out.println("Instance : "+this.a);
		 this.show();//6)call one instance method from another
	 }
	 
	 void show1() {
		 System.out.println("Hello");
	 }
}

public class ThisDemo {

	public static void main(String[] args) {
		Demo obj1 = new Demo();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.name);
		
		System.out.println("--------------");
		Demo obj2 = new Demo(2,3);
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		System.out.println(obj2.name);
		
		
		System.out.println("--------------");
		Demo obj3 = new Demo();
		obj3.display();
		
		System.out.println("--------------");
		Demo d1;
		Demo obj4 = new Demo();
		System.out.println(obj4.a+" "+obj4.b+" "+obj4.name);
		d1 = obj4.show();
		System.out.println(d1.a+" "+d1.b+" "+d1.name);
	}

}
