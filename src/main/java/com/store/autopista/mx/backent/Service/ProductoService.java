package com.store.autopista.mx.backent.Service;

import com.store.autopista.mx.backent.Dto.ProductoDto;
import com.store.autopista.mx.backent.Entity.Producto;

public interface ProductoService {
	
	ProductoDto save(Producto producto);
	
	ProductoDto update(Producto producto);

	void delete(Producto producto);
	
	ProductoDto get(Long id);
	
	ProductoDto getByProveedor(Long id);

}
