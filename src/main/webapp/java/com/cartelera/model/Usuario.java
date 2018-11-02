package com.cartelera.model;

import javax.persistence.*;

@Entity
@Table
public class Usuario {

    @Id @GeneratedValue
    @Column
    private Long id;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String nombreCompleto;

    @OneToOne
    @JoinColumn(name = "ID_DIRECCION")
    private Perfil perfil;

    //@Column
    //private Perfil perfil;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

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
/*
    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

*/
}
