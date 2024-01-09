package com.overloadingLab;

import java.util.Scanner;

public class Pattern {

//	public static void pattern1() {
//		char ch1 = 'A';
//		for(int i = 1; i <= 5; i++) 
//		{
//			for (int j = 1; j <= i ; j++) 
//			{
//				System.out.print(ch1);
//				ch1++;
//			}
//			System.out.println();
//		}
//	}
	
	public static void pattern2(int rows) {
		for(int i = 1; i <= rows; i++) 
		{
			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
		}
		
	}
	public static void main(String[] args) {
//		pattern1();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows");
		int rows = sc.nextInt();
		pattern2(rows);
	

	}

}
