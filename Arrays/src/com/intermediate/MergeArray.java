package com.intermediate;
/*
[1, 2, 3, 4, 5, 6]
[11, 12, 13, 14]
After Merging Two Arrays
[1, 2, 3, 4, 5, 6, 11, 12, 13, 14]
Alternate Merge : 
[1, 11, 2, 12, 3, 13, 4, 14, 5, 6]
Alternate Skip Merge : 
[1, 12, 3, 14, 5, 6]
*/
import java.util.Arrays;

public class MergeArray {

	public static int[] completeMerge(int ar1[], int ar2[]) {
		
		int merge[] = new int[ar1.length+ar2.length];
		
		int index = 0;
		for (int i = 0; i < ar1.length; i++) {
			merge[index++]=ar1[i];
		}
		for (int i = 0; i < ar2.length; i++) {
			merge[index++]=ar2[i];
		}
		return merge;
	}
	
	public static int[] alternateMerge(int ar1[], int ar2[]) {
		
		int merge[] = new int[ar1.length+ar2.length];
		
		int index = 0;
		int maxLength = Math.max(ar1.length, ar2.length);
		for (int i = 0; i < maxLength; i++) {
			if(i < ar1.length) {
				merge[index++] = ar1[i];
			}
			if(i < ar2.length) {
				merge[index++] = ar2[i];
			}
		}
		return merge;
	}
	
	public static int[] alternateSkipMerge(int ar1[], int ar2[]) {
		
		int maxLength = Math.max(ar1.length, ar2.length);
		int merge[] = new int[maxLength];
		
		int index = 0;
		int i = 0;
		while(index < maxLength)
		{
			if(i < ar1.length)
			{
				merge[index++] = ar1[i];
				i++;
			}
			if(i < ar2.length)
			{
				merge[index++] = ar2[i];
				i++;
			}
		}
		return merge;
	}
	
	public static void main(String[] args) {
		
		int arr1[] = {1, 2, 3, 4, 5, 6};
		int arr2[] = {11,12,13,14};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		System.out.println("After Merging Two Arrays");
		System.out.println(Arrays.toString(completeMerge(arr1, arr2)));
		
		System.out.println("Alternate Merge : ");
		System.out.println(Arrays.toString(alternateMerge(arr1, arr2)));
	
		System.out.println("Alternate Skip Merge : ");
		System.out.println(Arrays.toString(alternateSkipMerge(arr1, arr2)));
	}

}
