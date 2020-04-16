package pkg1;

public class Superparent 
{
	public Superparent()
	{
		this (1,2,3);
		System.out.println("Parent Defaut constructor");
	}
	
	public Superparent(int a)
	{
		this();
		System.out.println("Parent 1 parameterized constructor");
	}
	
	public Superparent(int a,int b)
	{
		this (1);
		System.out.println("Parent 2 parameterized constructor");
	}
	
	public Superparent(int a,int b,int c)
	{
		
		System.out.println("Parent 3 parameterized constructor");
	}
	

}
