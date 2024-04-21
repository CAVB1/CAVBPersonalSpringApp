package com.cavb.CAVBPersonalApp.JPA;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Rol {
    @Id
    @Column(name = "idrol")
    private int IdRol;
    private String Name;

    @Column(name = "name")
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getIdRol() {
        return IdRol;
    }

    public void setIdRol(int idRol) {
        IdRol = idRol;
    }


}
