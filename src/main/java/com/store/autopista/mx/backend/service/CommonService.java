package com.store.autopista.mx.backend.service;

import java.util.List;

public interface CommonService<D,E> {
    D save(E entity);

    D update(E entity);

    void delete(E entity);

    D getById(Long id);

}
