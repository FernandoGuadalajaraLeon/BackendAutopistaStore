package com.store.autopista.mx.backend.dto;

import com.store.autopista.mx.backend.entity.Ticket;

import java.sql.Date;

public record TicketDto (Long idTicket, int idVenta, Date fecha, int cantidad, double precioFinal, boolean cancelado){

	public TicketDto(Ticket ticket){
		this(ticket.getIdTicket(), ticket.getIdVenta(), ticket.getFecha(),
				ticket.getCantidad(), ticket.getPrecioFinal(), ticket.isCancelado());
	}
}
