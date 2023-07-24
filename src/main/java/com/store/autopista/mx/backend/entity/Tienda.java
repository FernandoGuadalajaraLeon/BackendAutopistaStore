package com.store.autopista.mx.backend.entity;

import java.io.Serializable;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Tienda implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTienda;
	
	private String nombre;
	
	private String ubicacion;

}
