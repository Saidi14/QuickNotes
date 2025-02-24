package org.example.gui.Panel;

import javax.swing.*;
import java.awt.*;

public class ContentPane extends JPanel {

    private CardLayout cardLayout;
    private JPanel loginPanel, registerPanel, homePanel;

    public ContentPane(){
        cardLayout = new CardLayout();
        this.setLayout(cardLayout);

        loginPanel = new LoginPanel(this);
        this.add(loginPanel, "login");
        registerPanel = new RegisterPanel(this);
        this.add(registerPanel, "register");
        homePanel = new HomePanel(this);
        this.add(homePanel , "home");
        cardLayout.show(this, "login");
    }

    public void showLoginPanel(){
        cardLayout.show(this, "login");
    }
    public void showHomePanel(){
        cardLayout.show(this, "home");
    }
    public void showRegisterPanel(){
        cardLayout.show(this, "register");
    }
}
