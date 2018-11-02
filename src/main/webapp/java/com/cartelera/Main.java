package com.cartelera;


import com.cartelera.dao.UsuarioDAO;
import com.cartelera.model.Administrador;
import com.cartelera.model.Alumno;
import com.cartelera.model.Perfil;
import com.cartelera.model.Usuario;

public class Main {

    public static void main(final String[] args) throws Exception {
        Perfil admin = new Administrador();
        Usuario usuario = new Usuario("enci.javier@yahoo.com","1234","javier surita",admin);

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.persistir(usuario);


    }
}