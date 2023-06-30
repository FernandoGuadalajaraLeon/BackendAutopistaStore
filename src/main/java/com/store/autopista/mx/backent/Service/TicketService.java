package com.store.autopista.mx.backent.Service;

import java.sql.Date;

import com.store.autopista.mx.backent.Dto.TicketDto;
import com.store.autopista.mx.backent.Entity.Ticket;

public interface TicketService {
	
	TicketDto save(Ticket ticket);

	TicketDto update(Ticket ticket);

	void delete(Ticket ticket);

	TicketDto get(Long id);
	
	TicketDto getByDate(Date date);

}
