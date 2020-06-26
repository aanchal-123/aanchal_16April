package pkg1;

public class ClassloopB 
{

	public static void main(String[] args) 
	{
		int x;
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				x=0+j;
				System.out.print(+x);
			}
			System.out.println();
		}

	}

}
