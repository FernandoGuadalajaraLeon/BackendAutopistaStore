package com.store.autopista.mx.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.autopista.mx.backend.dto.UsuarioDto;
import com.store.autopista.mx.backend.entity.Usuario;
import com.store.autopista.mx.backend.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController extends CommonController<UsuarioDto, Usuario, UsuarioService> {

	
}
