package com.store.autopista.mx.backend.dto;

import com.store.autopista.mx.backend.entity.Rol;
import com.store.autopista.mx.backend.entity.Tienda;
import com.store.autopista.mx.backend.entity.Usuario;

import java.sql.Date;
import java.util.List;

public record UsuarioDto (Long isUsuario, String nombre, String apellido,
						  String password, List<Rol> roles, Date fechaAlta, Tienda tienda){

	public UsuarioDto(Usuario usuario){
		this(usuario.getIdUsuario(), usuario.getNombre(), usuario.getApellido(), usuario.getPassword(),
				usuario.getRoles(), usuario.getFechaAlta(), usuario.getTienda());
	}

}
