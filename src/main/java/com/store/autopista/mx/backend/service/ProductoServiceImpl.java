package com.store.autopista.mx.backend.service;

import com.store.autopista.mx.backend.entity.Proveedor;
import com.store.autopista.mx.backend.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.autopista.mx.backend.dto.ProductoDto;
import com.store.autopista.mx.backend.entity.Producto;
import com.store.autopista.mx.backend.repository.ProductoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	ProductoRepository repository;

	@Autowired
	ProveedorRepository proveedorRepositoryepository;

	@Override
	public ProductoDto save(Producto producto) {
		
		return new ProductoDto( repository.save(producto));
	}

	@Override
	public ProductoDto update(Producto producto) {

		return new ProductoDto( repository.save(producto));
	}

	@Override
	public void delete(Producto producto) {

		repository.delete(producto);
	}

	@Override
	public ProductoDto getById(Long id) {
		
		return repository.findById(id)
				.map(prod -> new ProductoDto(prod)).orElse(null);
	}

	@Override
	public List<ProductoDto> getAll() {
		List<ProductoDto> prodDto = new ArrayList<>();
		repository.findAll().forEach(prod -> prodDto.add(new ProductoDto(prod)));

		return prodDto;
	}

	@Override
	public List<ProductoDto> getByProveedor(Long id) {
		/*List<ProductoDto> prodDto = new ArrayList<>();
		repository.getByProveedor(id).forEach(prod -> prodDto.add(new ProductoDto(prod)));

		return prodDto;*/

		return  repository.getByProveedor(proveedorRepositoryepository.findById(id).orElse( new Proveedor() ))
				.stream().map(producto -> new ProductoDto( producto ))
				.collect(Collectors.toList());

	}

}

