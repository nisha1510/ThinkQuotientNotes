package arrayPractice;

public class DuplicatesInArray {
	public static void findDuplicates ( int ar[] ) 
	{
		int count = 0;
		for(int i = 0;  i < ar.length ;  i++) 
		{
			count=0;
			if(ar[i] != 0) {
				for(int j = i+1;  j < ar.length;  j++) 
				{
					if( ar[i] == ar[j]) 
					{	
						count++;
						ar[j] = 0;
					}
				}
				if(count > 0)
					System.out.print(ar[i]+" ");
			}
		}
	}
	
public static void main(String [] args) {
	int arr[] = {1,2,3,2,4,5,2,1,1};
	findDuplicates(arr);
}
}