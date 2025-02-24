package org.example.dao;

import org.example.DBConnect.DbManager;
import org.example.domain.Note;
import org.example.domain.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO{

    DbManager db;

    public UserDAO(){
        db = new DbManager();
    }

    public void create(User item) {
        String sql = ("INSERT INTO USER VALUES(?, ?)");
        db.connect();

        try{
            PreparedStatement ps = db.getConnecton().prepareStatement(sql);
            ps.setString(1, item.getUsername());
            ps.setString(2, item.getPassword());

            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        db.close();
    }

    public User retrieve(String username) {
        String sql = "SELECT username, password FROM user WHERE username = ?";
        db.connect();
        User user = null;

        try{
            PreparedStatement ps = db.getConnecton().prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                user = new User.UserBuilder()
                        .setUsername(rs.getString(1))
                        .setPassword(rs.getString(2))
                        .build();
            }

        }catch (SQLException e){
            System.out.println(e);
        }
        db.close();
        return user;
    }

    public ArrayList<User> retrieveAll() {
        return null;
    }


    public void delete() {

    }

    public void deleteAll() {

    }
}
