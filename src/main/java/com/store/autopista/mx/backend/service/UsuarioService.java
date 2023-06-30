package com.store.autopista.mx.backend.service;

import com.store.autopista.mx.backend.dto.UsuarioDto;
import com.store.autopista.mx.backend.entity.Usuario;

public interface UsuarioService {
	
	UsuarioDto save(Usuario usuario);

	UsuarioDto updateDireccion(Usuario usuario);

	void delete(Usuario usuario);

	UsuarioDto get(Long id);

}
