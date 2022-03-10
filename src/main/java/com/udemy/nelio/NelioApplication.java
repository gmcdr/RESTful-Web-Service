package com.udemy.nelio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.udemy.nelio.domain.Categoria;
import com.udemy.nelio.domain.Produto;
import com.udemy.nelio.repositories.CategoriaRepository;
import com.udemy.nelio.repositories.ProdutoRepository;

@SpringBootApplication
public class NelioApplication implements CommandLineRunner  {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private  ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(NelioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria("Informática");
		Categoria cat2 = new Categoria("Escritório");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 800.00);
		
		categoriaRepository.save(cat1);
		categoriaRepository.save(cat2);
		
		produtoRepository.save(p1);
		produtoRepository.save(p2);
		produtoRepository.save(p3);
		
	}

}
