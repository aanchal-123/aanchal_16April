package pkg1;

public class ClassloopC 
{
	public static void main(String[] args) 
	{
		int x=0;
		for (int i=1;i<=4;i++)
		{
			for (int j=1;j<=i;j++)
			{
				x=x+1;
				System.out.print(+x+" ");	
			}
			System.out.println();
		}

	}

}
