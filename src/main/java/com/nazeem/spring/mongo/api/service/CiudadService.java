package com.nazeem.spring.mongo.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.nazeem.spring.mongo.api.model.Ciudad;
import com.nazeem.spring.mongo.api.repository.CiudadRepository;

public class CiudadService {

	@Autowired
    private CiudadRepository ciudadRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public String save(Ciudad ciudad){
        ciudadRepository.save(ciudad);
        return ciudad.getId();
    }
    public Optional<Ciudad> findById(String id){
        return ciudadRepository.findById(id);
    }
    public List<Ciudad> findByAuthor(String nombre){
        /*Query query  = new Query();
        query.addCriteria(Criteria.where("nombre").regex(".*"+nombre+"*.", "i"));

        List<Ciudad> ciudades = mongoTemplate.find(query, Ciudad.class);
        return ciudades;*/
    	List<Ciudad> ciudad = findAll();
    	return ciudad;
    }
    public List<Ciudad> findAll(){
        return ciudadRepository.findAll();
    }
    public void deleteById(String id){
        ciudadRepository.deleteById(id);
    }
}
