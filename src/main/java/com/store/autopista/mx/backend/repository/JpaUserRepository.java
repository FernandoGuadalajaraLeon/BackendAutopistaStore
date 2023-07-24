package com.store.autopista.mx.backend.repository;

import org.springframework.data.repository.CrudRepository;

import com.store.autopista.mx.backend.entity.Usuario;

public interface JpaUserRepository extends CrudRepository<Usuario, Long> {
	
	Usuario findByUsername(String Username);

}
