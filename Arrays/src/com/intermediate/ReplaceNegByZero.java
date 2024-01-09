package com.intermediate;

import java.util.Arrays;

public class ReplaceNegByZero {

	public static void replace(int ar[])
	{
		for(int i = 0; i < ar.length; i++) {
			if(ar[i] < 0) {
				ar[i] = 0;
			}
		}	
		System.out.println("After replacing negative Number by Zero \n"+Arrays.toString(ar));
	}
	
	public static void main(String[] args) {
		int arr[] = {2, 3, -4, 1, 9, -7};
		System.out.println(Arrays.toString(arr));
//		for(int x : arr)
//		{
//			System.out.print(x+"  ");
//		}
		replace(arr);
		

	}

}
