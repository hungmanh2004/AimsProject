package hust.soict.pfiev.aims;

import hust.soict.pfiev.aims.cart.Cart;
import hust.soict.pfiev.aims.exception.PlayerException;
import hust.soict.pfiev.aims.media.*;
import hust.soict.pfiev.aims.store.Store;
import java.util.*;

import javax.swing.JOptionPane;

public class Aims {
    public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
        System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media" + "'" + "s details");
		System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    public static Store store = new Store();
    public static Cart cart = new Cart();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Media media = cart.getItemsOrdered().get(0); // Assuming there's at least one media item
            if (media instanceof Playable) {
                ((Playable) media).play();
            } else {
                System.out.println("This media cannot be played.");
            }
        } catch (PlayerException e) {
            System.err.println("PlayerException caught: " + e.getMessage());
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        // in Store
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Matrix", "Action", "Wachowski Brothers", 136, 19.99f);
        cart.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 14.99f);
        cart.addMedia(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 24.99f);
        cart.addMedia(dvd3);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Titanic", "Romance", "James Cameron", 195, 18.50f);
        cart.addMedia(dvd4);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 19.49f);
        cart.addMedia(dvd5);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Forrest Gump", "Drama", "Robert Zemeckis", 142, 15.99f);
        cart.addMedia(dvd6);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 88, 16.99f);
        cart.addMedia(dvd7);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("Interstellar", "Sci-Fi", "Christopher Nolan", 169, 22.99f);
        cart.addMedia(dvd8);
        DigitalVideoDisc dvd9 = new DigitalVideoDisc("Avengers: Endgame", "Action", "Anthony & Joe Russo", 181, 19.99f);
        cart.addMedia(dvd9);
        DigitalVideoDisc dvd10 = new DigitalVideoDisc("Pulp Fiction", "Crime", "Quentin Tarantino", 154, 14.49f);
        cart.addMedia(dvd10);

        Track track1 = new Track("Track 1", 180);
        Track track2 = new Track("Track 2", 210);
        Track track3 = new Track("Track 3", 220);
        Track track4 = new Track("Track A", 180);
        Track track5 = new Track("Track B", 230);
        Track track6 = new Track("Track C", 210);
        Track track7 = new Track("Intro", 120);
        Track track8 = new Track("Hit Song", 200);
        Track track9 = new Track("Outro", 140);
        Track track10 = new Track("Song 1", 150);
        Track track11 = new Track("Song 2", 180);
        Track track12 = new Track("Opening", 240);
        Track track13 = new Track("Chorus", 180);
        Track track14 = new Track("Finale", 220);
        Track track15 = new Track("Start", 170);
        Track track16 = new Track("Middle", 200);
        Track track17 = new Track("End", 190);
        Track track18 = new Track("Main Theme", 210);
        Track track19 = new Track("Finale", 200);
        Track track20 = new Track("Track 1", 180);
        Track track21 = new Track("Track 2", 210);
        Track track22 = new Track("Track 3", 200);
        Track track23 = new Track("Opening", 220);
        Track track24 = new Track("Main", 240);
        Track track25 = new Track("Closing", 210);
        Track track26 = new Track("Intro", 200);
        Track track27 = new Track("Main Song", 240);
        Track track28 = new Track("Final Track", 210);

        // Create CompactDisc objects
        CompactDisc cd1 = new CompactDisc("The Dark Side of the Moon", "Rock", "Pink Floyd", 19.99f, "Pink Floyd", new ArrayList<>());
        cd1.addTracks(new ArrayList<Track>() {{
            add(track1);
            add(track2);
            add(track3);
        }});
        cart.addMedia(cd1);

        CompactDisc cd2 = new CompactDisc("Abbey Road", "Rock", "The Beatles", 24.99f, "The Beatles", new ArrayList<>());
        cd2.addTracks(new ArrayList<Track>() {{
            add(track4);
            add(track5);
            add(track6);
        }});
        cart.addMedia(cd2);

        CompactDisc cd3 = new CompactDisc("Thriller", "Pop", "Michael Jackson", 21.99f, "Michael Jackson", new ArrayList<>());
        cd3.addTracks(new ArrayList<Track>() {{
            add(track7);
            add(track8);
            add(track9);
        }});
        cart.addMedia(cd3);

        CompactDisc cd4 = new CompactDisc("Born to Run", "Rock", "Bruce Springsteen", 18.99f, "Bruce Springsteen", new ArrayList<>());
        cd4.addTracks(new ArrayList<Track>() {{
            add(track10);
            add(track11);
        }});
        cart.addMedia(cd4);

        CompactDisc cd5 = new CompactDisc("Let It Be", "Rock", "The Beatles", 19.49f, "The Beatles", new ArrayList<>());
        cd5.addTracks(new ArrayList<Track>() {{
            add(track12);
            add(track13);
            add(track14);
        }});
        cart.addMedia(cd5);

        CompactDisc cd6 = new CompactDisc("Rumours", "Rock", "Fleetwood Mac", 22.99f, "Fleetwood Mac", new ArrayList<>());
        cd6.addTracks(new ArrayList<Track>() {{
            add(track15);
            add(track16);
            add(track17);
        }});
        cart.addMedia(cd6);

        CompactDisc cd7 = new CompactDisc("Hotel California", "Rock", "Eagles", 19.99f, "Eagles", new ArrayList<>());
        cd7.addTracks(new ArrayList<Track>() {{
            add(track18);
            add(track9);
            add(track19);
        }});
        cart.addMedia(cd7);

        CompactDisc cd8 = new CompactDisc("Back in Black", "Rock", "AC/DC", 17.99f, "AC/DC", new ArrayList<>());
        cd8.addTracks(new ArrayList<Track>() {{
            add(track20);
            add(track21);
            add(track22);
        }});
        cart.addMedia(cd8);

        CompactDisc cd9 = new CompactDisc("The Wall", "Rock", "Pink Floyd", 23.99f, "Pink Floyd", new ArrayList<>());
        cd9.addTracks(new ArrayList<Track>() {{
            add(track23);
            add(track24);
            add(track25);
        }});
        cart.addMedia(cd9);

        CompactDisc cd10 = new CompactDisc("Exile on Main St.", "Rock", "The Rolling Stones", 25.99f, "The Rolling Stones", new ArrayList<>());
        cd10.addTracks(new ArrayList<Track>() {{
            add(track26);
            add(track27);
            add(track28);
        }});
        cart.addMedia(cd10);

        showMenu();

        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                store.getAvailableMedias();
                storeMenu();
                int choice1 = sc.nextInt();
                switch(choice1) {
                    case 1:
                        System.out.println("Enter the title of the media: ");
                        String command = sc.next();
                        for(Media item : store.getAvailableMedias()) {
                            if(item.getTitle().equals(command)) {
                                System.out.println(item.toString());
                                mediaDetailsMenu();
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Enter the title of the media: ");
                        command = sc.next();
                        for(Media item : store.getAvailableMedias()) {
                            if(item.getTitle().equals(command)) {
                                cart.addMedia(item);
                                System.out.println("Cart's quantity: " + cart.getItemsOrdered().size());
                            }
                        }
                        break;
                    
                }
                break;
            case 2:
                System.out.println("Enter the title of the media: ");
                String command = sc.nextLine();
                for(Media item : store.getAvailableMedias()) {
                    if(item.getTitle().equals(command)) {
                        System.out.println("Remove " + item.getTitle() + " from store.");
                        store.removeMedia(item);
                    }
                    else {
                        System.out.println("Add " + item.getTitle() + " to store.");
                        store.addMedia(item);
                    }
                }
                break;
            case 3:
                System.out.println(cart.getItemsOrdered());
                cartMenu();
                int choice2 = sc.nextInt();
                switch(choice2) {
                    case 1:
                        System.out.println("Filter by id or title?");
                        command = sc.nextLine();
                        switch(command) {
                            case "id":
                                System.out.println("Enter the id: ");
                                int id = sc.nextInt();
                                cart.print(id);
                                break;
                            case "title":
                                System.out.println("Enter the title: ");
                                String title = sc.nextLine();
                                cart.print(title);
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Sort by title or cost?");
                        command = sc.nextLine();
                        switch(command) {
                            case "title":
                                cart.sortByTitle();
                                System.out.println(cart.getItemsOrdered());
                                break;
                            case "cost":
                                cart.sortByCost();
                                System.out.println(cart.getItemsOrdered());
                                break;
                        }
                        break;
                }
                break;
        }

        sc.close();
    }
}
