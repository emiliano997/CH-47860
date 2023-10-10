package edu.coderhouse.entity;

public class SongEntity {

    private Long id;

    private String title;

    private int duration;

    private String album;

    private int artistId;

    public SongEntity() {
    }

    public SongEntity(Long id, String title, int duration, String album, int artistId) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.album = album;
        this.artistId = artistId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

}
