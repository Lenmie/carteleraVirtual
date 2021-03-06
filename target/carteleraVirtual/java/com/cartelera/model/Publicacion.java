package com.cartelera.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Publicacion {

    @Id @GeneratedValue
    @Column(name = "PUBLICACION_ID")
    private Long id;

    @Column(name = "FECHA_CREACION")
    private Date fechaCreacion;

    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "TEXTO")
    private String texto;

    @OneToMany(mappedBy = "publicacion") /* una publicacion tiene 0..* comentarios */
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

    public void addComentario(Comentario comment){
        this.comentarios.add(comment);
    }

    public void removeComentario(Comentario comment){
        this.comentarios.remove(comment);
    }


}
