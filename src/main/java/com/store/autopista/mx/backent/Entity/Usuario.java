package com.store.autopista.mx.backent.Entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long isUsuario;
	
	private String nombre;
	
	private String apellido;
	
	private String password;
	
	private boolean admin;
	
	private Date fechaAlta;
	
	private Tienda tienda;

}
