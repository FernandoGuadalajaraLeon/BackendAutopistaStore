package com.store.autopista.mx.backend.repository;

import org.springframework.data.repository.CrudRepository;

import com.store.autopista.mx.backend.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    Usuario findByNombre(String nombre);

}
