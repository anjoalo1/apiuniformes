package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.pojo.UniformesPojo;
import com.example.demo.domain.service.IUniformesService;


@RestController
@RequestMapping(path="/uniformes")
public class UniformesController {
	
	
	private final IUniformesService iUniformesService;

	
	
	public UniformesController(IUniformesService iUniformesService) {
		super();
		this.iUniformesService = iUniformesService;
	}


	@GetMapping
	public ResponseEntity<List<UniformesPojo>> getAll(){
		return ResponseEntity.status(HttpStatus.OK).body(iUniformesService.getAll());
	}
	
	
	@GetMapping(path="/{id}")
	public ResponseEntity<UniformesPojo> getUniforme(@PathVariable Long id){
		return ResponseEntity.of(iUniformesService.getUsuario(id));
	}
	
	@PostMapping
	public ResponseEntity<UniformesPojo> save(@RequestBody UniformesPojo uniformePojoNew){
		return ResponseEntity.status(HttpStatus.CREATED).body(iUniformesService.save(uniformePojoNew));
		
	}
	
	
	@PutMapping
	public ResponseEntity<UniformesPojo> update(@RequestBody UniformesPojo UniformesPojo){
		return ResponseEntity.status(HttpStatus.OK).body(iUniformesService.save(UniformesPojo));
		
	}
	
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable Long id){
		return new ResponseEntity<>(this.iUniformesService.delete(id)? HttpStatus.OK :HttpStatus.NOT_FOUND);
	}
	
	

}
