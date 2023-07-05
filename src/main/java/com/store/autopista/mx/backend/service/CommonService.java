package com.store.autopista.mx.backend.service;

public interface CommonService<D,E> {
    D save(E entity);

    D update(E entity);

    void delete(E entity);

    D get(Long id);

}
