package com.cartelera.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Alumno extends Perfil{

    @OneToMany(mappedBy = "alumno")
    private List<Cartelera> cartelerasSelectas;

    public Alumno(List<Cartelera> cartelerasSelectas) {
        this.cartelerasSelectas = cartelerasSelectas;
    }

    public List<Cartelera> getCartelerasSelectas() {
        return cartelerasSelectas;
    }

    public void setCartelerasSelectas(List<Cartelera> cartelerasSelectas) {
        this.cartelerasSelectas = cartelerasSelectas;
    }

    public Alumno(){this.cartelerasSelectas = new ArrayList<Cartelera>();}
}
