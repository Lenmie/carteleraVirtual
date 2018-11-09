package com.cartelera;


import com.cartelera.dao.hibernate.UsuarioHIbernateJPA;
import com.cartelera.model.Administrador;
import com.cartelera.model.UsuarioPerfil;

public class Main {

    public static void main(final String[] args) throws Exception {
        UsuarioPerfil admin = new Administrador("admin@gmail.com","1234","don admin");

        UsuarioHIbernateJPA usuarioDao = new UsuarioHIbernateJPA();
        usuarioDao.persistir(admin);
        System.out.println(usuarioDao.recuperar(1));
    }
}