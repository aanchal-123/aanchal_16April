package pkg1;//Parent 3 parameterized method
//Parent Defaut method
//Parent 1 parameterized method
//Parent 2 parameterized method
//Child 4 parameterized method
//Child Defaut method
//Child 1 parameterized method
//Child 2 parameterized method
public class Childmethod extends Parentmethod

{
	public void method4()
	{
		System.out.println("Child default method");
	}	
	public void method5(int a)
	{
		System.out.println("Child 1 parameterized method");
	}
	public void method6(int a,int b)
	{
		System.out.println("Child 2 parameterized method");
	}
	
	public void method7(int a,int b,int c)
	{
		super.method3(4, 8, 7);
		super.method();
		super.method1(6);
		super.method2(5, 2);
		System.out.println("Child 4 parameterized method");
		this.method4();
		this.method5(6);
		this.method6(5,7);
	}

	public static void main(String[] args) 
	{
		Childmethod a1=new Childmethod();
		a1.method7(1, 2, 3);
		
	}
}
