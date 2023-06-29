package com.store.autopista.mx.backent.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Producto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProducto;
	
	private String nombre;
	
	private double precioCompra;
	
	private double precioVenta;
	
	private String detalles;
	
	private int codigo;
	
	private Proveedor proveedor;
	
	private int cantidadStock;
	
}
