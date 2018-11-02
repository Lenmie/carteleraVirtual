package com.cartelera.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Cartelera {

    @Id @GeneratedValue
    @Column
    private Long id;

    @Column
    private String titulo;

    @Column
    private String descripcion;

    @Column
    private Date fechaCreacion;

    @OneToMany(mappedBy = "cartelera")
    private List<Alumno> alumnosInteresados;

    @OneToMany
    private List<Publicacion> publicaciones;

    @OneToMany
    private List<Publicador> publicadores;

    public List<Publicador> getPublicadores() {
        return publicadores;
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<Alumno> getAlumnosInteresados() {
        return alumnosInteresados;
    }

    public Cartelera(String titulo, String descripcion){
        this.publicaciones = new ArrayList<Publicacion>();
        this.publicadores = new ArrayList<Publicador>();
        this.alumnosInteresados = new ArrayList<Alumno>();
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public Cartelera(){
        this.publicaciones = new ArrayList<Publicacion>();
        this.publicadores = new ArrayList<Publicador>();
        this.alumnosInteresados = new ArrayList<Alumno>();
    }


}
