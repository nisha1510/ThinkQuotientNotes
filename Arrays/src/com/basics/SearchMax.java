package com.basics;

import java.util.Arrays;

public class SearchMax {

	public static int findMaxNum(int ar[])
	{
		int max=Integer.MIN_VALUE;
//		int max=ar[0];//or you can make max num the first position i.e.ar[0] 
		for(int i = 0; i < ar.length; i++) {
			if(ar[i] > max)
				max = ar[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,5,6,2,3};
		System.out.println(Arrays.toString(arr));
		System.out.println("Maximum number = "+findMaxNum(arr));

	}

}
