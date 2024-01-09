package arrayPractice;

public class Freq {
	
	public static void calFreq(int ar[]) {
		
		int count;
		boolean status;
	
		for(int i = 0; i < ar.length; i++) 
		{
			count=1;
			status=false;
			
			for(int j = i-1; j >= 0; j--) 
			{
				if(ar[i]==ar[j])
				{
					status=true;
					break;
				}
			}
		
			if(status==false)
			{
				for(int k = i+1; k < ar.length; k++)
				{
					if(ar[i]==ar[k])
						count++;
				}
				System.out.println(ar[i]+" ---> "+count);
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {2,3,4,2,3,4};
		calFreq(arr);
	}

}
