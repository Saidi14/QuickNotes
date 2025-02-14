package org.example.dao;

import org.example.DBConnect.DbManager;
import org.example.domain.Note;

import javax.xml.transform.Result;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class NoteDao{

    DbManager db;

    public NoteDao(){
        db = new DbManager();
    }

    public void create(Note note) {
        String sql = "INSERT INTO NOTE (content, date, username)" +
                "VALUES(?, ?, ?)";
        db.connect();

        try {
            PreparedStatement ps = db.getConnecton().prepareStatement(sql);
            ps.setString(1, note.getContent());
            ps.setString(3, note.getTimeTag());
            ps.setString(1, note.getUserName());

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        db.close();
    }

    public Note retrieve(int noteId) {
        String sql = "SELECT * FROM note " +
                "WHERE noteId = ?";
        db.connect();
        Note note = new Note();

        try{
            PreparedStatement ps = db.getConnecton().prepareStatement(sql);
            ps.setInt(1, noteId);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                 note = new Note(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );

            }

        }catch (SQLException e){
            System.out.println(e);
        }
        db.close();
        return note;
    }

    //fetches all notes created by the user currently logged in
    public ArrayList<Note> retrieveForUser(String username) {
        String sql = "SELECT * FROM NOTE " +
                "WHERE username = ?";
        ArrayList<Note> notes = new ArrayList<>();
        db.connect();

        try{
            PreparedStatement ps = db.getConnecton().prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Note note = new Note(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );
                notes.add(note);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        db.close();
        return notes;
    }


    public void delete() {

    }


    public void deleteAll() {

    }
}
