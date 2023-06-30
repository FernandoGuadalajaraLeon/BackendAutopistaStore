package com.store.autopista.mx.backend.service;

import java.sql.Date;

import com.store.autopista.mx.backend.dto.TicketDto;
import com.store.autopista.mx.backend.entity.Ticket;

public interface TicketService {
	
	TicketDto save(Ticket ticket);

	TicketDto update(Ticket ticket);

	void delete(Ticket ticket);

	TicketDto get(Long id);
	
	TicketDto getByDate(Date date);

}
