package hust.soict.pfiev.test.store;

import hust.soict.pfiev.aims.media.*;
import hust.soict.pfiev.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Matrix", "Action", "Wachowski Brothers", 136, 19.99f);
        store.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 14.99f);
        store.addMedia(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 24.99f);
        store.addMedia(dvd3);

        store.removeMedia(dvd2);

        for (Media dvd : store.getAvailableMedias()) {
            System.out.println(dvd);
        }
    }
}
