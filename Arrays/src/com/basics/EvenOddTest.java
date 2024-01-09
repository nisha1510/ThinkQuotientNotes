package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter elements");
		
		for (int i = 0; i<arr.length;i++){
			arr[i]=sc.nextInt();
		} 
		System.out.println(Arrays.toString(arr));
		System.out.println("SUm of even "+SumOfNumUserInput.findEvenSum(arr));
		System.out.println("SUm of Odd "+SumOfNumUserInput.findOddSum(arr));

	}

}
