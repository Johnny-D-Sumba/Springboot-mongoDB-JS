package com.nazeem.spring.mongo.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.nazeem.spring.mongo.api.model.Provincia;
import com.nazeem.spring.mongo.api.repository.ProvinciaRepository;

public class ProvinciaService {

	@Autowired
    private ProvinciaRepository provinciaRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public String save(Provincia provincia){
        provinciaRepository.save(provincia);
        return provincia.getId();
    }
    public Optional<Provincia> findById(String id){
        return provinciaRepository.findById(id);
    }
    public List<Provincia> findByAuthor(String nombre){
        /*Query query  = new Query();
        query.addCriteria(Criteria.where("nombre").regex(".*"+nombre+"*.", "i"));

        List<Provincia> provincias = mongoTemplate.find(query, Provincia.class);
        return provincias;*/
    	List<Provincia> provincia = findAll();
    	return provincia;
    }
    public List<Provincia> findAll(){
        return provinciaRepository.findAll();
    }
    public void deleteById(String id){
        provinciaRepository.deleteById(id);
    }
}
