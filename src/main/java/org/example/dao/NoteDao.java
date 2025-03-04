package org.example.dao;

import org.example.DBConnect.DbManager;
import org.example.domain.Note;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class NoteDao{

    DbManager db;

    public NoteDao(){
        db = new DbManager();
    }

    public void create(Note note) {
        String sql = "INSERT INTO note (content, date, username, title) VALUES(?, ?, ?, ?)";
        db.connect();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        try {
            PreparedStatement ps = db.getConnecton().prepareStatement(sql);
            ps.setString(1, note.getContent());
            ps.setString(2, df.format(note.getDate()));
            ps.setString(3, note.getUserName());
            ps.setString(4, note.getTitle());

            ps.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        db.close();
    }

    public Note retrieve(int noteId) {
        String sql = "SELECT (noteId, title, date, content, username) FROM note " +
                "WHERE noteId = ?";
        db.connect();
        Note note = new Note.NoteBuilder().build();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        try{
            PreparedStatement ps = db.getConnecton().prepareStatement(sql);
            ps.setInt(1, noteId);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                 note = new Note.NoteBuilder()
                         .setId(rs.getInt(1))
                         .setTitle(rs.getString(2))
                         .setDate(df.parse(rs.getString(3)))
                         .setUsername(rs.getString(4))
                         .setTitle(rs.getString(5))
                         .build();
            }

        }catch (SQLException e){
            System.out.println(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
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
                Note note = new Note.NoteBuilder()
                        .setId(rs.getInt(1))
                        .setTitle(rs.getString(2))
                        .setDate(new Date()) //TODO format correctly
                        .setUsername(rs.getString(4))
                        .setTitle(rs.getString(5))
                        .build();
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
