package com.store.autopista.mx.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.autopista.mx.backend.dto.TicketDto;
import com.store.autopista.mx.backend.entity.Ticket;
import com.store.autopista.mx.backend.service.TicketService;

@RestController
@RequestMapping("/ticket")
public class TicketController extends CommonController<TicketDto, Ticket, TicketService> {

	
}
