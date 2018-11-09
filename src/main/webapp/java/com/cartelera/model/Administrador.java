package com.cartelera.model;

import javax.persistence.*;

@Entity
@Table
public class Administrador extends UsuarioPerfil {

    public Administrador() {
    }

    public Administrador(String email, String password, String nombreCompleto) {
        super(email, password, nombreCompleto);
    }
}
