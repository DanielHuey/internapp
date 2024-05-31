package com.dani.internapp.models;

public class User {
    private String firstname;
    private String lastname;
    private String username;
    private String dateOfBirth;

    public User(String firstname, String lastname, String username, String dateOfBirth)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.dateOfBirth = dateOfBirth;
    }

    public boolean checkUsername(String s) {return this.username == s;}

    @Override
    public String toString() {
        return "\n User: " + this.username + "\n Full Name: " + this.getName() + "\n Date Of Birth: " + this.dateOfBirth + "\n";
    }

    /* getters */
    public String getUsername() {return this.username;}

    public String getName() {return this.firstname + " " + this.lastname;}

    public String getFirstName() {return this.firstname;}

    public String getLastName() {return this.lastname;}

    public String getDateOfBirth() {return this.dateOfBirth;}

    /* setters */
    public void setUsername(String s) {this.username = s;}

    public void setFirstName(String s) {this.firstname = s;}

    public void setLastName(String s) {this.lastname = s;}

    public void setDateOfBirth(String s) {this.dateOfBirth = s;}
}
