package com.store.autopista.mx.backent.Entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Ticket implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTicket;
	
	private int idVenta;
	
	private Date fecha;
	
	private Producto producto;
	
	private  int cantidad;
	
	private double precioFinal;
	
	private boolean cancelado;

}
