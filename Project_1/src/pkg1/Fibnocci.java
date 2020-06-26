package pkg1;

public class Fibnocci {

	public static void main(String[] args) 
	{
		
		int a=-1;
		int b=1;
		int sum=0;
		
        while(sum<34)
        {		
        	sum = a+b;
        	a=b;
    		b=sum;
    		System.out.print(sum +" ");
    		
        }
        

	}

}
