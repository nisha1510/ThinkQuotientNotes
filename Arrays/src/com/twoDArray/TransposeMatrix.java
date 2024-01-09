package com.twoDArray;

public class TransposeMatrix {

	static int[][] findTranspose(int a1[][]){
		
//		int rows = a1.length;
//		int cols = a1[0].length;
		
		int cols = a1.length;//number of rows of a1
		int rows = a1[0].length;//number of cols of a1
		
//		int tarr[][] = new int[cols][rows];
		int tarr[][] = new int[rows][cols];
		
//		for (int i = 0; i < cols; i++) {
//			for (int j = 0; j < rows; j++) {
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {

				tarr[i][j] = a1[j][i];
			}
		}
		return tarr;
	}
	
	static void display(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for(int j : a[i]) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}
	
	
	public static void main(String[] args) {
		int m1[][] = {{1,2,3},{4,5,6}};
		
		display(m1);
		int result[][] = findTranspose(m1);	
		display(result);

	}

}
