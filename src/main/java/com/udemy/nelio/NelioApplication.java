package com.udemy.nelio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.udemy.nelio.domain.Categoria;
import com.udemy.nelio.domain.Cidade;
import com.udemy.nelio.domain.Estado;
import com.udemy.nelio.domain.Produto;
import com.udemy.nelio.repositories.CategoriaRepository;
import com.udemy.nelio.repositories.CidadeRepository;
import com.udemy.nelio.repositories.EstadoRepository;
import com.udemy.nelio.repositories.ProdutoRepository;

@SpringBootApplication
public class NelioApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private CidadeRepository cidadeRepository;

	@Autowired
	private EstadoRepository estadoRepository;

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

		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");

		Cidade c1 = new Cidade(null, "Uberlândia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null, "Campinas", est2);

		// Categoria
		categoriaRepository.save(cat1);
		categoriaRepository.save(cat2);

		// Produto
		produtoRepository.save(p1);
		produtoRepository.save(p2);
		produtoRepository.save(p3);



	}

}
