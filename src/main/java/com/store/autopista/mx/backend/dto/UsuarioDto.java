package com.store.autopista.mx.backend.dto;

import com.store.autopista.mx.backend.entity.Tienda;
import com.store.autopista.mx.backend.entity.Usuario;

import java.sql.Date;

public record UsuarioDto (Long isUsuario, String nombre, String apellido, 
		String password, boolean admin, Date fechaAlta, Tienda tienda){

	public UsuarioDto(Usuario usuario){
		this(usuario.getIsUsuario(), usuario.getNombre(), usuario.getApellido(), usuario.getPassword(),
				usuario.isAdmin(), usuario.getFechaAlta(), usuario.getTienda());
	}

}
