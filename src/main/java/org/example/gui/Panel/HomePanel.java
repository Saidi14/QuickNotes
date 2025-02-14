package org.example.gui.Panel;

import javax.swing.*;
import java.awt.*;

public class HomePanel extends JPanel {
    ContentPane parent;
    private JLabel welcomeText;
    private JButton sortBtn, signOutBtn, discardBtn, saveBtn;
    private JComboBox<String> sortOptions;
    private JPanel noteList;
    private JTextArea noteField;
    private GridBagLayout layout;
    private GridBagConstraints cWelcomeText, cSortBtn, cSignOutBtn, cDiscardBtn, cSaveBtn,
            cSortOptions, cNoteList, cNoteField;

    
    public HomePanel(ContentPane parent) {
        this.parent = parent;
        setComponents();
        setConstraints();
        //setActionListeners();
        setLayout(new GridBagLayout());

        this.add(welcomeText, cWelcomeText);
        this.add(signOutBtn, cSignOutBtn);
        this.add(sortBtn, cSortBtn);
        this.add(sortOptions, cSortOptions);
        this.add(noteList, cNoteList);
        this.add(noteField, cNoteField);
        this.add(discardBtn, cDiscardBtn);
        this.add(saveBtn, cSaveBtn);
    }
    //initialize home panel components
    private void setComponents(){
        layout = new GridBagLayout();
        welcomeText = new JLabel("Welcome User");
        sortBtn = new JButton("Sort");
        signOutBtn = new JButton("Sign Out");
        discardBtn = new JButton("Discard");
        saveBtn = new JButton("Save");

        String[] options = {"Name", "Date"};
        sortOptions = new JComboBox<>(options);

        noteField = new JTextArea();
        noteList = new JPanel();

        noteList.setBackground(Color.lightGray);
    }


    private void setConstraints(){
        cWelcomeText = new GridBagConstraints();
        cWelcomeText.gridy = 0;
        cWelcomeText.gridx = 0;
        cWelcomeText.gridwidth = 6;
        //cWelcomeText.fill = GridBagConstraints.HORIZONTAL;
        //cWelcomeText.anchor = GridBagConstraints.CENTER;

        cSignOutBtn = new GridBagConstraints();
        cSignOutBtn.gridy = 0;
        cSignOutBtn.gridx = 6;
        //cSignOutBtn.anchor = GridBagConstraints.FIRST_LINE_END;

        cSortBtn = new GridBagConstraints();
        cSortBtn.gridy = 1;
        cSortBtn.gridx = 0;

        cSortOptions = new GridBagConstraints();
        cSortOptions.gridy = 1;
        cSortOptions.gridx = 1;

        cNoteList = new GridBagConstraints();
        cNoteList.gridy = 2;
        cNoteList.gridx = 0;
        cNoteList.gridheight = 5;
        cNoteList.gridwidth = 2;
        cNoteList.weightx = 0.25;
        cNoteList.fill = GridBagConstraints.BOTH;

        cNoteField = new GridBagConstraints();
        cNoteField.gridy = 1;
        cNoteField.gridx = 2;
        cNoteField.gridwidth = 2;
        cNoteField.gridheight = 6;
        cNoteField.weighty = 0.1;
        cNoteField.weightx = 0.7;
        cNoteField.fill = GridBagConstraints.BOTH;

        cDiscardBtn = new GridBagConstraints();
        cDiscardBtn.gridy = 5;
        cDiscardBtn.gridx = 5;

        cSaveBtn = new GridBagConstraints();
        cSaveBtn.gridy = 5;
        cSaveBtn.gridx = 6;
        cSaveBtn.anchor = GridBagConstraints.LAST_LINE_END;
    }
}
