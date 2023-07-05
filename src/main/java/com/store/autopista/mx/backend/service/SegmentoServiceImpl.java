package com.store.autopista.mx.backend.service;

import com.store.autopista.mx.backend.dto.ProveedorDto;
import com.store.autopista.mx.backend.repository.SegmentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.autopista.mx.backend.dto.SegmentoDto;
import com.store.autopista.mx.backend.entity.Segmento;

@Service
public class SegmentoServiceImpl implements SegmentoService {

	@Autowired
	SegmentoRepository repository;

	@Override
	public SegmentoDto save(Segmento segmento) {

		return new SegmentoDto( repository.save(segmento));
	}

	@Override
	public SegmentoDto update(Segmento segmento) {

		return new SegmentoDto( repository.save(segmento));
	}

	@Override
	public void delete(Segmento segmento) {

		repository.delete(segmento);
	}

	@Override
	public SegmentoDto get(Long id) {

		return repository.findById(id)
				.map(seg -> new SegmentoDto(seg)).orElse(null);
	}

}
