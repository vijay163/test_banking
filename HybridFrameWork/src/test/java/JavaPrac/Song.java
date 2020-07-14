package JavaPrac;

public class Song implements Comparable<Song>
{
	int yor;
	String songName;
	String movie;
	String hero;
	double duration;
	public Song(int yor, String songName, String movie, String hero, double duration) {
		super();
		this.yor = yor;
		this.songName = songName;
		this.movie = movie;
		this.hero = hero;
		this.duration = duration;
	}
	@Override
	public int compareTo(Song o) {
		if(this.duration>o.duration)
			return 1;
		else if(this.duration<o.duration)
			return -1;
		else return 0;
	}
	@Override
	public String toString() {
		return "Song [yor=" + yor + ", songName=" + songName + ", movie=" + movie + ", hero=" + hero + ", duration="
				+ duration + "]";
	}
	

}
