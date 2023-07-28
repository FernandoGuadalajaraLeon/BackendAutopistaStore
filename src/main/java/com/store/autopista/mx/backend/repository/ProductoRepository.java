package com.store.autopista.mx.backend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.store.autopista.mx.backend.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long> {

	List<Producto> getByProveedor(Long id);
}
