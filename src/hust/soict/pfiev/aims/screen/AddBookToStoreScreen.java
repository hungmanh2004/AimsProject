package hust.soict.pfiev.aims.screen;

import hust.soict.pfiev.aims.media.Book;
import hust.soict.pfiev.aims.store.Store;
import javax.swing.JOptionPane;

public class AddBookToStoreScreen extends AddItemToStoreScreen {
    private Store store;

    public AddBookToStoreScreen() {
        super();
        setTitle("Add Book to Store");
    }

    @Override
    protected void addItem() {
        String title = titleField.getText();
        String category = titleField.getText();
        float cost = Float.parseFloat(costField.getText());
        Book book = new Book(title, category, cost);
        store.addMedia(book);
        JOptionPane.showMessageDialog(this, "Book added to store: " + title);
    }
}