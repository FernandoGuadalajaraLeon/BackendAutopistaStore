package com.store.autopista.mx.backend.controller;

import com.store.autopista.mx.backend.dto.ProveedorDto;
import com.store.autopista.mx.backend.dto.UsuarioDto;
import com.store.autopista.mx.backend.entity.Proveedor;
import com.store.autopista.mx.backend.entity.Usuario;
import com.store.autopista.mx.backend.service.ProveedorService;
import com.store.autopista.mx.backend.service.UsuarioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proveedor")
public class UsuarioController extends CommonController<UsuarioDto, Usuario, UsuarioService> {

	
}
