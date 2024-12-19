package hust.soict.pfiev.aims.screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class AddItemToStoreScreen extends JFrame {
    protected JTextField titleField;
    protected JTextField costField;
    protected JButton addButton;

    public AddItemToStoreScreen() {
        setTitle("Add Item to Store");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JMenuBar menuBar = createMenuBar();
        setJMenuBar(menuBar);

        JPanel inputPanel = createInputPanel();
        add(inputPanel, BorderLayout.CENTER);

        addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addItem();
            }
        });
        add(addButton, BorderLayout.SOUTH);
    }

    protected JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");

        JMenu smUpdateStore = new JMenu("Update Store");
        smUpdateStore.add(new JMenuItem("Add Book"));
        smUpdateStore.add(new JMenuItem("Add DVD"));
        smUpdateStore.add(new JMenuItem("Add CD"));

        menu.add(smUpdateStore);
        menu.add(new JMenuItem("View Store"));
        menu.add(new JMenuItem("View Cart"));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

    protected JPanel createInputPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JLabel titleLabel = new JLabel("Title:");
        titleField = new JTextField();
        panel.add(titleLabel);
        panel.add(titleField);

        JLabel costLabel = new JLabel("Cost:");
        costField = new JTextField();
        panel.add(costLabel);
        panel.add(costField);

        return panel;
    }

    protected abstract void addItem();
}