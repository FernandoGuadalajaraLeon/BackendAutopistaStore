package com.store.autopista.mx.backend.dto;

import java.sql.Date;
import java.util.List;

import com.store.autopista.mx.backend.entity.ItemTicket;
import com.store.autopista.mx.backend.entity.Ticket;

public record TicketDto (Long idTicket, int idVenta, Date fecha, List<ItemTicket> items,
		int cantidad, double precioFinal, boolean cancelado){

	public TicketDto(Ticket ticket){
		this(ticket.getIdTicket(), ticket.getIdVenta(), ticket.getFecha(), ticket.getItems(),
				ticket.getCantidad(), ticket.getPrecioFinal(), ticket.isCancelado());
	}
}
