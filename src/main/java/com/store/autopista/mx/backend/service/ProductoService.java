package com.store.autopista.mx.backend.service;

import com.store.autopista.mx.backend.dto.ProductoDto;
import com.store.autopista.mx.backend.entity.Producto;

import java.util.List;

public interface ProductoService extends CommonService<ProductoDto, Producto> {

	List<ProductoDto> getByProveedor(Long id);

}
