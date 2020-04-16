package pkg1;//Method name---same
//Method input---same
//Method output--same

public class ChildDynPoly extends ParentDynPoly
{
	public void arithematic(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Inside Child class "+c);
	}

	public static void main(String[] args) 
	{
		ChildDynPoly m1=new ChildDynPoly();
		m1.arithematic(1, 2);
		System.out.println("Method Exit Parent =Yes and Method Exit Child =Yes, Output is Child Method");
	}
	
	
}
