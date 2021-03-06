package com.cartelera.dao.hibernate;

import com.cartelera.dao.interfaces.PublicacionDAO;
import com.cartelera.model.Comentario;
import com.cartelera.model.Publicacion;
import org.springframework.stereotype.Repository;

@Repository
public class PublicacionDAOHibernateJPA extends GenericDAOHibernateJPA<Publicacion> implements PublicacionDAO {

    public PublicacionDAOHibernateJPA(){
        super(Publicacion.class);
    }


    public void insertarComentario(Comentario comentario, Publicacion publicacion){
        publicacion.getComentarios().add(comentario);

        actualizar(publicacion);

    }

    public void eliminarComentario(Comentario comentario, Long idPublicacion){
        Publicacion publicacion = recuperar(idPublicacion);
        publicacion.getComentarios().remove(comentario);
        actualizar(publicacion);
    }
}
