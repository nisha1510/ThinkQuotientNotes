package arrayPractice;

public class UniqueElements {

	public static boolean findUnique(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			boolean isUnique = true;
			for (int j = 0; j < ar.length; j++) {
				if(ar[i]==ar[j])
					isUnique = false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,1,2};

	}

}
