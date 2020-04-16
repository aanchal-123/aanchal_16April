package pkg1;
//Provide the body to abstract method of StateAbstract class

public class DisticAbs extends StateAbstract 
{
	public void xyz()
	{
		System.out.println("body given bychild ");
	}
	
	public void aanchal()
	{
		System.out.println("body given bychild ");
	}
	
	public static void main(String[] args) 
	{
		DisticAbs m1=new  DisticAbs();
	    m1.xyz();
	    m1.aanchal();
	    m1.abc();
	}				 
}
