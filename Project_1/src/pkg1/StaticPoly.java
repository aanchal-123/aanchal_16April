package pkg1;//Method name---same
//Method input---can't same
//Method output--can be same or can't be same

public class StaticPoly 
{

	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		return c;	
	}
	
	public void sum(int a,float b)
	{
		float c;
		c=a+b;
		System.out.println("Output 2nd method= "+c);	
	}
	
	public void sum(int a,float b,int c)
	{
		float d;
		d=a+b+c;
		System.out.println("Output 3rd method="+d);	
	}
	
	public static void main(String[] args) 
	{
		StaticPoly m1=new StaticPoly();
		int sum=m1.sum(1, 2);
		System.out.println("Output first method ="+sum);
		m1.sum(1, 12.3F);
		m1.sum(1, 10.5F,1);
		
	}
	
	
	
}
