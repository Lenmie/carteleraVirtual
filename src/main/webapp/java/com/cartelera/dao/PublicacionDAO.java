package com.cartelera.dao;

import com.cartelera.model.Cartelera;
import com.cartelera.model.Comentario;
import com.cartelera.model.Publicacion;

public class PublicacionDAO extends GenericDAOHibernateJPA<Publicacion> {

    public void insertarComentario(Comentario comentario, Long idPublicacion){
        Publicacion publicacion = recuperar(idPublicacion);
        publicacion.getComentarios().add(comentario);
        actualizar(publicacion);
    }

    public void eliminarComentario(Comentario comentario, Long idPublicacion){
        Publicacion publicacion = recuperar(idPublicacion);
        publicacion.getComentarios().remove(comentario);
        actualizar(publicacion);
    }
}
