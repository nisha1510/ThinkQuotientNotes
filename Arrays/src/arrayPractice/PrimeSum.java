package arrayPractice;

import java.util.Arrays;

public class PrimeSum {
	public static boolean checkPrime(int n) {
		if(n==0 || n == 1)
			return false;
		else
		{
			for(int i=2; i < n; i++) {
				if(n%2==0)
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(arr));

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(checkPrime(arr[i]))
			{
				sum = sum+arr[i];
			}
		}
		System.out.println("Sum of prime numbers "+sum);
	}

}
