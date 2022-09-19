package com.nazeem.spring.mongo.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nazeem.spring.mongo.api.model.Ciudad;

public interface CiudadRepository extends MongoRepository<Ciudad, String>{
	Optional <List<Ciudad>> findByNombre(String nombre);
}
