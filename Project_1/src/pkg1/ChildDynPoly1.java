package pkg1;//Method name---same
//Method input---same
//Method output--same

public class ChildDynPoly1 extends ParentDynPoly

{
	
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		return c;	
	}
	public static void main(String[] args) 
	{
		ChildDynPoly1 m1=new ChildDynPoly1();
	     m1.arithematic(1, 2);
		System.out.println("Method Exit Parent =Yes and Method Exit Child =NO, Output is Parent Method");
	}


}
