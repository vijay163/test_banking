package JavaPrac;

import java.util.Comparator;

public class SortByName implements Comparator<Song>
{

	@Override
	public int compare(Song o1, Song o2) {
		return o2.songName.compareTo(o1.songName);
	}

}
