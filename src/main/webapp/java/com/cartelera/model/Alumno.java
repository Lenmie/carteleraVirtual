package com.cartelera.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Alumno extends Perfil{

    @OneToMany(mappedBy = "alumno")
    private List<Cartelera> cartelerasSelectas;


    public void registrarInteres(Cartelera unaCartelera){

    }
    public void comentar(Cartelera unaCartelera,String texto){

    }
    public Alumno(List<Cartelera> cartelerasSelectas) {
        this.cartelerasSelectas = cartelerasSelectas;
    }

    public List<Cartelera> getCartelerasSelectas() {
        return cartelerasSelectas;
    }

    public void setCartelerasSelectas(List<Cartelera> cartelerasSelectas) {
        this.cartelerasSelectas = cartelerasSelectas;
    }
}
