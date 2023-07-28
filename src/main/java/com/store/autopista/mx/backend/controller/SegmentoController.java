package com.store.autopista.mx.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.autopista.mx.backend.dto.SegmentoDto;
import com.store.autopista.mx.backend.entity.Segmento;
import com.store.autopista.mx.backend.service.SegmentoService;

@RestController
@RequestMapping("/segmento")
public class SegmentoController extends CommonController<SegmentoDto, Segmento, SegmentoService> {

	
}
