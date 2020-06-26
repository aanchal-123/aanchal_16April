package pkg1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter number ");
		int num = s.nextInt();
		int x=1;
		for(int i=1; i<=num;i++)
		{
			x=x*i;
		}
		
		System.out.println("Factorial of given number is "+x);

	}

}
