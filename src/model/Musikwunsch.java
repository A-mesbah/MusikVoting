package model;

public class Musikwunsch {
    private int songId;
    private String  songtitle ;
    private String  band ;
    private String  genre ;

    public Musikwunsch(String songtitle, String band, String genre) {
        this.songtitle = songtitle;
        this.band = band;
        this.genre = genre;
    }

    public Musikwunsch(int songId, String songtitle, String band, String genre) {
        this.songId = songId;
        this.songtitle = songtitle;
        this.band = band;
        this.genre = genre;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongtitle() {
        return songtitle;
    }

    public void setSongtitle(String songtitle) {
        this.songtitle = songtitle;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
