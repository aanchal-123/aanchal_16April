package pkg1;//call the non static method from Static method (in different class)-second class

public class Class5th

{
	public static void main(String[] args) 
	{
		System.out.println("call the non static method from Static method (in different class)");
		System.out.println("One ways only with object creation");
		Class5thApril obj= new Class5thApril();
		obj.method1(); 
		
	}
}
	