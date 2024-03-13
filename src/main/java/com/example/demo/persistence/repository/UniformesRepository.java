package com.example.demo.persistence.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.pojo.UniformesPojo;
import com.example.demo.domain.repository.IUniformesRepository;
import com.example.demo.persistence.entity.Uniformes;
import com.example.demo.persistence.mapper.IUniformesMapper;

@Repository
public class UniformesRepository implements IUniformesRepository{
	
	private final IUniformesMapper iUniformesMapper;
	private final IUniformesCrudRepository iUniformesCrudRepository;
	
	
	@Autowired
	public UniformesRepository(IUniformesMapper iUniformesMapper, IUniformesCrudRepository iUniformesCrudRepository) {
		super();
		this.iUniformesMapper = iUniformesMapper;
		this.iUniformesCrudRepository = iUniformesCrudRepository;
	}


	@Override
	public List<UniformesPojo> getAll() {
		// TODO Auto-generated method stub
		return iUniformesMapper.toUniformesPojo(iUniformesCrudRepository.findAll());
	}


	@Override
	public Optional<UniformesPojo> getUsuario(Long id) {
		// TODO Auto-generated method stub
		return iUniformesCrudRepository.findById(id).map(Uniformes->iUniformesMapper.toUniformesPojo(Uniformes));
	}


	@Override
	public UniformesPojo save(UniformesPojo newUniformes) {
		// TODO Auto-generated method stub
		
		Uniformes uniformes = iUniformesMapper.toUniformes(newUniformes);
		return iUniformesMapper.toUniformesPojo(iUniformesCrudRepository.save(uniformes));
	}


	@Override
	public void delete(Long idUniformes) {
		// TODO Auto-generated method stub
		iUniformesCrudRepository.deleteById(idUniformes);
	}
	
	

}
