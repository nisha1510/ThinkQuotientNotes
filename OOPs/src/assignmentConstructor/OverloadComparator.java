package assignmentConstructor;

public class OverloadComparator {

	public void compare(int a, int b) {
		if(a > b)
		{
			System.out.println("Greater number is "+a);
		}
		else if(b > a)
		{
			System.out.println("Greater number is "+b);
		}
		else
		{
			System.out.println("Both are equal ");
		}
	}
	
	public void compare(char a, char b) {//65,90
		if(a > b)
		{
			System.out.println("Greater numberic value is of : "+a);
		}
		else if(b > a)
		{
			System.out.println("Greater numberic value is of : "+b);
		}
		else
		{
			System.out.println("Both are equal ");
		}
	}
	public static void main(String[] args) {
		 
		OverloadComparator obj = new OverloadComparator();
		obj.compare(5, 10);
		obj.compare('a', 'z');

	}

}
