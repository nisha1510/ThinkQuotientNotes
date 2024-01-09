package com.overloadingLab;

public class ClassOne1 {
	
	void method(String s1) {
		method("S1 : "+s1+s1);
	}
	
	void method(String s1, String s2) {
		method("S1 S2 : "+s1+s2);
	}
	
	void method(String s1, String s2, String s3) {
		method("S1 S2 S3 : "+s1+s2+s3);
	}
	
	public static void main(String[] args) {
		ClassOne1 obj1 = new ClassOne1();
		obj1.method("nisha");
		System.out.println(obj1);
		
//		System.out.println(obj1.method("nisha"));
//		System.out.println(obj1.method("nisha", "Jadhav"));
//		System.out.println(obj1.method("nisha", "S", "Jadhav"));

	}

}
