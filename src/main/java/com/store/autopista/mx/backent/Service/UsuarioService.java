package com.store.autopista.mx.backent.Service;

import com.store.autopista.mx.backent.Dto.UsuarioDto;
import com.store.autopista.mx.backent.Entity.Usuario;

public interface UsuarioService {
	
	UsuarioDto save(Usuario usuario);

	UsuarioDto updateDireccion(Usuario usuario);

	void delete(Usuario usuario);

	UsuarioDto get(Long id);

}
