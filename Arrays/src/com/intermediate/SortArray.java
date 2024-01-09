package com.intermediate;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void sortArrarAsc(int ar[]) {
		
		int temp;
		for(int i = 0; i < ar.length; i++) {
			for(int j = i+1; j < ar.length; j++) {
				if(ar[i] > ar[j])//asending
				{
					//swap
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
	}
	
	public static void sortArrayDesc(int ar[]) {
		
		int temp;
		for(int i = 0; i < ar.length; i++) {
			for(int j = i+1; j < ar.length; j++) {
				if(ar[i] < ar[j])//descending
				{
					//swap
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of array");
//		int size = sc.nextInt();
//		int arr[] = new int[size];
//		System.out.println("Enter elements in an array");
//		for (int i = 0; i<arr.length;i++){
//			arr[i]=sc.nextInt();
//		} 
//		System.out.println(Arrays.toString(arr));
	
		
		int arr[] = {2, 3, 6, 1, 4, 8, 5};
		System.out.println(Arrays.toString(arr));
		
		System.out.println("After Sorting Arrays in Ascending Order");
		sortArrarAsc(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("After Sorting Arrays in Descending Order");
		sortArrayDesc(arr);
		System.out.println(Arrays.toString(arr));
	}

}
