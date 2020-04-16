package pkg1;

public class ChlidDynPoly2 extends ParentDynPoly

{
	
	public void arithematic(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Inside Child class "+c);
	}
	public static void main(String[] args) 
	{
		 ChlidDynPoly2 m1=new  ChlidDynPoly2();
	     m1.arithematic(1, 2);
		System.out.println("Method Exit Parent =NO and Method Exit Child =Yes, Output is Child Method");
	}


}


