package com.store.autopista.mx.backend.repository;

import org.springframework.data.repository.CrudRepository;

import com.store.autopista.mx.backend.entity.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Long> {

}
