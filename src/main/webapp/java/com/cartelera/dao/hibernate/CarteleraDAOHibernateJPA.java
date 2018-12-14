package com.cartelera.dao.hibernate;

import com.cartelera.dao.interfaces.CarteleraDAO;
import com.cartelera.model.Cartelera;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
public class CarteleraDAOHibernateJPA extends GenericDAOHibernateJPA<Cartelera> implements CarteleraDAO{

    public CarteleraDAOHibernateJPA(){
        super(Cartelera.class);
    }

    public List<Cartelera> recuperarCarteleras(){
        Query consulta = EMF.getEMF().createEntityManager().createQuery(
                "select cartelera.id, cartelera.titulo, cartelera.descripcion, cartelera.fecha_creacion from cartelera order by cartelera.titulo");
        List<Cartelera> resultado = (List<Cartelera>)consulta.getResultList();
        return resultado;
    }

}






