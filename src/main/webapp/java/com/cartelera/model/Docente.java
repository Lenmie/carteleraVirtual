package com.cartelera.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Docente extends Perfil {

    @OneToMany
    private List<Cartelera> cartelerasHabilitadas;


    public void habilitarComentarios(){

    }

    public List<Alumno> getAlumnosInteresados(Cartelera unaCartelera){
        return new ArrayList<Alumno>();
    }

    public void crearPublicacion(Cartelera unaCartelera, String titulo, String texto ){

    }

    public void modificarPublicacion(Cartelera unaCartelera, Publicacion unaPublicacion, String nuevoTexto){

    }

    public void eliminarPublicacion(Cartelera unaCartelera, Publicacion unaPublicacion){

    }
}
