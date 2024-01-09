package com.basics;

import java.util.Arrays;

public class ProductArray {

	public static long findProd(int ar[]) {
		long prod = 1;
		for (int i = 0; i<ar.length;i++){
			prod = prod*ar[i];
		}
		return prod;
	}
	public static void main(String[] args) {
		
		int arr[]= {2,3,4,5};
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Product is "+findProd(arr));

	}

}
