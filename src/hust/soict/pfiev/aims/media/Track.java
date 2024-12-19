package hust.soict.pfiev.aims.media;

import java.util.Objects;
import hust.soict.pfiev.aims.exception.PlayerException;

public class Track implements Playable {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object obj) {
        // Bước 1: Kiểm tra tham chiếu (reflexive check)
        if (this == obj) return true;

        // Bước 2: Kiểm tra đối tượng null và kiểu lớp
        if (obj == null || getClass() != obj.getClass()) return false;

        // Bước 3: Ép kiểu đối tượng
        Track track = (Track) obj;

        // Bước 4: So sánh thuộc tính (title, length)
        return Objects.equals(title, track.title) && Objects.equals(length, track.length);
    }

    public void play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Playing track: " + this.getTitle());
            System.out.println("Track length: " + this.getLength());
        } else {
            throw new PlayerException("ERROR: track length is non-positive");
        }
    }
}
