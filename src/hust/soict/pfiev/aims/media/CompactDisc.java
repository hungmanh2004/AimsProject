package hust.soict.pfiev.aims.media;
//import java.lang.reflect.Array;
import java.util.*;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, String category, String director, float cost, String artist, ArrayList<Track> tracks) {
        super(title, category, director, cost);
        this.artist = artist;
        for(Track track : tracks) {
            this.tracks.add(track);
        }
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void addTracks(ArrayList<Track> newTracks) {
        for(Track track : newTracks) {
            if(tracks.contains(track)) {
                System.out.println("Track " + track.getTitle() + " is already in the list");
            }
            else {
                tracks.add(track);
            }
        }
    }

    public void removeTrack(Track oldTrack) {
        for(Track track : tracks) {
            if(oldTrack.equals(track)) {
                tracks.remove(track);
            }
            else {
                System.out.println("Track " + oldTrack.getTitle() + " is not in the list");
            }
        }
    }

    @Override
    public int getLength() {
        int length = 0;
        for(Track track : tracks) {
            length += track.getLength();
        }
        return length;
    }

    //@Override
    public String toString() {
        return "CD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + artist + " - " + getLength() + ": " + getCost() + "$";
    }

    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD length: " + this.getLength());
        for(Track track : tracks) {
            track.play();
        }
    }
}
