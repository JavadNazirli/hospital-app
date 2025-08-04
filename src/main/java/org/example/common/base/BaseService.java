package org.example.common.base;

import java.util.List;
import java.util.Optional;

public interface BaseService<T, ID> {
    T save(T entity);

    T update(ID id, T updatedEntity);

    Optional<T> findById(ID id);

    List<T> findAll();

    void deleteById(ID id);
}
