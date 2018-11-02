package com.cartelera.dao;


import com.cartelera.model.Cartelera;
import com.cartelera.model.Docente;

public class DocenteDAO extends GenericDAOHibernateJPA<Docente> {

    public void addCarteleraHabilitada(Cartelera cartelera, Long idDocente){
        Docente docente = recuperar(idDocente);
        docente.getCartelerasHabilitadas().add(cartelera);
        actualizar(docente);
    }

    public void removeCarteleraHabilitada(Cartelera cartelera, Long idDocente){
        Docente docente = recuperar(idDocente);
        docente.getCartelerasHabilitadas().remove(cartelera);
        actualizar(docente);
    }
    
}
