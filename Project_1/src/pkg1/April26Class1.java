package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class April26Class1 
{
	public void method(int start) throws IOException
	{
		File f=new File("C:\\Users\\Aanchal\\Desktop\\filehandling.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b= new BufferedReader(fr);
		String s;	
		int a=0;
		while((s=b.readLine())!=null)
		{
			a=a+1;
			if (a==start)
			{
				System.out.println(s);			
			}			
		}		
	}
	public static void main(String[] args) throws IOException 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the any number of line to print");
		 int x1=s.nextInt();
		 
		 April26Class1 a= new April26Class1();
		 a.method(x1);		 
	}
}
