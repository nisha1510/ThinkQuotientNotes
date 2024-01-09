package com.staticdemo;

public class Bakery {

	public static void main(String[] args) {
		Cake c1 = new Cake("Butterscotch",450);
		Cake c2 = new Cake("Truffle",450);
		Cake c3 = new Cake("Butterscotch",450);

		System.out.println("Types of cakes "+Cake.totalcount);
	}

}
