package com.store.autopista.mx.backent.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.store.autopista.mx.backent.Entity.Producto;
import com.store.autopista.mx.backent.Entity.Proveedor;

public interface ProductoRepository extends CrudRepository<Producto, Long> {

	List<Producto> getByProveedor(Proveedor pr);
}
