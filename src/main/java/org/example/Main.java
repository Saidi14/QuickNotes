package org.example;

import org.example.dao.NoteDao;
import org.example.gui.MainWindow;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        UIManager.LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
        for(UIManager.LookAndFeelInfo look: looks){
            System.out.println(look);
        }
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            System.out.println(e);
        }
        MainWindow window = new MainWindow();
    }
}