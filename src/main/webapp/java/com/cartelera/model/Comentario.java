package com.cartelera.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Comentario {

    @Id @GeneratedValue
    @Column
    private Long id;

    @OneToOne(optional = false)
    private Usuario creador;

    @Column
    private Date fechaCreacion;

    @Column
    private String texto;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Perfil getCreador() {
        return creador;
    }

    public void setCreador(Perfil creador) {
        this.creador = creador;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
