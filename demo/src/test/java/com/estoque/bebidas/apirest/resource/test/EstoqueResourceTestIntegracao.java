package com.estoque.bebidas.apirest.resource.test;
import com.estoque.bebidas.apirest.models.Bebida;
import com.estoque.bebidas.apirest.models.HistoricoEntradaSaida;
import com.estoque.bebidas.apirest.models.SecaoBebida;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)


public class EstoqueResourceTestIntegracao {

	@BeforeEach
	public void SetUp() {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	void testedeintegracao() {
		SecaoBebida secao = new SecaoBebida(1L, 1, 1, 1, "Refrigerante");
		
		HistoricoEntradaSaida historico = new HistoricoEntradaSaida(1L, LocalDate.parse("2023-11-28"),"19:43", "Marcelo",LocalDate.parse("2023-11-28"), "19:48", "Marcos");
		
		Bebida bebida = new Bebida(1L, "coca-cola", historico, secao);
		Bebida novabebida = Bebida.save(bebida);
		assertEquals(null, novabebida);
	}
	@Test
	void testeintegracao() {
		SecaoBebida secao = new SecaoBebida(1l, 1, 1, 1, "Refrigerante");
		
		HistoricoEntradaSaida historico = new HistoricoEntradaSaida(1L, LocalDate.parse("2023-11-28"),"19:43", "Marcelo", LocalDate.parse("2023-11-28"), "19:48", "Marcos");
		
		Bebida bebida = new Bebida(1L, "coca-cola", historico, secao);
		List<Bebida> list = new ArrayList<>();
		list.add(bebida);
		
		List<Bebida> result = Bebida.findAll();
		
		assertEquals(null , result);
		
		
	}

    

}


