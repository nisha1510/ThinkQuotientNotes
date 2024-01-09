package com.overloadingLab;

public class MainClass {

	public static void main(String[] args) {
		
		ClassOne one = new ClassOne();
		System.out.println(one.method("Java"));
	}
}
class ClassOne{
	
	public String method(String s) {
		return s;
	}
}