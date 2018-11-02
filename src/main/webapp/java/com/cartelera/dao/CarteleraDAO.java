package com.cartelera.dao;
import com.cartelera.model.Cartelera;
import com.cartelera.model.Publicacion;

public class CarteleraDAO extends GenericDAOHibernateJPA<Cartelera>{


    public void insertarPublicacion(Publicacion publicacion, Long idCartelera){
        Cartelera cartelera = recuperar(idCartelera);
        cartelera.agregarPublicacion(publicacion);
        actualizar(cartelera);
    }
}
