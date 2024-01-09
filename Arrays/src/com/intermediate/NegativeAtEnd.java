package com.intermediate;

import java.util.Arrays;

public class NegativeAtEnd {
	public static void shiftNegAtEnd1(int ar[]) {
		
		int i,j;
		int temp;
		int length=ar.length;
		for (i = 0; i < length; i++) 
		{
			if(ar[i] >= 0)
				continue;
			else
			{
				for(j = length-1; j >= 0 && i<j; j--)
				{
					if(ar[j]>0)
					{
						temp = ar[i];
						ar[i] = ar[j];
						ar[j] = temp;
						break;
					}
				}
			}		
		}
	}
	public static void main(String[] args) {
		int arr[] = {1, -2, 3, -4, 5};
		System.out.println(Arrays.toString(arr));
		
		System.out.println("\nAfter Shifting negative to end");
		shiftNegAtEnd1(arr);
		System.out.println(Arrays.toString(arr));//doesnt maintain order
	}

}


