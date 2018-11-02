package com.cartelera.model;

import javax.persistence.*;

@Entity
@Table
public class Alumno{

    @Id @GeneratedValue
    @Column
    private Long id;

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

}
