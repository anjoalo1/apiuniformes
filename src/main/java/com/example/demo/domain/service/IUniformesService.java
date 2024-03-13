package com.example.demo.domain.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.pojo.UniformesPojo;

public interface IUniformesService {
	
List<UniformesPojo> getAll();
	
	Optional<UniformesPojo> getUsuario(Long id);
	
	
	UniformesPojo save(UniformesPojo newUniformes);
	
	
	boolean delete(Long idUniformes);

}
