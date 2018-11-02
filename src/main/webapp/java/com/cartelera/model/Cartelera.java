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

    @OneToMany
    private List<Publicacion> publicaciones;

    @OneToMany
    private List<Publicador> publicadores;

    public List<Publicador> getPublicadores() {
        return publicadores;
    }

    public void setPublicadores(List<Publicador> publicadores) {
        this.publicadores = publicadores;
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }


    public void agregarPublicador(Perfil unPublicador){
        this.publicadores.add((Publicador)unPublicador);

    }

    public void eliminarPublicador(Perfil unPublicador){
        this.publicadores.remove(unPublicador);

    }
    public void agregarPublicacion(Publicacion unaPublicacion){
        this.publicaciones.add(unaPublicacion);

    }
    public void eliminarPublicacion(Publicacion unaPublicacion){
        this.publicaciones.remove(unaPublicacion);
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

    public void addAlumnoInteresado(Alumno alumno){
        this.alumnosInteresados.add(alumno);
    }

    public void removeAlumnoInteresado(Alumno alumno){
        this.alumnosInteresados.remove(alumno);
    }

    public Cartelera(String titulo, String descripcion, Date fechaCreacion, List<Alumno> alumnosInteresados) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.alumnosInteresados = alumnosInteresados;
    }

    public Cartelera(String titulo, String descripcion){
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public Cartelera(){}


}
