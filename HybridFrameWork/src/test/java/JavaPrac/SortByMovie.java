package JavaPrac;

import java.util.Comparator;

public class SortByMovie implements Comparator<Song>
{

	@Override
	public int compare(Song o1, Song o2) {
		return o1.movie.compareTo(o2.movie);
	}
	

}
