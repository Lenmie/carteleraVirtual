package com.cartelera.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Alumno extends UsuarioPerfil{

    @OneToMany
    private List<Cartelera> cartelerasSelectas;

    @ElementCollection
    private List<String> mediosComunicacion;

    public List<String> getMediosComunicacion() {
        return mediosComunicacion;
    }

    public void setMediosComunicacion(List<String> mediosComunicacion) {
        this.mediosComunicacion = mediosComunicacion;
    }

    public Alumno(List<Cartelera> cartelerasSelectas) {
        this.cartelerasSelectas = cartelerasSelectas;
    }

    public List<Cartelera> getCartelerasSelectas() {
        return cartelerasSelectas;
    }

    public Alumno(String email, String password, String nombreCompleto, List<Cartelera> cartelerasSelectas, List<String> mediosComunicacion) {
        super(email, password, nombreCompleto);
        this.cartelerasSelectas = cartelerasSelectas;
        this.mediosComunicacion = mediosComunicacion;
    }

    public Alumno(){

    }
}
