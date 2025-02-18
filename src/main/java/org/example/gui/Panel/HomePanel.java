package org.example.gui.Panel;

import javax.swing.*;
import java.awt.*;

public class HomePanel extends JPanel {
    ContentPane parent;
    private JLabel welcomeText;
    private JButton sortBtn, signOutBtn, discardBtn, saveBtn;
    private JComboBox<String> sortOptions;
    private JPanel panel1, titlePanel, panel2, panel3, contentPanel, noteListPanel;
    private JTextArea noteField;
    private GridBagLayout layout;
    private GridBagConstraints cWelcomeText, cSortBtn, cSignOutBtn, cDiscardBtn, cSaveBtn,
            cSortOptions, cNoteList, cNoteField;

    
    public HomePanel(ContentPane parent) {
        this.parent = parent;
        setComponents();
        //setActionListeners();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(titlePanel);
        add(contentPanel);

    }
    //initialize home panel components
    private void setComponents(){
        titlePanel = new JPanel();
        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.X_AXIS));
        panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
        noteListPanel = new JPanel();
        noteListPanel.setLayout(new BoxLayout(noteListPanel, BoxLayout.Y_AXIS));
        contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.X_AXIS));


        welcomeText = new JLabel("Welcome User");
        sortBtn = new JButton("Sort");
        signOutBtn = new JButton("Sign Out");
        discardBtn = new JButton("Discard");
        saveBtn = new JButton("Save");

        String[] options = {"Name", "Date"};
        sortOptions = new JComboBox<>(options);

        noteField = new JTextArea();

        titlePanel.add(welcomeText);
        titlePanel.add(signOutBtn);

        panel1.add(sortOptions);
        panel1.add(sortBtn);
        panel1.add(noteListPanel);

        panel2.add(noteField);

        panel3.add(discardBtn);
        panel3.add(saveBtn);

        contentPanel.add(panel1);
        contentPanel.add(panel2);
        contentPanel.add(panel3);
    }

}
