package com.cmaot.springBootBase.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cmaot.springBootBase.shared.domain.BaseAudited;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class Persona extends BaseAudited implements Serializable {
	private static final long serialVersionUID = 1L;


}
