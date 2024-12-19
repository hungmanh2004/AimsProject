package hust.soict.pfiev.aims.screen;

import javax.swing.JOptionPane;

import hust.soict.pfiev.aims.media.DigitalVideoDisc;
import hust.soict.pfiev.aims.store.Store;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen {
    private Store store;

    public AddDigitalVideoDiscToStoreScreen() {
        super();
        setTitle("Add DVD to Store");
    }

    @Override
    protected void addItem() {
        String title = titleField.getText();
        String category = titleField.getText();
        String director = titleField.getText();
        int length = Integer.parseInt(titleField.getText());
        float cost = Float.parseFloat(costField.getText());
        DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
        store.addMedia(dvd);
        JOptionPane.showMessageDialog(this, "DVD added to store: " + title);
    }
}