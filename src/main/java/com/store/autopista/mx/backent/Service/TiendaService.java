package com.store.autopista.mx.backent.Service;

import com.store.autopista.mx.backent.Dto.TiendaDto;
import com.store.autopista.mx.backent.Entity.Tienda;

public interface TiendaService {
	
	TiendaDto save(Tienda tienda);

	TiendaDto updateDireccion(Tienda tienda);

	void delete(Tienda tienda);

	TiendaDto get(Long id);

}
