package com.intermediate;

import java.util.Arrays;

public class ZerosAtEnd {
	
	public static void shiftZeros(int ar[]) {
	
		int position = 0;
		for(int i = 0; i < ar.length; i++) 
		{
			if(ar[i]!=0) 
			{
				ar[position] = ar[i];
				position++;
			}
		}
		while(position < ar.length) 
		{
			ar[position] = 0;
			position++;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {2, 3, 0,  7, 0, 5, 0, 4};
		System.out.println(Arrays.toString(arr));
		
		System.out.println("\nAfter Shifting zeros to end");
		shiftZeros(arr);
		System.out.println(Arrays.toString(arr));
	}

}
