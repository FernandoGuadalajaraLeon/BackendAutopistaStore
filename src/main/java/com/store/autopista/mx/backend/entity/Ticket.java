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

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTicket;
	
	private int idVenta;
	
	private Date fecha;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<ItemTicket> items;
	
	private  int cantidad;
	
	private double precioFinal;
	
	private boolean cancelado;

	public Double getTotal(){

		Double total = 0.0;

		for (ItemTicket item:this.items) {
			total += item.getPrecioTotal();
		}

		return total;
	}

	public void addItemProducto(ItemTicket producto){
		this.items.add(producto);
	}
	
	private static final long serialVersionUID = 1L;

}
