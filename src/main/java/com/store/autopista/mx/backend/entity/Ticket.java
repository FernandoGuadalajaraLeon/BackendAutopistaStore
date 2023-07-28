package com.store.autopista.mx.backend.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.*;

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
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<ItemTicket> items;
	
	private  int cantidad;
	
	private boolean cancelado;
	
	private double precioFinal;
	
	public double getPrecioFinal() {
		precioFinal = 0;
		this.items.forEach(item -> precioFinal += item.getPrecioTotal());
		
		return precioFinal;
	}

}
