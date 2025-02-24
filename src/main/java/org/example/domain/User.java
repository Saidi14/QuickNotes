package org.example.domain;

public class User {
    private String username;
    private String password;

//    public User(String username, String password){
//        this.password = password;
//        this.username = username;
//    }
    private User(UserBuilder builder){
        this.username = builder.username;
        this.password = builder.password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public static class UserBuilder{
        private String username;
        private String password;

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
