package org.example.gui.Panel;

import org.example.db.DBUtil;
import org.example.domain.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPanel extends JPanel {

    private String username, password;
    private JLabel titleLbl, usernameLbl, passwordLbl;
    private JTextField usernameFld, passwordFld;
    private JButton registerBtn, returningUserBtn;
    private GridBagConstraints cTitleLbl, cUsernameLbl, cPasswordLbl, cUsernameFld,cPasswordFld,
            cRegisterBtn, cReturningUserBtn;
    private ContentPane parent;

    public RegisterPanel(ContentPane setParent){
        parent = setParent;
        setComponents();
        setActionListeners();
        setLayout(new GridBagLayout());
        setConstraints();

        this.add(usernameLbl, cUsernameLbl);
        this.add(passwordLbl, cPasswordLbl);
        this.add(usernameFld, cUsernameFld);
        this.add(passwordFld, cPasswordFld);
        this.add(registerBtn, cRegisterBtn);
        this.add(returningUserBtn, cReturningUserBtn);
    }

    public void setComponents(){
        titleLbl = new JLabel("Login");
        usernameLbl = new JLabel("Username:");
        passwordLbl = new JLabel("Password");

        usernameFld = new JTextField();
        usernameFld.setPreferredSize(new Dimension(100, 25));
        passwordFld = new JTextField();
        passwordFld.setPreferredSize(new Dimension(100, 25));

        registerBtn = new JButton("Register");
        returningUserBtn = new JButton("Returning User?");

        cUsernameLbl = new GridBagConstraints();
        cPasswordLbl = new GridBagConstraints();
        cUsernameFld = new GridBagConstraints();
        cPasswordFld = new GridBagConstraints();
        cRegisterBtn = new GridBagConstraints();
        cReturningUserBtn = new GridBagConstraints();

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

        cRegisterBtn.gridx = 0;
        cRegisterBtn.gridy = 2;

        cReturningUserBtn.gridx = 1;
        cReturningUserBtn.gridy = 2;
    }
    public void setActionListeners(){
        returningUserBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.showLoginPanel();
            }
        });
        registerBtn.addActionListener(e -> {
            if(usernameFld.getText().isBlank() || passwordFld.getText().isBlank())
                JOptionPane.showMessageDialog(this,
                        "Username and Password fields cannot be empty");
            else{
                DBUtil.registerUser(new User
                        .UserBuilder()
                        .setUsername(usernameFld.getText())
                        .setPassword(passwordFld.getText())
                        .build());
                usernameFld.setText("");
                passwordFld.setText("");
                JOptionPane.showMessageDialog(this,"Registration Sucessful.\n" +
                        "Redirecting to login screen");
                parent.showLoginPanel();
            }
        });
    }
}
