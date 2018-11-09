package com.cartelera.dao.hibernate;

import com.cartelera.dao.interfaces.CarteleraDAO;
import com.cartelera.model.Cartelera;

public class CarteleraDAOHibernateJPA extends GenericDAOHibernateJPA<Cartelera> implements CarteleraDAO{

    public CarteleraDAOHibernateJPA(){
        super(Cartelera.class);
    }

}






