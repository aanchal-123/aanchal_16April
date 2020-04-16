package pkg1;//call the static method from another Static method (in different class)--2 ways

public class Classstatic 
{
	public static void main(String[] args) 
	
	{
		System.out.println("1st way static method");
		ClassStatic1.method1 ();
		System.out.println("2nd way static method");
		ClassStatic1 m1 =new ClassStatic1();
		m1.method1();	
		System.out.println("call the static method from another Static method (in different class)--2 ways");

	}

}
