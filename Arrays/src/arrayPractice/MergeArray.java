package arrayPractice;

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
	public static void main(String[] args) {
		int arr1[] = {2,4,5,6,7};
		int arr2[] = {1,3,8,9,10};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	
		System.out.println("\nAfter Merging Two Arrays");
		System.out.println(Arrays.toString(completeMerge(arr1, arr2)));
		
	}

}
