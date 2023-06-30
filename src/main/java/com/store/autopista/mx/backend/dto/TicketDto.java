package com.store.autopista.mx.backend.dto;

import java.sql.Date;

public record TicketDto (Long idTicket, int idVenta, Date fecha, ProductoDto producto, 
		int cantidad, double precioFinal, boolean cancelado){
	

}
