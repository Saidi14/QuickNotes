package org.example.DBConnect;

import java.sql.*;

public class DbManager {

    private Connection con;

    public void connect(){
        try{
            String url = "jdbc:sqlite:C:/Users/saidi/databases/QuickNote";

            con = DriverManager.getConnection(url);

        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public Connection getConnecton(){
        return con;
    }

    public void close(){
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println(e);;
        }
    }

}
