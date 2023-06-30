package com.store.autopista.mx.backent.Service;

import com.store.autopista.mx.backent.Dto.SegmentoDto;
import com.store.autopista.mx.backent.Entity.Segmento;

public interface SegmentoService {
	
	SegmentoDto save(Segmento segmento);

	SegmentoDto update(Segmento segmento);

	void delete(Segmento segmento);

	SegmentoDto get(Long id);

}
