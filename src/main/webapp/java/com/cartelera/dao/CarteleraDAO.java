package com.cartelera.dao;
import com.cartelera.model.Alumno;
import com.cartelera.model.Cartelera;
import com.cartelera.model.Publicacion;
import com.cartelera.model.Publicador;

public class CarteleraDAO extends GenericDAOHibernateJPA<Cartelera>{


    public void insertarPublicacion(Publicacion publicacion, Long idCartelera){
        Cartelera cartelera = recuperar(idCartelera);
        cartelera.getPublicaciones().add(publicacion);
        actualizar(cartelera);
    }

    public void eliminarPublicacion(Publicacion publicacion, Long idCartelera){
        Cartelera cartelera = recuperar(idCartelera);
        cartelera.getPublicaciones().remove(publicacion);
        actualizar(cartelera);
    }

    public void insertarPublicador(Publicador publicador, Long idCartelera){
        Cartelera cartelera = recuperar(idCartelera);
        cartelera.getPublicadores().add(publicador);
        actualizar(cartelera);
    }

    public void eliminarPublicador(Publicador publicador, Long idCartelera){
        Cartelera cartelera = recuperar(idCartelera);
        cartelera.getPublicadores().remove(publicador);
        actualizar(cartelera);
    }

    public void insertarAlumnoInteresado(Alumno alumno, Long idCartelera){
        Cartelera cartelera = recuperar(idCartelera);
        cartelera.getAlumnosInteresados().add(alumno);
        actualizar(cartelera);
    }

    public void eliminarAlumnoInteresado(Alumno alumno, Long idCartelera){
        Cartelera cartelera = recuperar(idCartelera);
        cartelera.getAlumnosInteresados().remove(alumno);
        actualizar(cartelera);
    }
}
