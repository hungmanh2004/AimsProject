package hust.soict.pfiev.aims.store;

import java.util.*;

import hust.soict.pfiev.aims.media.*;

public class Store {
    private ArrayList<Media> itemsInStore;

    public Store() {
        this.itemsInStore = new ArrayList<>();
    }

    public void addMedia(Media item) {
        itemsInStore.add(item);
    }

    public void removeMedia(Media item) {
        if (itemsInStore.remove(item)) {
        } else {
            System.out.println("Item not found in inventory.");
        }
    }

    public ArrayList<Media> getAvailableMedias() {
        return itemsInStore;
    }
}
