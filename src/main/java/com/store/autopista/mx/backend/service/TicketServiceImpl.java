package com.store.autopista.mx.backend.service;

import java.sql.Date;

import com.store.autopista.mx.backend.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.autopista.mx.backend.dto.TicketDto;
import com.store.autopista.mx.backend.entity.Ticket;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketRepository repository;

	@Override
	public TicketDto save(Ticket ticket) {

		return new TicketDto( repository.save(ticket));
	}

	@Override
	public TicketDto update(Ticket ticket) {

		return new TicketDto( repository.save(ticket));
	}

	@Override
	public void delete(Ticket ticket) {
		repository.delete(ticket);
	}

	@Override
	public TicketDto getById(Long id) {

		return repository.findById(id)
				.map(prod -> new TicketDto(prod)).orElse(null);
	}

	@Override
	public TicketDto getByDate(Date date) {

		return null;
	}

	@Override
	public boolean cancelTicket(Long idTicket) {
		Ticket ticket = repository.findById(idTicket).orElse(null);

		if(ticket != null){
			repository.save(ticket);
			return Boolean.TRUE;
		}else return Boolean.FALSE;


	}

}
