package com.store.autopista.mx.backend.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.*;

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
	
	private String username;
	
	private String nombre;
	
	private String apellido;
	
	private String password;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private List<Role> roles;
	
	private Date fechaAlta;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Tienda tienda;

	private boolean activo;

}
