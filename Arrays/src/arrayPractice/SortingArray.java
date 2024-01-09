package arrayPractice;

import java.util.Arrays;

public class SortingArray {
	public static void sortArray(int ar[]) {
		int temp;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]>ar[j]) {//Asending
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
	}
	public static void sortArrayDesc(int ar[]) {
		int temp;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]<ar[j]) {//Desc
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {8,5,1,2,4,6,3,7};
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		sortArray(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		sortArrayDesc(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
