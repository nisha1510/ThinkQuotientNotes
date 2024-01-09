package arrayPractice;

import java.util.Arrays;

public class AlternateMerge {
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
	public static void main(String[] args) {
		int arr1[] = {2,4,5,6,7};
		int arr2[] = {1,3,8,9,10};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	
		System.out.println("\nAfter Alternate Merge");
		System.out.println(Arrays.toString(alternateMerge(arr1, arr2)));

	}

}
