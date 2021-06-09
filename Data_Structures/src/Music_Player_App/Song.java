package Music_Player_App;

public class Song {
	String songName;
	String songMovie;
	public Song(String songName, String songMovie) {
		this.songName = songName;
		this.songMovie = songMovie;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSongMovie() {
		return songMovie;
	}
	public void setSongMovie(String songMovie) {
		this.songMovie = songMovie;
	}
	

}
