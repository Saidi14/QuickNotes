package org.example.gui;

import org.example.gui.Panel.ContentPane;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    ContentPane contentPane;

    public MainWindow(){
        setComponents();
        setTitle("QuickNote");
        setSize(600, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        this.add(contentPane, BorderLayout.CENTER);

        setVisible(true);
    }

    public void setComponents(){
        contentPane = new ContentPane();
    }
}
