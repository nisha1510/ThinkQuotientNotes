package com.twoDArray;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[2][3];
		System.out.println("Enter elements");
		//for rows
		for (int i = 0; i < 2; i++) {
			//for column in each row
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("============");
		
		for (int i = 0; i < 2; i++) {
			for(int j : arr[i]) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//Implicit array
		
		System.out.println("=================");
		int ar[][] = {{1,2,3},{4,5,6},{7,8,9}};//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
		for (int i = 0; i < ar.length; i++) {
			for(int j : arr[i]) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
