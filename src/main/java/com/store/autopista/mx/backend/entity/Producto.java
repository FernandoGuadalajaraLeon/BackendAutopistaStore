package com.store.autopista.mx.backend.entity;

import java.io.Serializable;

import jakarta.persistence.*;

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
	
	@ManyToOne
	private Proveedor proveedor;
	
	private int cantidadStock;
	
}
