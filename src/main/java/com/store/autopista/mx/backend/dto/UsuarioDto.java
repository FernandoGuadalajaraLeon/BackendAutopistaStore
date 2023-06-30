package com.store.autopista.mx.backend.dto;

import java.sql.Date;

public record UsuarioDto (Long isUsuario, String nombre, String apellido, 
		String password, boolean admin, Date fechaAlta, TiendaDto tienda){



}
