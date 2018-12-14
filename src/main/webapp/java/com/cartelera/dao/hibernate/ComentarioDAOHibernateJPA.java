package com.cartelera.dao.hibernate;

import com.cartelera.dao.interfaces.ComentarioDAO;
import com.cartelera.model.Comentario;
import org.springframework.stereotype.Repository;

@Repository
public class ComentarioDAOHibernateJPA extends GenericDAOHibernateJPA<Comentario> implements ComentarioDAO{

    public ComentarioDAOHibernateJPA(){
        super(Comentario.class);
    }
}
