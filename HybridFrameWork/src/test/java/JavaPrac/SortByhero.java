package JavaPrac;

import java.util.Comparator;

public class SortByhero implements Comparator<Song>
{

	@Override
	public int compare(Song o1, Song o2)
	{
		return o1.hero.compareTo(o2.hero);
	}
	

}
