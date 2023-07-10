package com.store.autopista.mx.backend.controller;

import com.store.autopista.mx.backend.dto.TiendaDto;
import com.store.autopista.mx.backend.entity.Tienda;
import com.store.autopista.mx.backend.service.TiendaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tienda")
public class TiendaController extends CommonController<TiendaDto, Tienda, TiendaService> {

	
}
