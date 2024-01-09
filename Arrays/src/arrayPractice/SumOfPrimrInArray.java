package arrayPractice;

public class SumOfPrimrInArray {
	public static Boolean checkPrime(int num){
		if(num == 0 || num ==1)
			return false;
		else {
			for(int i=2; i<num; i++) {
				if(num%2==0)
					return false;
			}
		}
		return true;
	}
	public static void main(String [] args) {
		int arr[] = {2, 3, 5, 12, 17, 19};
		
		System.out.println("Prime numbers : ");
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			if(checkPrime(arr[i])){
				System.out.print(arr[i]+" ");
				sum = sum + arr[i];
			}
		}
		System.out.println("\nSum of prime numbers" +sum);
	}
}