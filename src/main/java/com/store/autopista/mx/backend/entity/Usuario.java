package com.store.autopista.mx.backend.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	
	private String nombre;
	
	private String apellido;
	
	private String password;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Rol> roles;
	
	private Date fechaAlta;
	
	private Tienda tienda;

	private boolean activo;

}
