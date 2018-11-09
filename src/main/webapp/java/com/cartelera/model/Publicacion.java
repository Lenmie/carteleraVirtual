package com.cartelera.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Publicacion {

    @Id @GeneratedValue
    @Column
    private Long id;

    @Column
    private Date fechaCreacion;

    @Column
    private String titulo;

    @Column
    private String texto;

    @OneToMany//(mappedBy = "publicacion") /* una publicacion tiene 0..* comentarios */
    private List<Comentario> comentarios;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public List<Comentario> getComentarios(){return this.comentarios;}

    public Publicacion(){this.comentarios = new ArrayList<Comentario>();}

    public Publicacion(String titulo, String texto, Date fecha){
        this.comentarios = new ArrayList<Comentario>();
        this.titulo = titulo;
        this.texto = texto;
        this.fechaCreacion = fecha;
    }
}
