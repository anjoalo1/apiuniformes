package com.example.demo.domain.repository;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.pojo.UniformesPojo;

public interface IUniformesRepository {
	
	
	List<UniformesPojo> getAll();
	
	Optional<UniformesPojo> getUsuario(Long id);
	
	
	UniformesPojo save(UniformesPojo newUniformes);
	
	
	void delete(Long idUniformes);

}
