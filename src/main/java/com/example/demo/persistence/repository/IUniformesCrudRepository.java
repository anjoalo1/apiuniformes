package com.example.demo.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.persistence.entity.Uniformes;

public interface IUniformesCrudRepository extends JpaRepository<Uniformes, Long> {

}
