package com.cartelera.model;

import javax.persistence.*;

@Entity
@Table
public class Administrador extends Perfil {

    @Id @GeneratedValue
    @Column
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cartelera crearCartelera(String titulo){

        return null;
    }

    public void eliminarCartelera(Cartelera unaCartelera){

    }

    public void modificarCartelera(Cartelera unaCartelera, String titulo){

    }

    public void crearPublicacion(Cartelera unaCartelera, String titulo, String cuerpo){

    }

    public void eliminarPublicacion(Cartelera unaCartelera,Publicacion unaPublicacion){

    }

    public void asignarPublicador(Perfil unPublicador,Cartelera unaCartelera){

    }

    public void desasignarPublicador(Perfil unPublicador, Cartelera cartelera){

    }

    public void crearAdministrador(String email,String password,String nombreCompleto){

    }

    public void crearPublicador(String email, String password, String nombreCompleto){

    }

}
