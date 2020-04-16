package pkg1;  //(((((x1+x2)-x3)+x4)*x5)/x5)

import java.util.Scanner;

public class Assignment29_Cls 

{
	public int sum (int a,int b) 
	{
		int c;
		c=a+b;
		return c;
	}	
	public int sub (int x, int y)
	{
		int z;
		z= x-y;
		return z;		
	}	
	public int mult (int d, int e)
	{
		int f;
		f=d*e;
		return f;		
	}
	public void div (int g, int h)	
	{
		int i;
		i=g/h;
		System.out.println(i);	
	}	
	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the vlaue of x1");
		 int x1=s.nextInt();
				
		System.out.println("Enter the vlaue of x2");
		 int x2=s.nextInt();
		 
		System.out.println("Enter the vlaue of x3");
		int x3=s.nextInt();
		
		System.out.println("Enter the vlaue of x4");
		int x4=s.nextInt();
		
		System.out.println("Enter the vlaue of x5");
		int x5=s.nextInt();
		
		Assignment29_Cls obj=new Assignment29_Cls();
		int A=obj.sum(x1,x2);
		int B=obj.sub(A,x3);
		int C=obj.sum(B,x4);
		int D=obj.mult(C,x5);
		obj.div(D,x5);
		s.close();		
	}

}
