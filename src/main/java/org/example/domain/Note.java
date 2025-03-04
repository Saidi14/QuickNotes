package org.example.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Note {
    private int id;
    private String content;
    private Date date;
    private String userName;
    private String title;

    private Note(NoteBuilder builder){
        id = builder.id;
        content = builder.content;
        date = builder.date;
        userName = builder.username;
        title = builder.title;
    }

    public String getContent() {
        return content;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Note{" +
                "content='" + content + '\'' +
                ", timeTag='" + date.toString() + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
    public static class NoteBuilder{
        int id;
        String title;
        String content;
        Date date;
        String username;

        public NoteBuilder setId(int id){
            this.id = id;
            return this;
        }
        public NoteBuilder setTitle(String title){
            this.title = title;
            return this;
        }
        public NoteBuilder setContent(String content){
            this.content = content;
            return this;
        }
        public NoteBuilder setDate(Date date){
            SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
            this.date = date;
            return this;
        }
        public NoteBuilder setUsername(String username){
            this.username = username;
            return this;
        }

        public Note build(){
            return new Note(this);
        }

    }

}
