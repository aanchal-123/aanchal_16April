package pkg1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = s.nextInt();
		int remainder, sum=0, originalNum=num;
		
		while(num >0)
		{
			remainder= num%10;			
			num = num/10;
			sum = (sum*10)+remainder;
		}
		
		if(originalNum==sum && originalNum >10)
		
		{
			System.out.println(originalNum+" is a Palindrome");
		}
		else
		{
			System.out.println(originalNum+" is not a Palindrome");
		}

	}

}
