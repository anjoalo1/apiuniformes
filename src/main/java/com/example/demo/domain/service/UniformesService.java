package com.example.demo.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.domain.pojo.UniformesPojo;
import com.example.demo.domain.repository.IUniformesRepository;

@Service
public class UniformesService implements IUniformesService{
	
	private final IUniformesRepository iUniformesRepository;
	
	

	public UniformesService(IUniformesRepository iUniformesRepository) {
		super();
		this.iUniformesRepository = iUniformesRepository;
	}

	@Override
	public List<UniformesPojo> getAll() {
		// TODO Auto-generated method stub
		return iUniformesRepository.getAll();
	}

	@Override
	public Optional<UniformesPojo> getUsuario(Long id) {
		// TODO Auto-generated method stub
		return iUniformesRepository.getUsuario(id);
	}

	@Override
	public UniformesPojo save(UniformesPojo newUniformes) {
		// TODO Auto-generated method stub
		return iUniformesRepository.save(newUniformes);
	}

	@Override
	public boolean delete(Long idUniformes) {
		// TODO Auto-generated method stub
		try {
			iUniformesRepository.delete(idUniformes);
			return true;
		}catch(Exception e){
			return false;
		}
	}

}
