package hust.soict.pfiev.aims.media;

import java.util.*;

public class Book extends Media {
    private ArrayList<String> authors = new ArrayList<>();

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String authorName) {
        authors.add(authorName);
    }

    public void removeAuthor(String authorName) {
        authors.remove(authorName);
    }

    //@Override
    public String toString() {
        return "Book - " + getTitle() + " - " + getCategory() + " - " + getAuthors() + ": " + getCost() + "$";
    }

}
