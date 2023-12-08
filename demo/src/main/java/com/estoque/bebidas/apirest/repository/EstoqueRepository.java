package com.estoque.bebidas.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.estoque.bebidas.apirest.models.Bebida;
import com.estoque.bebidas.apirest.models.SecaoBebida;

@EnableJpaRepositories
public interface EstoqueRepository extends JpaRepository<Bebida, Long>{
	
	   
	public Bebida findById(long id);
	public SecaoBebida save(SecaoBebida secao);
	
}

