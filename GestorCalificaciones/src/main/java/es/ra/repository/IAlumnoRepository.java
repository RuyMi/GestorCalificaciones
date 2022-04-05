package es.ra.repository;

import es.ra.models.Alumno;

public interface IAlumnoRepository extends CRUDRepository<Alumno, Integer> {

        Alumno findByNombre(String nombre);



    }

