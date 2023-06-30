package com.store.autopista.mx.backend.service;

import com.store.autopista.mx.backend.dto.SegmentoDto;
import com.store.autopista.mx.backend.entity.Segmento;

public interface SegmentoService {
	
	SegmentoDto save(Segmento segmento);

	SegmentoDto update(Segmento segmento);

	void delete(Segmento segmento);

	SegmentoDto get(Long id);

}
