package com.nazeem.spring.mongo.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nazeem.spring.mongo.api.model.Ciudad;
import com.nazeem.spring.mongo.api.service.CiudadService;

@RestController
@RequestMapping("/ciudad")
public class CiudadController {
	@Autowired
	private CiudadService ciudadService;

	@PostMapping("/add")
	public String saveBook(@RequestBody Ciudad ciudad) {
		String id  = ciudadService.save(ciudad);
		return "Ciudad agregada con id : " + id;
	}

	@GetMapping("/findAll")
	public List<Ciudad> getBooks() {
		return ciudadService.findAll();
	}

	@GetMapping("/findByNombre/{nombre}")
	public List<Ciudad> findByAuthor( @PathVariable("nombre") String author) {
		return ciudadService.findByAuthor(author);
	}

	@GetMapping("/findAll/{id}")
	public Optional<Ciudad> getBook(@PathVariable String id) {
		return ciudadService.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable String id) {
		ciudadService.deleteById(id);
		return "Ciudad eliminada con id : " + id;
	}
}
