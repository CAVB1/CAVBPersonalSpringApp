package com.cavb.CAVBPersonalApp.ML;

import java.util.Date;

public class User {
    private int IdUser;
    private String UserName;
    private String Name;
    private String LastName;
    private String Email;
    private String Password;
    private Date BirthDate;
    public Rol Rol;

    public com.cavb.CAVBPersonalApp.ML.Rol getRol() {
        return Rol;
    }

    public void setRol(com.cavb.CAVBPersonalApp.ML.Rol rol) {
        Rol = rol;
    }

    public int getIdUser() {
        return IdUser;
    }

    public void setIdUser(int idUser) {
        IdUser = idUser;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }
}
