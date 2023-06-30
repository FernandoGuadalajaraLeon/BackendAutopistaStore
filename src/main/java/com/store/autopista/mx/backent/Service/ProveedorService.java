package com.store.autopista.mx.backent.Service;

import com.store.autopista.mx.backent.Dto.ProveedorDto;
import com.store.autopista.mx.backent.Entity.Proveedor;

public interface ProveedorService {

	ProveedorDto save(Proveedor proveedor);

	ProveedorDto update(Proveedor proveedor);

	void delete(Proveedor proveedor);

	ProveedorDto get(Long id);

}
