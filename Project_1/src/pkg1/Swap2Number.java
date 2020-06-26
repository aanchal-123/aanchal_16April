package pkg1;

import java.util.Scanner;

public class Swap2Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number A: ");//2
		int a = s.nextInt();		
		System.out.println("Enter number B :");//3
		int b = s.nextInt();
		
		a = a+b;//2+3=5
		b = a-b;//5-3=2
		a = a-b;//5-2=3
		
		System.out.println("Enter value for A :"+a);
		System.out.println("Enter value for B :"+b);
	}

}
