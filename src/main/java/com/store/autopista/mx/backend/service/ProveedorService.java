package com.store.autopista.mx.backend.service;

import com.store.autopista.mx.backend.dto.ProveedorDto;
import com.store.autopista.mx.backend.entity.Proveedor;

public interface ProveedorService {

	ProveedorDto save(Proveedor proveedor);

	ProveedorDto update(Proveedor proveedor);

	void delete(Proveedor proveedor);

	ProveedorDto get(Long id);

}
