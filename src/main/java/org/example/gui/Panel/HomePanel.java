package org.example.gui.Panel;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class HomePanel extends JPanel {
    ContentPane parent;
    private JLabel welcomeText;
    private JButton sortBtn, signOutBtn, discardBtn, saveBtn;
    private JComboBox<String> sortOptions;
    private JPanel panel1, panel2, panel3, contentPanel, titlePanel, noteListPanel, sortPanel, buttonPanel;
    private JTextArea noteField;
    private JTextArea noteTitle;
    private JScrollPane notePane, noteListPane;
    private JSplitPane noteArea;

    public HomePanel(ContentPane parent) {
        this.parent = parent;
        setComponents();
        //setActionListeners();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(titlePanel);
        add(contentPanel);
        addActionListeners();

    }
    //initialize home panel components
    private void setComponents(){
        titlePanel = new JPanel();
        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.X_AXIS));
//        noteListPanel.setLayout(new BoxLayout(noteListPanel, BoxLayout.Y_AXIS));
//        noteListPanel.add(new JLabel("PlaceHolder"));
        sortPanel = new JPanel();
        sortPanel.setLayout(new BoxLayout(sortPanel, BoxLayout.X_AXIS));
        contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.X_AXIS));
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        noteField = new JTextArea();
        noteTitle = new JTextArea();
        noteArea = new JSplitPane();
        noteArea.setOrientation(0);
        noteArea.setTopComponent(noteTitle);
        noteArea.setBottomComponent(noteField);

        panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        //panel1.setBorder(new LineBorder(Color.BLACK));
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1,1));
        //panel2.setBorder(new LineBorder(Color.BLACK));
        panel3 = new JPanel();
        //panel3.setBorder(new LineBorder(Color.BLACK));
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));

        welcomeText = new JLabel("Welcome User");
        welcomeText.setHorizontalTextPosition(SwingConstants.CENTER);
        sortBtn = new JButton("Sort");
        signOutBtn = new JButton("Sign Out");
        discardBtn = new JButton("Discard");
        saveBtn = new JButton("Save");

        noteListPane = new JScrollPane();
        notePane = new JScrollPane();

        String[] options = {"Name", "Date"};
        sortOptions = new JComboBox<>(options);
        sortOptions.setMaximumSize(new Dimension(70, 25));

        sortPanel.add(sortBtn);
        sortPanel.add(sortOptions);

        buttonPanel.add(discardBtn);
        buttonPanel.add(saveBtn);

        //notePane.add(noteField);

        titlePanel.add(sortPanel);
        titlePanel.add(Box.createHorizontalGlue());
        titlePanel.add(welcomeText);
        titlePanel.add(Box.createHorizontalGlue());
        titlePanel.add(signOutBtn);

        panel1.add(noteListPane);

        panel2.add(noteArea);

        panel3.add(Box.createVerticalGlue());
        panel3.add(buttonPanel);

        contentPanel.add(panel1);
        contentPanel.add(panel2);
        contentPanel.add(panel3);
    }
    public void addActionListeners(){
        signOutBtn.addActionListener(e -> parent.showLoginPanel());
    }
}
