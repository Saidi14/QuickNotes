package org.example.domain;

public class Note {
    private int id;
    private String content;
    private String timeTag;
    private String userName;

    public Note(int id, String content, String timeTag, String userName) {
        this.content = content;
        this.id = id;
        this.userName = userName;
        this.timeTag = timeTag;
    }
    public Note(){

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

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimeTag() {
        return timeTag;
    }

    public void setTimeTag(String timeTag) {
        this.timeTag = timeTag;
    }

    @Override
    public String toString() {
        return "Note{" +
                "content='" + content + '\'' +
                ", timeTag='" + timeTag + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

}
