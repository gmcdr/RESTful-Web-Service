package com.udemy.nelio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.nelio.domain.Categoria;
import com.udemy.nelio.repositories.CategoriaRepository;

@Service
public class CategoriaService {
		@Autowired
		private CategoriaRepository repository;
	
		public Categoria buscar(Integer id) {
			Categoria obj = repository.getById(id);
			return obj;
		}
}
