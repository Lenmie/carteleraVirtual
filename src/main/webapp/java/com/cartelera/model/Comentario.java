package com.cartelera.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Comentario {

    @Id @GeneratedValue
    @Column
    private Long id;

    @OneToOne(optional = false)
    @Column
    private UsuarioPerfil creador;

    @OneToOne
    @Column
    private Publicacion publicacion;

    @Column
    private Date fechaCreacion;

    @Column
    private String texto;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public UsuarioPerfil getCreador() {
        return creador;
    }

    public void setCreador(UsuarioPerfil creador) {
        this.creador = creador;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public Comentario(UsuarioPerfil creador, Publicacion publicacion, Date fechaCreacion, String texto) {
        this.creador = creador;
        this.publicacion = publicacion;
        this.fechaCreacion = fechaCreacion;
        this.texto = texto;
    }

    public Comentario(){}
}
