package es.ra.repository;

import es.ra.models.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class AlumnoRepository implements IAlumnoRepository {
    private final TreeMap<Integer, Alumno> alumno = new TreeMap<>();

    /**
     * Encuentra un alumno por su nombre
     *
     * @param nombre nombre del pais
     * @return el pais encontrado o null si no lo encuentra
     */
    public Alumno findByNombre(String nombre) {
        for (Alumno alumno : this.alumno.values()) {
            if (alumno.getNombre().equals(nombre))
                return alumno;
        }
        return null;
    }

    /**
     * Encuentra un alumno por su id
     *
     * @param id id del alumno
     * @return el alumno encontrado o null si no lo encuentra
     */
    @Override
    public Alumno findById(Integer id) {
        return this.alumno.get(id);
    }

    /**
     * Devuelve todos los alumnos
     *
     * @return lista de alumnos
     */
    @Override
    public List<Alumno> findAll() {
        return new ArrayList<>(this.alumno.values());
    }

    /**
     * Añade un pais
     *
     * @param alumno alumno a añadir
     */
    @Override
    public Alumno save(Alumno alumno) {
        this.alumno.put(alumno.getId(), alumno);
        return alumno;
    }

    /**
     * Modifica un alumno
     *
     * @param id   id del alumno a modificar
     * @param alumno alumno con los nuevos datos
     * @return el alumno modificado
     */
    @Override
    public Alumno update(Integer id, Alumno alumno) {
        this.alumno.put(id, alumno);
        return alumno;
    }

    /**
     * Elimina un alumno dado el id
     *
     * @param id id del pais a eliminar
     * @return el pais eliminado o null si no lo encuentra
     */
    @Override
    public Alumno deactivate(Integer id) {
        return this.alumno;
    }



}
