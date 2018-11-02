package com.cartelera.dao;
import com.cartelera.model.Alumno;
import com.cartelera.model.Cartelera;
import com.cartelera.model.Publicacion;
import com.cartelera.model.Publicador;

public class CarteleraDAO extends GenericDAOHibernateJPA<Cartelera>{


    public void insertarPublicacion(Publicacion publicacion, Long idCartelera){
        Cartelera cartelera = recuperar(idCartelera);
        cartelera.agregarPublicacion(publicacion);
        actualizar(cartelera);
    }

    public void eliminarPublicacion(Publicacion publicacion, Long idCartelera){
        Cartelera cartelera = recuperar(idCartelera);
        cartelera.eliminarPublicacion(publicacion);
        actualizar(cartelera);
    }

    public void insertarPublicador(Publicador publicador, Long idCartelera){
        Cartelera cartelera = recuperar(idCartelera);
        cartelera.agregarPublicador(publicador);
        actualizar(cartelera);
    }

    public void eliminarPublicador(Publicador publicador, Long idCartelera){
        Cartelera cartelera = recuperar(idCartelera);
        cartelera.eliminarPublicador(publicador);
        actualizar(cartelera);
    }

    public void insertarAlumnoInteresado(Alumno alumno, Long idCartelera){
        Cartelera cartelera = recuperar(idCartelera);
        cartelera.addAlumnoInteresado(alumno);
        actualizar(cartelera);
    }

    public void eliminarAlumnoInteresado(Alumno alumno, Long idCartelera){
        Cartelera cartelera = recuperar(idCartelera);
        cartelera.removeAlumnoInteresado(alumno);
        actualizar(cartelera);
    }
}
