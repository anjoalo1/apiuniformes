package com.example.demo.persistence.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.demo.domain.pojo.UniformesPojo;
import com.example.demo.persistence.entity.Uniformes;

@Mapper(componentModel="spring")
public interface IUniformesMapper {
	
	@Mapping(source="id", target="id")
	@Mapping(source="talla", target="talla")
	@Mapping(source="prenda", target="prenda")
	@Mapping(source="precio", target="precio")
	UniformesPojo toUniformesPojo(Uniformes uniformes);
	
	@InheritInverseConfiguration
	Uniformes toUniformes(UniformesPojo uniformesPojo);
	
	List<UniformesPojo> toUniformesPojo(List<Uniformes> uniformes);

}
