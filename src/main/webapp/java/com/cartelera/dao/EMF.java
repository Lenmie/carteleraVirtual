package com.cartelera.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMF {

    private static final EntityManagerFactory em = Persistence.createEntityManagerFactory("aplicacion");

    public static EntityManagerFactory getEMF(){
        return em;
    }
}
