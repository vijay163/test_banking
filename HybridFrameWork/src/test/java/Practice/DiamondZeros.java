package Practice;

public class DiamondZeros
{
	public static void main(String[] args)
	{
		int n=8,k=1,s=n/2;
		for(int i=0;i<=n;i++)
		{
			int l=1;
			for(int j=0;j<=s;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<k;j++)
			{
				System.out.print(l%2);
				l++;
				
			}
			System.out.println();
		    if(i<4)
		    {
		    	k=k+2;
		    	s--;
		    }
		    else
		    {
		    	k=k-2;
		    	s++;
		    }
		}
		

		
	}

}
