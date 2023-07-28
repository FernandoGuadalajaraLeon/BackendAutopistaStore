package com.store.autopista.mx.backend.repository;

import com.store.autopista.mx.backend.entity.Producto;
import com.store.autopista.mx.backend.entity.Proveedor;
import com.store.autopista.mx.backend.entity.Segmento;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SegmentoRepository extends CrudRepository<Segmento, Long> {

}
