package com.staticLab;

public class Test4 {
	 static int x = 10;
	 int y = 15;
	 
	 public Test4() {
		 x++;
		 y++;
	 }
	public static void main(String[] args) {
		Test4 t1 = new Test4();
		Test4 t2 = new Test4();
		Test4 t3 = new Test4();
		
		System.out.println(t3.x+" "+t3.y);

	}

}
