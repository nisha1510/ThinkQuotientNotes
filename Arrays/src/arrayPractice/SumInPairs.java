package arrayPractice;

public class SumInPairs {

	public static void findsumInPairs(int ar[], int sum) {
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]>sum) 
				continue;
				for (int j = i+1; j < ar.length; j++) {
					if((ar[i]+ar[j])==sum)
						System.out.println("{"+ar[i]+", "+ar[j]+"}");
				
				}
		}
	}
	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4, 5, 6, 7, 8};
		int sum = 8;
		findsumInPairs(arr, sum);
	}

}
