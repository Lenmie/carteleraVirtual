package com.cartelera.dao.hibernate;
import com.cartelera.dao.interfaces.UsuarioPerfilDAO;
import com.cartelera.model.UsuarioPerfil;

public class UsuarioHIbernateJPA extends GenericDAOHibernateJPA<UsuarioPerfil> implements UsuarioPerfilDAO {

    public UsuarioHIbernateJPA(){
        super(UsuarioPerfil.class);
    }
}
