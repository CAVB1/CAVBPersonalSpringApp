
package com.cavb.CAVBPersonalApp.JPA;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
public class User {
    @Id
    @Column(name = "iduser")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdUser;
    @Column(name = "username")
    private String UserName;
    @Column(name = "name")
    private String Name;
    @Column(name = "lastname")
    private String LastName;
    @Column(name = "email")
    private String Email;
    @Column(name = "password")
    private String Password;
    @Column(name = "birthdate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date BirthDate;
    @ManyToOne
    @JoinColumn(name = "idrol")
    public Rol Rol;

    public com.cavb.CAVBPersonalApp.JPA.Rol getRol() {
        return Rol;
    }

    public void setRol(com.cavb.CAVBPersonalApp.JPA.Rol rol) {
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
