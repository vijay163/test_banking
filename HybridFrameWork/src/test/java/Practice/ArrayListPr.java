package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPr
{
	public static void main(String[] args) 
	{
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:::");
		int ln = sc.nextInt();
		String[] k=new String[ln];
		String[] l=new String[k.length];
		System.out.println("Enter the Strings:::::");
		for(int i=0;i<=k.length;i++)
		{
			 l[i] = sc.nextLine();
		}
		*/String[] l= {"macha","hi","how","are","you"};
		ArrayList<String> al = new ArrayList<String>();
	    al.add("hello");
	    al.add(l[3]);
	    al.add(l[2]);
//	    al.add(l[4]);
	    al.add(4,l[0] );
	   System.out.println(al);
	   ArrayList<String> al1 = new ArrayList();
	   al1.add("bye");
	   al1.addAll(al);
	   System.out.println(al1);
	   al1.remove(2);
	   al1.remove(0);
	   System.out.println(al1);
	   
	    
	}

}
