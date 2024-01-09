package com.twoDArray;

public class AddMatrix {

	static int[][] add(int a1[][], int a2[][]){
		int rows = a1.length;
		int cols = a1[0].length;
		int matrix[][] = new int[rows][cols];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = a1[i][j] + a2[i][j];
			}
		}
		return matrix;
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
		
		int m1[][] = {{1,2},{3,4}};
		int m2[][] = {{1,2},{3,4}};
		display(m1);
		display(m2);
		
		int result[][] = add(m1, m2);
		System.out.println("Addition of above matrix");
		display(result);
	}

}
