package pkg1;//call the static method from Static method (within same class)"

public class Class5thstatic 
{
	public static void method1()
	{
	
		System.out.println("static method");
	}

	public static void main(String[] args) 
	{
		System.out.println("call the static method from Static method (within same class)");
		System.out.println("1st way static method");
		method1(); //Direct call
		System.out.println("2nd way static method");
		Class5thstatic.method1();//2nd way
		System.out.println("3rd way static method");
		Class5thstatic obj=new Class5thstatic();//Third way
		obj.method1();
	}

}
