package pkg1;

public class Student 
{
	int age;
	int roll_no;
	
    public void Deepak ()
    {
    	System.out.println("Welcome to all of you");
    	System.out.println("Welcome guys");
    }

    public static void main(String[] args) 
    {
    	Student mithu=new Student();
    	mithu.Deepak();
    	mithu.age=22;
    	mithu.roll_no=586;
    	System.out.println("Age is "+mithu.age);
    	System.out.println("Roll No "+mithu.roll_no);
		
	}
}
