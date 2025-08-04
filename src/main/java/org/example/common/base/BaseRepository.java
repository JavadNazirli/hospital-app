package org.example.common.base;

import java.util.List;
import java.util.Optional;

public interface BaseRepository<T, ID> {
    void save(T entity);

    Optional<T> findById(ID id);

    List<T> findAll();

    void update(T entity);

    void deleteById(ID id);

}
