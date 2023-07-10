package com.store.autopista.mx.backend.controller;

import com.store.autopista.mx.backend.dto.TicketDto;
import com.store.autopista.mx.backend.entity.Ticket;
import com.store.autopista.mx.backend.service.TicketService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController extends CommonController<TicketDto, Ticket, TicketService> {

	
}
