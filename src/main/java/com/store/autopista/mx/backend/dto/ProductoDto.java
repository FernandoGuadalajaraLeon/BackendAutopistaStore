package com.store.autopista.mx.backend.dto;

import com.store.autopista.mx.backend.entity.Producto;
import com.store.autopista.mx.backend.entity.Proveedor;


public record ProductoDto (Long idProducto, String nombre, double precioCompra, 
		double precioVenta, String detalles, int codigo, Proveedor proveedor, int cantidadStock){

	public ProductoDto(Producto prod){
		this(prod.getIdProducto(), prod.getNombre(), prod.getPrecioCompra(), prod.getPrecioVenta(),
				prod.getDetalles(), prod.getCodigo(), prod.getProveedor(), prod.getCantidadStock());
	}

}
