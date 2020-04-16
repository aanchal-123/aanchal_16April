package pkg1;

public class Assignment2_Cal 
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
		Assignment2_Cal obj=new Assignment2_Cal();
		int A=obj.sum(10,2);
		int B=obj.sub(A,2);
		int C=obj.sum(B,2);
		int D=obj.mult(C,2);
		obj.div(D,2);
		
	}
}
