package hust.soict.pfiev.aims.screen;

import hust.soict.pfiev.aims.store.Store;
import hust.soict.pfiev.aims.cart.Cart;
import hust.soict.pfiev.aims.media.Media;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class StoreScreen extends JFrame {
    private Store store;
    private Cart cart;

    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");
    
        JMenu smUpdateStore = new JMenu("Update Store");
        JMenuItem addBookItem = new JMenuItem("Add Book");
        addBookItem.addActionListener(e -> new AddBookToStoreScreen().setVisible(true));
        smUpdateStore.add(addBookItem);
    
        JMenuItem addDVDItem = new JMenuItem("Add DVD");
        addDVDItem.addActionListener(e -> new AddDigitalVideoDiscToStoreScreen().setVisible(true));
        smUpdateStore.add(addDVDItem);
    
        JMenuItem addCDItem = new JMenuItem("Add CD");
        addCDItem.addActionListener(e -> new AddCompactDiscToStoreScreen().setVisible(true));
        smUpdateStore.add(addCDItem);
    
        menu.add(smUpdateStore);
        menu.add(new JMenuItem("View Store"));
        menu.add(new JMenuItem("View Cart"));
    
        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);
    
        return menuBar;
    }

    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
    
        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);
    
        JButton cartButton = new JButton("View cart");
        cartButton.setPreferredSize(new Dimension(100, 50));
        cartButton.setMaximumSize(new Dimension(100, 50));
    
        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cartButton);
        header.add(Box.createRigidArea(new Dimension(10, 10)));
    
        return header;
    }

    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(0, 3, 10, 10));
    
        // Example of adding media items to the store
        for (Media media : store.getAvailableMedias()) {
            JPanel mediaPanel = new JPanel();
            mediaPanel.setLayout(new BoxLayout(mediaPanel, BoxLayout.Y_AXIS));
    
            JLabel title = new JLabel(media.getTitle());
            JLabel cost = new JLabel(String.format("%.2f $", media.getCost()));
    
            JButton addToCartButton = new JButton("Add to cart");
            addToCartButton.addActionListener(e -> cart.addMedia(media));
    
            mediaPanel.add(title);
            mediaPanel.add(cost);
            mediaPanel.add(addToCartButton);
    
            center.add(mediaPanel);
        }
    
        return center;
    }

    JPanel createMediaHome(Media media) {
        JPanel mediaHome = new JPanel();
        mediaHome.setLayout(new BoxLayout(mediaHome, BoxLayout.Y_AXIS));

        JLabel mediaTitle = new JLabel(media.getTitle());
        mediaHome.add(mediaTitle);

        JButton playButton = new JButton("Play");
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog playDialog = new JDialog();
                playDialog.setTitle("Playing Media");
                playDialog.setSize(300, 200);
                playDialog.add(new JLabel("Playing: " + media.getTitle()));
                playDialog.setVisible(true);
            }
        });
        mediaHome.add(playButton);

        JButton addToCartButton = new JButton("Add to cart");
        addToCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cart.addMedia(media);
                JOptionPane.showMessageDialog(null, media.getTitle() + " has been added to the cart.");
            }
        });
        mediaHome.add(addToCartButton);

        return mediaHome;
    }

    public StoreScreen(Store store) {
        this.store = store;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
    
        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);
    
        setVisible(true);
        setTitle("Store");
        setSize(1024, 768);
    }

    public StoreScreen(Store store, Cart cart) {
        this.store = store;
        this.cart = cart;
        // Initialize the UI components
        // ...existing code...
    }
}
