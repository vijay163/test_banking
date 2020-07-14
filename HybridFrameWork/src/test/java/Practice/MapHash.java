package Practice;

import java.util.HashMap;
import java.util.Scanner;

public class MapHash 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the System:::::");
		int size = sc.nextInt();
		HashMap<Integer, String> l = test(size);
		System.out.println(l);
		
	}
	public static HashMap<Integer,String > test(int size)
	{
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		int[] key = new int[size];
		String[] value=new String[key.length];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Key And Value::::");
			key[i]=sc.nextInt();
			value[i]=sc.nextLine();
			hm.put(key[i], value[i]);
		}
		return hm;
	}

}
