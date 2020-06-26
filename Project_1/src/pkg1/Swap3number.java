package pkg1;

import java.util.Scanner;

public class Swap3number {

	public static void main(String[] args) {
		
		System.out.println("Enter value for A");
		Scanner s= new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("Enter value for B");
		int b = s.nextInt();
		
		int x = a;
		a = b;
		b = x;
		
		System.out.println("Enter value for A :"+a);
		System.out.println("Enter value for B :"+b);
	}

}
