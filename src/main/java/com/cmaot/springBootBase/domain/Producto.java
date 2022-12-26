package com.cmaot.springBootBase.domain;
import java.io.Serializable;

import com.cmaot.springBootBase.shared.domain.BaseAudited;


import lombok.Data;

@Data
public class Producto  extends BaseAudited implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nombre;
	private String descripcion;
	private String imagen;
	private double precio;
	private int cantidad;
}
