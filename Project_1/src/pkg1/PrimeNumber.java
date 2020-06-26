package pkg1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number to check :");
		int num = s.nextInt();
		int a = 0;
		
		for(int i=2; i<=num/2;i++) 
		{			
			if(num%i == 0) 
			{
				a= 1;
			}	
		}
		if(a==1) 
		{
			System.out.println("No, "+num+" is not a prime number.");
		}
		else
		{
			System.out.println("Yes, "+num+" is a prime number.");
		}
}}
