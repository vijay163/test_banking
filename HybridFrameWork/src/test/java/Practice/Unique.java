package Practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Unique 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Arrays:::");
		int size = sc.nextInt();
		String[] s=new String[size];
		System.out.println("Enter the Values");
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.nextLine();
		}
        HashSet<String> ts = new HashSet<String>();
		ts.add(s[0]);
		ts.add(s[1]);
		ts.add(s[2]);
        ts.add(s[3]);
		System.out.println(ts);
	}

}
