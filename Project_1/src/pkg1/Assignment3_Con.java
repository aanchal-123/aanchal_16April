package pkg1;

public class Assignment3_Con 
{
	public Assignment3_Con( int a,int b,int c,int d)
	{
		System.out.println("Four parameterized constructor");
	}
	
	public Assignment3_Con()
	{
		this(1,2,3,4);
		System.out.println("Default constructor");
	}
	public Assignment3_Con(int a,int b)
	{
		this();
		System.out.println("Two parameterized constructor");
	}
	public Assignment3_Con(int a)
	{
		this(23,45);
		System.out.println("One parameterized constructor");
		
	}
	public Assignment3_Con(int a,int b,int c)
	{
		this(26);
		System.out.println("Three parameterized constructor");		
	}
	
	public static void main(String[] args) 
	{
		Assignment3_Con a1=new Assignment3_Con(3,4,5);

	}
}
