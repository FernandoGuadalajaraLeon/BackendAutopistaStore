package com.store.autopista.mx.backend.service;

import com.store.autopista.mx.backend.dto.ProveedorDto;
import com.store.autopista.mx.backend.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.autopista.mx.backend.entity.Proveedor;

@Service
public class ProveedorServiceImpl implements ProveedorService {

	@Autowired
	ProveedorRepository repository;

	@Override
	public ProveedorDto save(Proveedor proveedor) {

		return new ProveedorDto( repository.save(proveedor));
	}

	@Override
	public ProveedorDto update(Proveedor proveedor) {

		return new ProveedorDto( repository.save(proveedor));
	}

	@Override
	public void delete(Proveedor proveedor) {

		repository.delete(proveedor);
	}

	@Override
	public ProveedorDto get(Long id) {

		return repository.findById(id)
				.map(prod -> new ProveedorDto(prod)).orElse(null);
	}

}
