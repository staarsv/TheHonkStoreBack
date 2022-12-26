package com.cmaot.springBootBase.domain;
import java.io.Serializable;
import java.util.Date;

import com.cmaot.springBootBase.shared.domain.BaseAudited;


import lombok.Data;

@Data
public class Pedido extends BaseAudited implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String numero;
	private Date fechaCreacion;
	private Date fechaRecibida;
	
	private double total;
}
