package com.estoque.bebidas.apirest.service;

import java.util.List;

import com.estoque.bebidas.apirest.models.Bebida;
import com.estoque.bebidas.apirest.models.HistoricoEntradaSaida;
import com.estoque.bebidas.apirest.models.SecaoBebida;

public interface EstoqueService {

	Bebida cadastraBebida(Bebida bebida);

	List<Bebida> listaBebidas();

	List<SecaoBebida> listarVolumeTotalDoEstoquePorTipoDeBebida(String tipo);

	List<SecaoBebida> listarVolumeDaSecao(int numeroSecao);

	List<SecaoBebida> consultaTipoDeBebidaPorSecao(int secao);

	List<Bebida> listaBebidaPorNome(String nome);

	List<SecaoBebida> listaSecoesPorTipo(String tipoDeBebida);

	List<HistoricoEntradaSaida> consultaHistoricoPorTipo(String tipoHistorico);

	List<HistoricoEntradaSaida> consultaHistoricoPorSecao(String secaoHistorico);
	
	List<Bebida> consultaHistoricoPorMarca(String marca);

	List<Bebida> vendaBebida(String bebida);
	
	List<SecaoBebida> QuantidadeDeCadaBebida(int quantidadeBebida);

	Bebida save(Bebida bebida);

	List<Bebida> findAll();

}