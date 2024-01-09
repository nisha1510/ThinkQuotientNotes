package com.staticLab;

/*
10101
01010
10101
01010
10101
---------------
1
1#
1#1
1#1#
1#1#1
*/
public class Pattern {

	public static void print() {
		boolean flag = true;
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 5; j++) 
			{
				if(flag)
				{
					System.out.print("1");	
					flag=false;
				}
				else
				{
					System.out.print("0");
					flag=true;
				}
			}
			System.out.println();			
		}
	}
	
	public static void print1() {
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= i; j++) 
			{
				if(j%2!=0)
				{
					System.out.print(1);
				}
				else
				{
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		print();
		System.out.println("---------------");
		print1();

	}

}
