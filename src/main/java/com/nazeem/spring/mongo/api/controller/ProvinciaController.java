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

import com.nazeem.spring.mongo.api.model.Provincia;
import com.nazeem.spring.mongo.api.service.ProvinciaService;

@RestController
@RequestMapping("/provincia")
public class ProvinciaController {
	@Autowired
	private ProvinciaService provinciaService;

	@PostMapping("/add")
	public String saveBook(@RequestBody Provincia provincia) {
		String id  = provinciaService.save(provincia);
		return "Provincia agregada con id : " + id;
	}

	@GetMapping("/findAll")
	public List<Provincia> getBooks() {
		return provinciaService.findAll();
	}

	@GetMapping("/findByNombre/{nombre}")
	public List<Provincia> findByAuthor( @PathVariable("nombre") String author) {
		return provinciaService.findByAuthor(author);
	}

	@GetMapping("/findAll/{id}")
	public Optional<Provincia> getBook(@PathVariable String id) {
		return provinciaService.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable String id) {
		provinciaService.deleteById(id);
		return "Provincia eliminada con id : " + id;
	}
}
