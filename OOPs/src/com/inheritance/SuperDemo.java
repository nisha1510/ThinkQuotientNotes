package com.inheritance;

class Parent
{
	int value=10;
	
	void display()
	{
		System.out.println("In parent class:"+value);
	}
	
	
}

class Child extends Parent
{
	int value=100;
	
	void show()
	{
		int value=1000;
		display();
		super.display();
		System.out.println("--------------------");
		System.out.println("Local:"+value);
		System.out.println("Instance:"+this.value);
		System.out.println("Parent:"+super.value);
	}
	 
	void display()
	{
		System.out.println("In child class:"+value);
	}
	


}

public class SuperDemo {
	
	public static void main(String[] args) {
		
		
		Child c1= new Child();
		c1.display();
		
		c1.show();
	}

}
