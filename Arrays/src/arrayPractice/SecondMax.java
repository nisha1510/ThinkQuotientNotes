package arrayPractice;

public class SecondMax {

	public static void main(String[] args) {
		int arr[] = {20,  31, 45, 100, 1, 105, 90};

		int firstMax = arr[0];
		int secondMax = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > firstMax) 
			{
				secondMax = firstMax;
				firstMax = arr[i];
			}
			else if(arr[i] > secondMax && arr[i] != firstMax )
			{
				secondMax = arr[i];
			}
		}
		System.out.println("FirstMax " +firstMax);
		System.out.println("SecondMax "+secondMax);
	}

}
