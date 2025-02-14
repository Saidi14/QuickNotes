package org.example.gui.Panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel extends JPanel {

    private String username, password;
    private JLabel titleLbl, usernameLbl, passwordLbl;
    private JTextField usernameFld, passwordFld;
    private JButton loginBtn, newUserBtn;
    private GridBagConstraints cTitleLbl, cUsernameLbl, cPasswordLbl, cUsernameFld,cPasswordFld,
        cLoginBtn, cLewUserBtn;
    ContentPane parent;
    
    public LoginPanel(ContentPane setParent){
        parent = setParent;
        setComponents();
        setConstraints();
        setActionListeners();
        setLayout(new GridBagLayout());

        this.add(usernameLbl, cUsernameLbl);
        this.add(passwordLbl, cPasswordLbl);
        this.add(usernameFld, cUsernameFld);
        this.add(passwordFld, cPasswordFld);
        this.add(loginBtn, cLoginBtn);
        this.add(newUserBtn, cLewUserBtn);
    }

    public void setComponents(){
        titleLbl = new JLabel("Login");
        usernameLbl = new JLabel("Username:");
        passwordLbl = new JLabel("Password");

        usernameFld = new JTextField();
        usernameFld.setPreferredSize(new Dimension(100, 25));
        passwordFld = new JTextField();
        passwordFld.setPreferredSize(new Dimension(100, 25));

        loginBtn = new JButton("Login");
        newUserBtn = new JButton("New User?");

        cUsernameLbl = new GridBagConstraints();
        cPasswordLbl = new GridBagConstraints();
        cUsernameFld = new GridBagConstraints();
        cPasswordFld = new GridBagConstraints();
        cLoginBtn = new GridBagConstraints();
        cLewUserBtn = new GridBagConstraints();

    }
    //set gridBag constraints for each component
    public void setConstraints(){
        cUsernameLbl.gridx = 0;
        cUsernameLbl.gridy = 0;

        cUsernameFld.gridx = 1;
        cUsernameFld.gridy = 0;

        cPasswordLbl.gridx = 0;
        cPasswordLbl.gridy = 1;

        cPasswordFld.gridx = 1;
        cPasswordFld.gridy = 1;

        cLoginBtn.gridx = 0;
        cLoginBtn.gridy = 2;

        cLewUserBtn.gridx = 1;
        cLewUserBtn.gridy = 2;
    }

    public void setActionListeners(){
        newUserBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("switch to registration panel");
                parent.showRegisterPanel();
            }
        });
    }
}
