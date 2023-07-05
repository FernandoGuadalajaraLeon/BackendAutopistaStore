package com.store.autopista.mx.backend.service;

import java.sql.Date;

import com.store.autopista.mx.backend.dto.TicketDto;
import com.store.autopista.mx.backend.entity.Ticket;

public interface TicketService extends CommonService<TicketDto, Ticket> {
	
	TicketDto getByDate(Date date);

}
