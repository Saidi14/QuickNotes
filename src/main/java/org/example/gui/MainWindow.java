package org.example.gui;

import org.example.gui.Panel.ContentPane;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    ContentPane contentPane;
    JMenuBar jMenuBar;
    JMenuItem exit;
    JMenu file, theme;

    public MainWindow(){
        setComponents();
        setTitle("QuickNote");
        setSize(600, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        this.add(contentPane, BorderLayout.CENTER);
        this.add(new JPanel(), BorderLayout.SOUTH);
        this.add(new JPanel(), BorderLayout.EAST);
        this.add(new JPanel(), BorderLayout.WEST);
        this.add(jMenuBar, BorderLayout.NORTH);
        setVisible(true);
    }

    public void setComponents(){
        contentPane = new ContentPane();
        exit = new JMenuItem("Exit");
        exit.addActionListener(e -> System.exit(0));
        file = new JMenu("File");
        //TODO add light and dark themes
        theme = new JMenu("Theme");
        jMenuBar = new JMenuBar();

        jMenuBar.add(file);
        jMenuBar.add(theme);
        file.add(exit);

    }
}
