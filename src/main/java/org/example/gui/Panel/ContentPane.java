package org.example.gui.Panel;

import javax.swing.*;
import java.awt.*;

public class ContentPane extends JPanel {

    private CardLayout cardLayout;
    private JPanel loginPanel, registerPanel, homePanel;

    public ContentPane(){
        setComponents();
        this.setLayout(cardLayout);

        this.add(loginPanel, "login");
        this.add(homePanel , "home");
        this.add(registerPanel, "register");
        cardLayout.show(this, "login");
    }

    public void setComponents(){
        cardLayout = new CardLayout();
        loginPanel = new LoginPanel(this);
        registerPanel = new RegisterPanel(this);
        homePanel = new HomePanel(this);
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
