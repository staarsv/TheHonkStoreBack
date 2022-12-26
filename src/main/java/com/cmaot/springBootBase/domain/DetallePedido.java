package com.cmaot.springBootBase.domain;
import java.io.Serializable;
import java.util.Date;

import com.cmaot.springBootBase.shared.domain.BaseAudited;


import lombok.Data;

@Data
public class DetallePedido extends BaseAudited implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer nombre;
	private Integer cantidad;
	private Integer precio;
	private Integer total;

}
