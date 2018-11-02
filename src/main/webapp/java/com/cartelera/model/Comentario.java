package com.cartelera.model;

import javax.persistence.*;
import java.util.Date;
import java.util.NavigableMap;

@Entity
@Table
public class Comentario {

    @Id @GeneratedValue
    @Column(name = "COMENTARIO_ID")
    private Long id;

    @OneToOne(optional = false)
    @Column(name = "CREADOR")
    private Usuario creador;

    @OneToOne
    @Column(name = "PUBLICACION")
    private Publicacion publicacion;

    @Column(name = "FECHA_CREACION")
    private Date fechaCreacion;

    @Column(name = "TEXTO")
    private String texto;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Usuario getCreador() {
        return creador;
    }

    public void setCreador(Usuario creador) {
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

    public Comentario(Usuario creador, Publicacion publicacion, Date fechaCreacion, String texto) {
        this.creador = creador;
        this.publicacion = publicacion;
        this.fechaCreacion = fechaCreacion;
        this.texto = texto;
    }

    public Comentario(){}
}
