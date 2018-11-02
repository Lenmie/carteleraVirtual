package com.cartelera.dao;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;
import java.util.Queue;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class GenericDAOHibernateJPA<T> implements GenericDAO<T> {

    protected Class<T> persistentClass;

    public Class<T> getPersistentClass() {
        return persistentClass;
    }

    public void setPersistentClass(Class<T> persistentClass) {
        this.persistentClass = persistentClass;
    }

    @Override
    public T actualizar(T entity) {
        EntityManager em = EMF.getEMF().createEntityManager();
        EntityTransaction etx = em.getTransaction();
        etx.begin();
        //T entity = em.merge(entity);
        etx.commit();
        em.close();
        return entity;
    }

    @Override
    public void borrar(T entity) {
        EntityManager em = EMF.getEMF().createEntityManager();
        EntityTransaction tx = null;
        try{
            tx = em.getTransaction();
            tx.begin();
            em.remove(entity);
            tx.commit();
        }
        catch(RuntimeException e){
            if (tx != null && tx.isActive()) tx.rollback();
            throw e;
        }
        finally {
            em.close();
        }
    }

    @Override
    public T borrar(Serializable id) {
        T entity = EMF.getEMF().createEntityManager().find(this.persistentClass,id);
        if (entity != null){
            this.borrar(entity);
        }
        return entity;
    }

    @Override
    public boolean existe(Serializable id) {
        T entity = EMF.getEMF().createEntityManager().find(this.persistentClass,id);
        if (entity != null){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public T persistir(T entity) {

        EntityManager em = EMF.getEMF().createEntityManager();
        EntityTransaction tx = null;
        try {
            tx = em.getTransaction();
            tx.begin();
            em.persist(entity);
            tx.commit();
        }
        catch (RuntimeException e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
                throw e;
            }
        }
        finally{
            em.close();
        }
        return entity;
    }

    @Override
    public T recuperar(Serializable id) {
        T entity = EMF.getEMF().createEntityManager().find(this.persistentClass,id);
        return entity;
    }

    public List<T> recuperarTodos(String columnOrder){
        Query consulta = EMF.getEMF().createEntityManager().createQuery(
                "select e from" + getPersistentClass().getSimpleName()+"e order by e."+columnOrder);
        List<T> resultado = (List<T>)consulta.getResultList();
        return resultado;
    }
}
