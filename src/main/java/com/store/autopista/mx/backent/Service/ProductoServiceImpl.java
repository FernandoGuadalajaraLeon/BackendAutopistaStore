package com.store.autopista.mx.backent.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.autopista.mx.backent.Dto.ProductoDto;
import com.store.autopista.mx.backent.Entity.Producto;
import com.store.autopista.mx.backent.Repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	ProductoRepository productoRepository;

	@Override
	public ProductoDto save(Producto producto) {
		
		return new ProductoDto( productoRepository.save(producto));
	}

	@Override
	public ProductoDto update(Producto producto) {
		
		Producto prod = productoRepository.findById(producto.getIdProducto()).orElse(null);
		
		prod = producto;
		return new ProductoDto( productoRepository.save(prod));
	}

	@Override
	public void delete(Producto producto) {
		
		productoRepository.delete(producto);
	}

	@Override
	public ProductoDto get(Long id) {
		
		return productoRepository.findById(id)
				.map(prod -> new ProductoDto(prod)).orElse(null);
	}

	@Override
	public ProductoDto getByProveedor(Long id) {
		
		return null;
	}

}
