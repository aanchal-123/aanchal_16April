package pkg1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class April26Classfilehandling 
{
	public void method(int start,int end) throws IOException
	{
		File f=new File("C:\\Users\\Aanchal\\Desktop\\filehandling.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b= new BufferedReader(fr);
		String s;	
		int a=0;
		while((s=b.readLine())!=null)
		{
			a=a+1;
			if (a>=start && a<=end)
			{
				System.out.println(s);				
			}			
		}		
	}
	public static void main(String[] args) throws IOException 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number of line to print");
		 int x1=s.nextInt();
				
		System.out.println("Enter the Second number of line to print2");
		 int x2=s.nextInt();
		 
		 April26Classfilehandling a= new April26Classfilehandling();
		 a.method(x1,x2);		 
	}
}
