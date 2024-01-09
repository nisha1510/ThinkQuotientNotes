package com.staticdemo;

class Counter{
	
	int data;
	static int count = 0;
	
	{
		count++;
	}
	
	Counter(){
		data=10;
	}
	Counter(int data){
		this.data=data;
	}	
}


public class HitCounterApp 
{
	public static void main(String[] args) 
	{
		Counter c1 = new Counter();
		System.out.println("Data : "+c1.data);
		System.out.println("count : "+Counter.count);
		
		Counter c2 = new Counter();
		System.out.println("Data : "+c2.data);
		System.out.println("count : "+Counter.count);
		
		Counter c3 = new Counter();
		System.out.println("Data : "+c3.data);
		System.out.println("count : "+Counter.count);

	}

}
