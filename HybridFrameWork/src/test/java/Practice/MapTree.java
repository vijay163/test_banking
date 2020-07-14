package Practice;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class MapTree 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the System:::::");
		int size = sc.nextInt();
		 TreeMap<Integer, String> l = test(size);
		System.out.println(l);
		
	}
	public static TreeMap<Integer,String > test(int size)
	{
		Scanner sc = new Scanner(System.in);
	TreeMap<Integer, String> tm = new TreeMap<Integer,String>();
		int[] key = new int[size];
		String[] value=new String[key.length];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Key And Value::::");
			key[i]=sc.nextInt();
			value[i]=sc.nextLine();
			tm.put(key[i], value[i]);
		}
		return tm;
	}

}
