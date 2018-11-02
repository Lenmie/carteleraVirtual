package com.cartelera;

import com.cartelera.dao.CarteleraDAO;
import com.cartelera.model.Cartelera;
import sun.util.calendar.LocalGregorianCalendar;

import java.util.Date;

public class Main {

    public static void main(final String[] args) throws Exception {
        Cartelera cartelera = new Cartelera("titulo1","una Descripcion",new Date());
        CarteleraDAO dao = new CarteleraDAO();
        dao.persistir(cartelera);
        System.out.println("a");
        System.out.println(dao.existe(cartelera.getId()));
    }
}