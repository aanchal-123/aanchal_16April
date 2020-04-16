package pkg1;//call the non static method from Static method (in different class)-main class

public class Class5thApril 
{
	 int aanchal=100;
	public  void method1()
	{
		aanchal=aanchal+1;
		System.out.println("Non static method");
		
	}

	//public static void main(String[] args) 
	{
		//aanchal=aanchal+1;
		//System.out.println("static main method");
		//System.out.println("static main  love "+aanchal);
		//Class5thApril.method1();//1st way
		//Class5thApril obj=new Class5thApril ();// 2nd way
		//obj.method1();
	}

}
