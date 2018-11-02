package com.cartelera.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Alumno{

    @Id @GeneratedValue
    @Column
    private Long id;

    @OneToMany
    private List<Cartelera> cartelerasSelectas;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void registrarInteres(Cartelera unaCartelera){

    }
    public void comentar(Cartelera unaCartelera,String texto){

    }

    public Alumno(List<Cartelera> cartelerasSelectas) {
        this.cartelerasSelectas = cartelerasSelectas;
    }
}
