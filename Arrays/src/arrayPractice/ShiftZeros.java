package arrayPractice;

import java.util.Arrays;

public class ShiftZeros {
	public static void shiftZerosAtEnd(int ar[]) {
		int pos = 0;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] != 0) {
				ar[pos] = ar[i];
				pos++;
			}
		}
		while(pos < ar.length) {
			ar[pos]=0;
			pos++;
		}
	}
	public static void main(String[] args) {
		int arr[] = {0,1,2,0,3,4};
		System.out.println(Arrays.toString(arr));
		
		shiftZerosAtEnd(arr);
		System.out.println(Arrays.toString(arr));
		

	}

}
