package JavaPrac;

import java.util.TreeSet;

public class Album
{
	public static void main(String[] args) 
	{
		Song s = new Song(1994,"punyabumi" ,"MajorchandraKanth","sr.NTR",5.2);
		Song s1 = new Song(1990,"luxpapa" ,"NaraSimhanaidu","BAlayya",4.2);
		Song s2 = new Song(1996,"pachagadi" ,"Simhadri","NTR",4.8);
		Song s3= new Song(1999,"Vinaranaruda" ,"potullurivirabramhamCharitam ","SR.NTR",5.0);
		TreeSet<Song> t1 = new TreeSet<Song>();
		t1.add(s);
		t1.add(s1);
		t1.add(s2);
		t1.add(s3);
		System.out.println("Sort By Song Duration:::"+t1);
		System.out.println("*****************************");
	TreeSet<Song> t2 = new TreeSet<Song>(new SortByName());
	t2.add(s);
	t2.add(s1);
	t2.add(s2);
	t2.add(s3);
	System.out.println("Sort By Song Name::::"+t2);
	System.out.println("*******************************");
	TreeSet<Song> t3 = new TreeSet<Song>(new SortByMovie());
	t3.add(s);
	t3.add(s1);
	t3.add(s2);
	t3.add(s3);
	System.out.println("Sort By Movie Name::::"+t3);
	TreeSet<Song> t4 = new TreeSet<Song>(new SortByhero());
	t4.add(s);
	t4.add(s1);
	t4.add(s2);
	t4.add(s3);
	System.out.println("Sort By Hero Name::::"+t4);
	
	}

}
