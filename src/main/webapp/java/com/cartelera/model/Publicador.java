package com.cartelera.model;

import javax.persistence.*;

@Entity
@Table
public class Publicador extends Perfil{

    @Id @GeneratedValue
    @Column
    private Long id;

    public void publicar(Cartelera unaCartelera){

    }

}
