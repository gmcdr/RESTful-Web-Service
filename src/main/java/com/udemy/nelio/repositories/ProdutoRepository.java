package com.udemy.nelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.nelio.domain.Produto;

public interface ProdutoRepository  extends JpaRepository<Produto, Integer>{

}
