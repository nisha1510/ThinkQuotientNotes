package com.intermediate;

import java.util.Arrays;

//int arr[] = {1, 2, 3, 4, 5, 6, 7, 8}
//sum = 8
//{1, 7}, {2,6}...
public class SumPairs {

	public static void findPairs(int ar[], int sum) {
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]>sum) 
				continue;
				for (int j = i+1; j < ar.length; j++) {
					if((ar[i]+ar[j])==sum)
						System.out.println("{"+ar[i]+", "+ar[j]+"}");
				
			}
		}
	}
	
	public static void main(String[] args) {
	
		int arr[]= {1, 2, 3, 4, 5, 6, 7, 8};
		int addition = 8;
		System.out.println(Arrays.toString(arr));
		
		
		System.out.println("Sum is "+addition);
		System.out.println("Pairs are : ");
		findPairs(arr, addition);
		
	}

}
