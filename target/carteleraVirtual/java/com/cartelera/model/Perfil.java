package com.cartelera.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Perfil {

    @Id
    @GeneratedValue
    @Column(name = "USUARIO_ID")
    protected Long id;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }


}
