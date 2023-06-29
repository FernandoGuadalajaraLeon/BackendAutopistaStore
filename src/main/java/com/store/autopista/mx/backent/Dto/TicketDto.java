package com.store.autopista.mx.backent.Dto;

import java.sql.Date;

public record TicketDto (Long idTicket, int idVenta, Date fecha, ProductoDto producto, 
		int cantidad, double precioFinal, boolean cancelado){
	

}
