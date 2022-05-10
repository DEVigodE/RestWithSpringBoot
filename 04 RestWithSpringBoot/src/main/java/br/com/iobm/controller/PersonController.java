package br.com.iobm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.iobm.data.vo.v1.PersonVO;
import br.com.iobm.services.PersonServices;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/person/v1")
@Api(value="",tags={"Exemplo1"})
//@Tag(name = "Exemplo", description = "EXEMPLOOOOOO")
public class PersonController {
	
	@Autowired 
	private PersonServices service;
	
	@GetMapping
	public List<PersonVO> findAll() {
		return service.findAll();
	}	
	
	@GetMapping(value = "/{id}")
	public PersonVO findById(@PathVariable("id") Long id) {
		return service.findById(id);
	}	
	
	@PostMapping
	public PersonVO create(@RequestBody PersonVO person) {
		return service.create(person);
	}
	
	@PutMapping
	public PersonVO update(@RequestBody PersonVO person) {
		return service.update(person);
	}	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		service.delete(id);
		return ResponseEntity.ok().build();
	}	
	
}