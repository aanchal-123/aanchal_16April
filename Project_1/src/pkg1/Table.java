package pkg1;

import java.util.Scanner;

public class Table 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter number ");
		int num = s.nextInt();
		int x=num;
		System.out.println("Table of :"+num);
		for(int i=1; i<=10;i++)
		{
			x=num*i;
			
			System.out.println(num+" X "+i+" = "+x);

		}
	
		

	}

}
