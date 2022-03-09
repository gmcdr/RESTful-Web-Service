package com.udemy.nelio.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.nelio.domain.Categoria;
import com.udemy.nelio.repositories.CategoriaRepository;
import com.udemy.nelio.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CetegoriaResource {
		
	
		@Autowired
		private CategoriaService service;
		
		@Autowired
		private CategoriaRepository repository;
	
	
		@RequestMapping(value="{id}", method=RequestMethod.GET)
		public ResponseEntity<?> find(@PathVariable Integer id) {
			
			repository.save(new Categoria("Informática"));
			
			
			Categoria obj = service.buscar(id);
			return ResponseEntity.ok().body(obj);
		}
}
