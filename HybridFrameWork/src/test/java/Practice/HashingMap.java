package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class HashingMap 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The Array::::");
		int size = sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the values::::");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

	ArrayList l = squre(arr);
	System.out.println(l);
	}
   public static ArrayList squre(int[] s)
   {
	   ArrayList al = new ArrayList();
	   for(int i=0;i<s.length;i++)
	   {
		   al.add(s[i]*s[i]*s[i]);
	   }
	return al;
   }
}
