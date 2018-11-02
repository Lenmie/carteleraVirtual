package com.cartelera.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Usuario {

    @Id @GeneratedValue
    @Column(name = "USUARIO_ID")
    private Long id;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "NOMBRE")
    private String nombreCompleto;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "ID_DIRECCION")
    private Perfil perfil;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "ID_PUBLICACION")
    private List<Publicacion> publicaciones;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "ID_COMENTARIO")
    private List<Comentario> comentarios;


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

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) { this.perfil = perfil; }

    public Usuario(String email, String password, String nombreCompleto, Perfil perfil) {
        this.email = email;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
        this.perfil = perfil;
    }
}
