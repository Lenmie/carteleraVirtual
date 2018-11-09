package com.cartelera.model;

import javax.persistence.*;

@Entity
public abstract class UsuarioPerfil {

    @Id @GeneratedValue
    @Column
    private Long id;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String nombreCompleto;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public UsuarioPerfil(){}

    public UsuarioPerfil(String email, String password, String nombreCompleto){

        this.email = email;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
    }

}
