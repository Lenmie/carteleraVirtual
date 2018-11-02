package com.cartelera.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Docente extends Perfil {

    @OneToMany
    private List<Cartelera> cartelerasHabilitadas;

    public List<Cartelera> getCartelerasHabilitadas() {
        return cartelerasHabilitadas;
    }

    public void setCartelerasHabilitadas(List<Cartelera> cartelerasHabilitadas) {
        this.cartelerasHabilitadas = cartelerasHabilitadas;
    }

    public List<Alumno> getAlumnosInteresados(Cartelera unaCartelera){
        return new ArrayList<Alumno>();
    }

    public Docente(){this.cartelerasHabilitadas = new ArrayList<Cartelera>();}


}
