package com.store.autopista.mx.backent.Repository;

import org.springframework.data.repository.CrudRepository;

import com.store.autopista.mx.backent.Entity.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Long> {

}
