package pkg1;

public class Assignment29_Meth 
{
	public void method()
	{
		System.out.println("default method");
	}
	
	public void method1(int a)
	{
		System.out.println("1 parameterized method");
	}
	public void method2(int a,int b)
	{
		System.out.println("2 parameterized method");
	}
	public void method3(int a,int b,int c)
	{
		System.out.println("3 parameterized method");
	}
	
	public void method4(int a,int b,int c,int d)
	{
		System.out.println("4 parameterized method");
		this.method();
		this.method1(1);
		this.method3(a, b, c);
		this.method2(a, b);	
	}
	
	public static void main(String[] args) 
	{
		Assignment29_Meth aanchal=new Assignment29_Meth();
		aanchal.method4(1,2,3,4);
		
	}
	

}
