package com.cartelera.model;

import javax.persistence.*;
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

    public Cartelera nuevaConTituloYDescripcion(String titulo, String descripcion){

        return null;
    }

    public void agregarPublicador(Perfil unPublicador){

    }
    public void agregarPublicacion(Publicacion unaPublicacion){

    }
    public void eliminarPublicacion(Publicacion unaPublicacion){

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
    public void setAlumnosInteresados(List<Alumno> alumnosInteresados) {
        this.alumnosInteresados = alumnosInteresados;
    }

    public Cartelera(String titulo, String descripcion, Date fechaCreacion, List<Alumno> alumnosInteresados) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.alumnosInteresados = alumnosInteresados;
    }
}
