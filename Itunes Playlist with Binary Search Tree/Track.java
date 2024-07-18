// Surname:     Nhlapo
// Name:        Nkululeko
// Student no.: 4129962
// Course:      CSC211 
// Year:        2023 
// Assignment:  Practical 1 Term 2
// File: Track

public class Track {
    /* attributes */
    private String id; // track ID
    private String title; // track title
    private String artist; // artist name
    private String album; // album title
    private int minutes; // minute component of track length
    private int seconds; // seconds component of track length
    private Track left; // left child
    private Track right; // right child

    
    public Track() {} //Default constructor for the Track class.

    //Constructor for the Track class that initializes all attributes.
    public Track(String id, String title, String artist, String album, int minutes, int seconds) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.minutes = minutes;
        this.seconds = seconds;
        this.left = null;
        this.right = null;
    }
    
    //getters
    public String getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getArtist() {
        return artist;
    }
    
    public String getAlbum() {
        return album;
    }
    
    public int getMinutes() {
        return minutes;
    }
    
    public int getSeconds() {
        return seconds;
    }
    
    //setters 
    public void setId(String id) {
        this.id = id;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    public void setAlbum(String album) {
        this.album = album;
    }
    
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    //getter to get left node
    public Track getLeft() {
        return left;
    }
    
    //setter to update or set left node
    public void setLeft(Track left) {
        this.left = left;
    }
    
    //getter to get right node
    public Track getRight() {
        return right;
    }
    
    //setter to update or set right node
    public void setRight(Track right) {
        this.right = right;
    }
    
    public String toString() { //returns string objects of the attributes
        return "Track title: " + title + "\n" +
               minutes + " min " + seconds + " sec" + "\n" +
               "Artist name: " + artist + "\n" +
               "Album title: " + album;
    }
}
