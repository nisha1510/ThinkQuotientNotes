package com.abstractLab;

import java.util.Scanner;

public class Pattern {
	
	public static void printPattern(int rows) {
		for(int i = rows; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row = sc.nextInt();
		printPattern(row);

	}

}
/*
12345
1234
123
12
1
*/