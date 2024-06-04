package com.dani.internapp.models;
import java.util.Date;
import java.util.Objects;

public class User {
    private String firstName;
    private String lastName;
    private String userName;
    private Date dateOfBirth;

    public User(String firstName, String lastName, String userName, Date dateOfBirth)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.dateOfBirth = dateOfBirth;
    }

    public boolean checkUserName(String s) {return this.userName.equals(s);}

    @Override
    public String toString() {
        return "\n User: " + this.userName + "\n Full Name: " + this.getName() + "\n Date Of Birth: " + this.dateOfBirth + "\n";
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(firstName,lastName,userName,dateOfBirth);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User other = (User) o;
        return (Objects.equals(firstName, other.firstName) &&
                Objects.equals(lastName, other.lastName) &&
                Objects.equals(userName, other.userName) &&
                Objects.equals(dateOfBirth, other.dateOfBirth));
    }

    /* getters */
    public String getUserName() {return this.userName;}

    public String getName() {return this.firstName + " " + this.lastName;}

    public String getFirstName() {return this.firstName;}

    public String getLastName() {return this.lastName;}

    public Date getDateOfBirth() {return this.dateOfBirth;}

    /* setters */
    public void setUserName(String s) {this.userName = s;}

    public void setFirstName(String s) {this.firstName = s;}

    public void setLastName(String s) {this.lastName = s;}

    public void setDateOfBirth(Date s) {this.dateOfBirth = s;}
}
