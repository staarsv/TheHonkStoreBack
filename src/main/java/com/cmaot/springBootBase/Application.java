package com.cmaot.springBootBase;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cmaot.springBootBase.domain.Persona;
import com.cmaot.springBootBase.repositories.PersonaRepository;

@SpringBootApplication
public class Application {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}

}
