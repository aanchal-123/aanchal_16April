package pkg1;//call the non static method from Static method (within same class)
//call the non static method from Static method (in different class)
//call the static method from another Static method (within same class)--3 ways
//call the static method from another Static method (in different class)--2 ways

public class ClassA 

{
	public void method1()
	{
		System.out.println("Non static method");
		method2();//Direct CAll
		ClassA.method2();//Call through class name
		ClassA obj = new ClassA();
		obj.method2();
	}

	public static void method2()
	{

		System.out.println("static method");
		
	}
	
	//public static void main(String[] args) 
	//{
	//	System.out.println("static main  method");
	//	System.out.println("call the non static method from Static method (within same class)");
	//	ClassA obj=new ClassA ();
	//	obj.method1();
	//}
	
	
	public static void main(String[] args) 
	
	{
		ClassA obj = new ClassA();
		obj.method1();
			
	}
}
