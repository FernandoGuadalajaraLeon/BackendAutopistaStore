package com.store.autopista.mx.backend.controller;

import com.store.autopista.mx.backend.dto.ProveedorDto;
import com.store.autopista.mx.backend.entity.Proveedor;
import com.store.autopista.mx.backend.service.ProveedorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController extends CommonController<ProveedorDto, Proveedor, ProveedorService> {

	
}
