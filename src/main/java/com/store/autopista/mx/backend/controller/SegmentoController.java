package com.store.autopista.mx.backend.controller;

import com.store.autopista.mx.backend.dto.ProveedorDto;
import com.store.autopista.mx.backend.dto.SegmentoDto;
import com.store.autopista.mx.backend.entity.Proveedor;
import com.store.autopista.mx.backend.entity.Segmento;
import com.store.autopista.mx.backend.service.ProveedorService;
import com.store.autopista.mx.backend.service.SegmentoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/segmento")
public class SegmentoController extends CommonController<SegmentoDto, Segmento, SegmentoService> {

	
}
