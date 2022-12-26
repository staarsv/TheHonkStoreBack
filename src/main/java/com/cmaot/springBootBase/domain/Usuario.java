package com.cmaot.springBootBase.domain;

import java.io.Serializable;

import com.cmaot.springBootBase.shared.domain.BaseAudited;


import lombok.Data;

@Data
public class Usuario extends BaseAudited implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nombre;
	private String username;
	private String email;
	private String direccion;
	private String telefono;
	private String tipoUsuario;
	private String password;
}
