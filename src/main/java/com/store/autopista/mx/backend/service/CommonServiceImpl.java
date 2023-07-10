package com.store.autopista.mx.backend.service;

import org.springframework.stereotype.Service;

@Service
public class CommonServiceImpl{
/*public class CommonServiceImpl<D, E, R extends CrudRepository<E, Long>> implements ComonService<D, E> {


    @Autowired
    R repository;

    @Override


    public D save(E entity) {

        return new D( repository.save(entity));
    }

    @Override
    public D update(E entity) {

        return new D( repository.save(entity));
    }

    @Override
    public void delete(E entity) {

        repository.delete(entity);
    }

    @Override
    public D get(Long id) {

        return repository.findById(id)
                .map(prod -> new D(prod)).orElse(null);
    }*/

}
