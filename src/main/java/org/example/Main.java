package org.example;

import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import org.example.gui.MainWindow;

import javax.swing.*;

/*
    Author: Saidi Mwamchera
 */

public class Main {
    public static void main(String[] args) {
        /*
        UIManager.LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
        for(UIManager.LookAndFeelInfo look : looks){
            System.out.println(look);
        }
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        javax.swing.UIManager$LookAndFeelInfo[Metal javax.swing.plaf.metal.MetalLookAndFeel]
        javax.swing.UIManager$LookAndFeelInfo[Nimbus javax.swing.plaf.nimbus.NimbusLookAndFeel]
        javax.swing.UIManager$LookAndFeelInfo[CDE/Motif com.sun.java.swing.plaf.motif.MotifLookAndFeel]
        javax.swing.UIManager$LookAndFeelInfo[Windows com.sun.java.swing.plaf.windows.WindowsLookAndFeel]
        javax.swing.UIManager$LookAndFeelInfo[Windows Classic com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel]
         */
        FlatArcOrangeIJTheme.setup();
        MainWindow window = new MainWindow();
    }
}