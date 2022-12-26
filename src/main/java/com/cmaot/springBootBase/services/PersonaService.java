package com.cmaot.springBootBase.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmaot.springBootBase.domain.Persona;
import com.cmaot.springBootBase.repositories.PersonaRepository;
import com.cmaot.springBootBase.services.interfaces.IPersonaService;
import com.cmaot.springBootBase.shared.Utiles;

public class PersonaService implements IPersonaService {

	@Override
	public Persona create(Persona persona) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona findOneById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona update(Persona empresa, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
