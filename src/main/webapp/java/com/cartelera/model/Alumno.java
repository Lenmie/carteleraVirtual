package com.cartelera.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Alumno extends Perfil{

    @OneToMany(mappedBy = "alumno")
    private List<Cartelera> cartelerasSelectas;

    @Column(name="MEDIOS")
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

    public Alumno(List<Cartelera> cartelerasSelectas, List<String> mediosComunicacion) {
        this.cartelerasSelectas = cartelerasSelectas;
        this.mediosComunicacion = mediosComunicacion;
    }

    public Alumno(){this.cartelerasSelectas = new ArrayList<Cartelera>();}
}
