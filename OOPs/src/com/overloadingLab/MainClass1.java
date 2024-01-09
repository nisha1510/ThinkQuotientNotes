package com.overloadingLab;

public class MainClass1 {

	double overloadedMethod(double d) {
		return d*=d;
	}
	int overloadedMethod(int i) {
		return overloadedMethod(i*=i);
	}
	float overloadedMethod(float f) {
		return overloadedMethod(f*=f);
	}
	
	public static void main(String[] args) {
	
		MainClass1 obj1 = new MainClass1();
		System.out.println(obj1.overloadedMethod(100));

	}

}
