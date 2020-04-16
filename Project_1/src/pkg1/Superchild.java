package pkg1; //Parent 3 parameterized constructor
//Parent Defaut constructor
//Parent 1 parameterized constructor
//Parent 2 parameterized constructor
//Child 3 parameterized constructor
//Child Defaut constructor
//Child 1 parameterized constructor
//Child 4 parameterized constructor
//Child 2 parameterized constructor

public class Superchild extends Superparent
{
	public Superchild()
	{
		this (1,2,3);
		System.out.println("Child Defaut constructor");
	}	
	public Superchild(int a)
	{
		this ();
		System.out.println("Child 1 parameterized constructor");
	}	
	public Superchild(int a,int b)
	{
		this(1,2,3,4);
		System.out.println("Child 2 parameterized constructor");
	}	
	public Superchild(int a,int b,int c)
	{
		super (1,2);
		System.out.println("Child 3 parameterized constructor");
	}	
	public Superchild(int a,int b,int c,int d)
	{
		this (1);
		System.out.println("Child 4 parameterized constructor");
	}
	
	public static void main(String[] args) 
	{
		Superchild m1=new Superchild(2,3);				
	}
}
