package com.abstractLab;

public class Pattern2 {
	
	public static void printPattern() {
		int rows = 5;
		for(int i = rows; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		printPattern();

	}

}
/*
12345
1234
123
12
1
*/