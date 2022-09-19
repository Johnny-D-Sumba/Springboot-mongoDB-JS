package com.nazeem.spring.mongo.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nazeem.spring.mongo.api.model.Provincia;

public interface ProvinciaRepository extends MongoRepository<Provincia, String>{
	Optional <List<Provincia>> findByNombre(String nombre);
}
