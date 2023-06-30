package com.store.autopista.mx.backend.service;

import com.store.autopista.mx.backend.dto.ProductoDto;
import com.store.autopista.mx.backend.entity.Producto;

public interface ProductoService {
	
	ProductoDto save(Producto producto);
	
	ProductoDto update(Producto producto);

	void delete(Producto producto);
	
	ProductoDto get(Long id);
	
	ProductoDto getByProveedor(Long id);

}
