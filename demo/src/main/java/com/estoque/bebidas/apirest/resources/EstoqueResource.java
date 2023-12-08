package com.estoque.bebidas.apirest.resources;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.estoque.bebidas.apirest.models.Bebida;


import com.estoque.bebidas.apirest.service.EstoqueService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API - Estoque de Bebidas")
public class EstoqueResource {
	
	@Autowired
	private EstoqueService estoqueService;
	
	
	
	@ApiOperation(value="Cadastra uma bebida")
	@PostMapping("/bebidas")
	public Bebida cadastraBebida(Bebida bebida) {

		return estoqueService.save(bebida);
	}
	
	@ApiOperation(value="Retorna todas as bebidas")
	@GetMapping("/bebidas/todas")
	public
	List<Bebida> listaBebidas()
	{
		return estoqueService.findAll();
	}
	

		
	}
	
