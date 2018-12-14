package com.cartelera;


import com.cartelera.dao.hibernate.CarteleraDAOHibernateJPA;
import com.cartelera.dao.hibernate.PublicacionDAOHibernateJPA;
import com.cartelera.dao.hibernate.UsuarioHIbernateJPA;
import com.cartelera.dao.interfaces.PublicacionDAO;
import com.cartelera.dao.interfaces.UsuarioPerfilDAO;
import com.cartelera.model.*;

import java.util.Date;
import java.util.List;

public class Main {

    public static void main(final String[] args) throws Exception {
        UsuarioHIbernateJPA usuarioDao = new UsuarioHIbernateJPA();
        PublicacionDAOHibernateJPA publiDao = new PublicacionDAOHibernateJPA();
        CarteleraDAOHibernateJPA carteleraDao = new CarteleraDAOHibernateJPA();
        Cartelera cartelera = new Cartelera("cartelera 1", "descripcion 1");
        Cartelera cartelera1 = new Cartelera("cartelera 2", "descripcion 1");
        UsuarioPerfil admin = new Administrador("admin@gmail.com", "1234", "don admin");
        Alumno alumno = new Alumno("alumno@gmail.com", "1234", "mister alumno");

        usuarioDao.persistir(admin);
        usuarioDao.persistir(alumno);

        Publicacion publi1 = new Publicacion(new Date(), "titulo", "texto");
        Publicacion publi2 = new Publicacion(new Date(), "titulo2", "texto2");
        Comentario c1 = new Comentario(admin, new Date(), "comentario1");
        Comentario c2 = new Comentario(admin, new Date(), "comentario2");
        Comentario c3 = new Comentario(admin, new Date(), "comentario3");
        publi2.getComentarios().add(c1);
        publi2.getComentarios().add(c2);
        publi1.getComentarios().add(c3);

        cartelera.getPublicaciones().add(publi2);
        carteleraDao.persistir(cartelera);
        cartelera1.getPublicaciones().add(publi1);
        carteleraDao.persistir(cartelera1);

        alumno.getCartelerasSelectas().add(cartelera);
        usuarioDao.actualizar(alumno);
        Alumno alumno1 = (Alumno)usuarioDao.recuperar(alumno.getId());

        Cartelera carteleraTest = carteleraDao.recuperar(cartelera1.getId());
        List<Cartelera> carteleras = carteleraDao.recuperarCarteleras();

        System.out.println(carteleraDao.existe(carteleraTest.getId()));


    }
}
