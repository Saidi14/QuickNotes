package org.example.db;

import org.example.dao.NoteDao;
import org.example.dao.UserDAO;
import org.example.domain.Note;
import org.example.domain.User;

public class DBUtil {
    public static boolean isValidLogin(String username, String password){
        if(username.isBlank() || password.isBlank())
            return false;

        UserDAO dao = new UserDAO();
        User user = dao.retrieve(username);

        if(user != null && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    public static void registerUser(User user){
        UserDAO dao = new UserDAO();
        dao.create(user);
    }

    public static void saveNote(Note note){
        NoteDao dao = new NoteDao();
        dao.create(note);
    }
}
