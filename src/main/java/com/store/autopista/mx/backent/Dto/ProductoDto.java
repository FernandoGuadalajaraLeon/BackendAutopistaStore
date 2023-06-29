package com.store.autopista.mx.backent.Dto;

public record ProductoDto (Long idProducto, String nombre, double precioCompra, 
		double precioVenta, String detalles, int codigo, ProveedorDto proveedor, int cantidadStock){
	
}
