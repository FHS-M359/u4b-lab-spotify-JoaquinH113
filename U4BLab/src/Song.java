public class Song {
    private String artist, title, genre, album;
    private int duration,year;
    public Song(String Title,String Artist,String Album, int Year, String Genre, int Duration){
        title=Title;
        album=Album;
        year=Year;
        genre=Genre;
        duration=Duration;
        artist=Artist;
    }
    public String toString(){
        String format = "%-30s %-21s %-27s %-5d %11s";
        return String.format(format,title,artist,album,year,genre);
    }
    public int getDuration() {return duration;}
    public int getYear() {return year;}
    public String getAlbum() {return album;}
    public String getArtist() {return artist;}
    public String getGenre() {return genre;}
    public String getTitle() {return title;}
    public void setAlbum(String album) {this.album = album;}
    public void setArtist(String artist) {this.artist = artist;}
    public void setDuration(int duration) {this.duration = duration;}
    public void setGenre(String genre) {this.genre = genre;}
    public void setTitle(String title) {this.title = title;}
    public void setYear(int year) {this.year = year;}
}
