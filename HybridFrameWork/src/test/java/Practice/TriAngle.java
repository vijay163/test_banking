package Practice;

public class TriAngle 
{
	public static void main(String[] args)
	{
		int k,n=10 ;
		for(int i=1;i<=n;i++)
		{
			k=i;
			for(int j=0;j<i;j++)
			{
				System.out.print(k+" ");
				k=k+n-j;
			}
			System.out.println();
			
		}
		
	}

}
