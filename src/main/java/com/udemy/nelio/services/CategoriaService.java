package com.udemy.nelio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.nelio.domain.Categoria;
import com.udemy.nelio.repositories.CategoriaRepository;
import com.udemy.nelio.services.excpetions.ObejectNotFoundException;

@Service
public class CategoriaService {
		@Autowired
		private CategoriaRepository repository;
	
		public Categoria buscar(Integer id) {
			Categoria obj = repository.getById(id);
			if (obj == null) {
				throw new ObejectNotFoundException("Obejto não encontrado ! " + id
						+ "Tipo:  " + Categoria.class.getName());
				
			}
			return obj;
		}
}
