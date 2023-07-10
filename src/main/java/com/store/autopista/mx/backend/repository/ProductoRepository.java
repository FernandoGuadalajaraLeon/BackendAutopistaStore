package com.store.autopista.mx.backend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.store.autopista.mx.backend.entity.Producto;
import com.store.autopista.mx.backend.entity.Proveedor;

public interface ProductoRepository extends CrudRepository<Producto, Long> {

	List<Producto> getByProveedor(Proveedor prov);
}
