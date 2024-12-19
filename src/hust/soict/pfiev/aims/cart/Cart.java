package hust.soict.pfiev.aims.cart;
import java.util.*;

import hust.soict.pfiev.aims.media.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
    private static final int MAX_NUMBERS_ORDERED = 20;

    // Them DVD vào gio hang
    public void addMedia(Media items) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(items);
        }
    }

    public void addMedia(Media[] itemsList) {
        for (Media items : itemsList) {
            if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
                itemsOrdered.add(items);
            }
        }
    }

    /*public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (items.size() < MAX_NUMBERS_ORDERED - 2) {
            items.add(dvd1);
            items.add(dvd2);
        }
    }*/

    // Xoa DVD khoi gio hang
    public void removeMedia(Media items) {
        for(Media item : itemsOrdered) {
            if(item.equals(items)) {
                itemsOrdered.remove(item);
            }
            else {
                System.out.println("Item not found in cart.");
            }
        }
    }

    // Tinh tong chi phi cua gio hang
    public float totalCost() {
        float total = 0;
        for (Media item : itemsOrdered) {
            total += item.getCost();
        }
        return total;
    }

    // Sap xep gio hang theo ten
    public void sortByTitle() {
        itemsOrdered.sort(Comparator.comparing(Media::getTitle).thenComparing(Comparator.comparing(Media::getCost).reversed()));
    }

    // Sap xep gio hang theo chi phi
    public void sortByCost() {
        itemsOrdered.sort(Comparator.comparing(Media::getCost).reversed().thenComparing(Media::getTitle));
    }

    // Hien thi tat ca thong tin cua DVD trong gio hang
    public void print() {
        System.out.println("Ordered Items: ");
        for (Media item : itemsOrdered) {
            System.out.println(item.toString());
        }
        System.out.println("Total cost: " + totalCost());
    }

    public void print(int id) {
        for (Media item : itemsOrdered) {
            if(item.isMatch(id)) {
                System.out.println(item.toString());
            }
            else {
                System.out.println("No item found");
            }
        }
    }

    public void print(String title) {
        for (Media item : itemsOrdered) {
            if(item.isMatch(title)) {
                System.out.println(item.toString());
            }
            else {
                System.out.println("No item found");
            }
        }
    }

    // Getter to access items in the cart
    public ObservableList<Media> getItemsOrdered() {
        return itemsOrdered;
    }
}
