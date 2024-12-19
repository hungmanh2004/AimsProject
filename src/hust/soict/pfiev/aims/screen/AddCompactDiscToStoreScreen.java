package hust.soict.pfiev.aims.screen;

import hust.soict.pfiev.aims.media.CompactDisc;
import hust.soict.pfiev.aims.store.Store;
import hust.soict.pfiev.aims.media.Track;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {
    private Store store;

    public AddCompactDiscToStoreScreen() {
        super();
        setTitle("Add CD to Store");
    }

    @Override
    protected void addItem() {
        String title = titleField.getText();
        String category = titleField.getText();
        String director = titleField.getText();
        float cost = Float.parseFloat(costField.getText());
        String artist = titleField.getText();
        ArrayList<Track> tracks = new ArrayList<>();
        CompactDisc cd = new CompactDisc(title, category, director, cost, artist, tracks);
        store.addMedia(cd);
        JOptionPane.showMessageDialog(this, "CD added to store: " + title);
    }
}