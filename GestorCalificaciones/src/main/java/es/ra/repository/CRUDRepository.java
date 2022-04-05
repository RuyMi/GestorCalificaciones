package es.ra.repository;

import java.util.List;

public interface CRUDRepository<T, ID> {
    List<T> findAll();

    T findById(ID id);

    T save(T entity);

    T update(ID id, T entity);

    T deactivate(ID id);
}

