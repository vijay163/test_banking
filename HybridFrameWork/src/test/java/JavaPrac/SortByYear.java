package JavaPrac;

import java.util.Comparator;

public class SortByYear implements Comparator<Song>
{

	@Override
	public int compare(Song o1, Song o2) 
	{
 if(o1.yor>o2.yor)
	return 1;
else if(o1.yor<o2.yor)
	return -1;
else
		return 0;
	}

}
