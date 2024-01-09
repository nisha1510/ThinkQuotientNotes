package com.overloadingLab;

public class FindSquare {

	public void square(int n){
		System.out.println("In int");
		System.out.println("Square : "+(n*n));
	}
	public void square(float n){
		System.out.println("In float");
		System.out.println("Square : "+(n*n));
	}
	public void square(double n){
		System.out.println("In double");
		System.out.println("Square : "+(n*n));
	}
	
	public static void main(String[] args) {
		FindSquare sq = new FindSquare();
		sq.square(2);
		sq.square(5f);
		sq.square(3.0);

	}

}
