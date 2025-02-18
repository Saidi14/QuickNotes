package org.example;

import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import org.example.gui.MainWindow;

/*
    Author: Saidi Mwamchera
 */

public class Main {
    public static void main(String[] args) {
        FlatArcOrangeIJTheme.setup();
        MainWindow window = new MainWindow();
    }
}