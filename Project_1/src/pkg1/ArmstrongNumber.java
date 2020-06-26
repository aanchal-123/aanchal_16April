package pkg1;
import java.util.Scanner;
public class ArmstrongNumber 
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = s.nextInt();
		int sum=0, originalNum=num;
		int length=0;
		int originalNum2 = num;
		//Find Length
		while(num >0)
		{	
			num = num/10;//div the number 
			length++;
		}
		//Calculations
		while(originalNum2 >0)
		{
			int remainder = originalNum2%10;
			int multiply=1;
			
			for(int i =1;i<=length;i++) 
			{
				multiply = multiply*remainder;
			}
			
			sum = sum + multiply;
			originalNum2 = originalNum2/10;
		}
			
		if(originalNum==sum)
		{
			System.out.println(originalNum+" is a ArmstrongNumber");
		}
		else
		{
			System.out.println(originalNum+" is not a ArmstrongNumber");
		}

	}

}
