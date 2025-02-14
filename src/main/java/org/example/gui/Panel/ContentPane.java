package org.example.gui.Panel;

import javax.swing.*;
import java.awt.*;

public class ContentPane extends JPanel {

    private CardLayout cardLayout;
    private JPanel loginPanel, registerPanel;

    public ContentPane(){
        setComponents();
        this.setLayout(cardLayout);

        this.add(loginPanel, "login");
        //this.add(, "home");
        this.add(registerPanel, "register");
        cardLayout.show(this, "login");
    }

    public void setComponents(){
        cardLayout = new CardLayout();
        loginPanel = new LoginPanel(this);
        registerPanel = new RegisterPanel(this);
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
