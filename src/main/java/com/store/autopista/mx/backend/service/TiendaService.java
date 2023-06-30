package com.store.autopista.mx.backend.service;

import com.store.autopista.mx.backend.dto.TiendaDto;
import com.store.autopista.mx.backend.entity.Tienda;

public interface TiendaService {
	
	TiendaDto save(Tienda tienda);

	TiendaDto updateDireccion(Tienda tienda);

	void delete(Tienda tienda);

	TiendaDto get(Long id);

}
