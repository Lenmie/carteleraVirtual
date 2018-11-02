package com.cartelera.dao;

import com.cartelera.model.Alumno;
import com.cartelera.model.Cartelera;

public class AlumnoDAO extends GenericDAOHibernateJPA<Alumno>{


    public void addCarteleraSelecta(Cartelera cartelera, Long idAlumno){
        Alumno alumno = recuperar(idAlumno);
        alumno.getCartelerasSelectas().add(cartelera);
        cartelera.getAlumnosInteresados().add(alumno); /* integridad referencial */
        actualizar(alumno);
    }

    public void removeCarteleraSelecta(Cartelera cartelera, Long idAlumno){
        Alumno alumno = recuperar(idAlumno);
        alumno.getCartelerasSelectas().remove(cartelera);
        cartelera.getAlumnosInteresados().remove(alumno); /* integridad referencial */
        actualizar(alumno);
    }


}
