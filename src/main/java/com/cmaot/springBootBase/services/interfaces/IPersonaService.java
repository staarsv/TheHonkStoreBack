package com.cmaot.springBootBase.services.interfaces;

import com.cmaot.springBootBase.domain.Persona;

public interface IPersonaService {

	// Create 
	Persona create(Persona persona);

	// Read 
	Iterable findAll();

	Persona findOneById(Long id);

	// Update
	Persona update(Persona empresa, Long id);

	// Delete
	void delete(Long id);
	
	// Other methods 
	
}
