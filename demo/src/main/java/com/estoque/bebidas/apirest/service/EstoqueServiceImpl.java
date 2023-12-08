package com.estoque.bebidas.apirest.service;

import java.util.List;

import javax.persistence.EntityManager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


import com.estoque.bebidas.apirest.models.Bebida;
import com.estoque.bebidas.apirest.models.HistoricoEntradaSaida;
import com.estoque.bebidas.apirest.models.SecaoBebida;
import com.estoque.bebidas.apirest.repository.EstoqueRepository;

import io.swagger.annotations.ApiOperation;

@Service	
public class EstoqueServiceImpl implements EstoqueService {
	

	@Autowired
	private EstoqueRepository estoqueRepository;
	
	@Autowired
	private EntityManager em;

	
	@ApiOperation(value="Retorna o volume total do estoque por tipo de bebida")
	@GetMapping("/bebidas/{tipo}")
	public List<SecaoBebida> listarVolumeTotalDoEstoquePorTipoDeBebida(String tipo)
	{	
		
		String query = "SELECT SUM(volumeDaBebida) FROM SecaoBebida WHERE tipoDeBebidaNaSecao = '"+tipo+"'";
		List<SecaoBebida> listarVolume = em.createQuery(query).getResultList();
	
		return listarVolume;
		
		
    }
	
	
	@ApiOperation(value=" Volume total de cada Seção ")
	@GetMapping("/bebidas/{numeroSecao}")
	public List<SecaoBebida> listarVolumeDaSecao(int numeroSecao)
	{	
		
		String query = "SELECT SUM(volumeDaBebida) FROM SecaoBebida WHERE numeroDaSecao = '"+numeroSecao+"'";
		List<SecaoBebida> volumeDaSecao = em.createQuery(query).getResultList();
		
		return volumeDaSecao;
    }
	

	
	@ApiOperation(value="Consulta das bebidas armazenadas em cada seção")
	@GetMapping("/bebidas/secao/{secao}")
	public List<SecaoBebida> consultaTipoDeBebidaPorSecao(int secao)
	{
		
		String query = "SELECT s FROM SecaoBebida s WHERE s.numeroDaSecao = '"+secao+"'";
		List<SecaoBebida> listaBebidasArmazenadasPorSecao = em.createQuery(query).getResultList();
		
		return listaBebidasArmazenadasPorSecao;
		
	}
	
	
	@ApiOperation(value="Retorna uma bebida pela seu Nome")
	@GetMapping("/bebidas/{Nome}")
	public List<Bebida> listaBebidaPorNome(String nome)
	{
		String query = "SELECT b FROM Bebida b WHERE b.nomeBebida = '"+nome+"'";
		List<Bebida> listaBebidasPorNome = em.createQuery(query).getResultList();
		
		return listaBebidasPorNome;
		
	}
	


	@ApiOperation(value="Consulta das seções disponíveis para venda de determinado tipo de bebida")
	@GetMapping("/bebidas/consulta/{tipoDeBebida}")
	public List<SecaoBebida> listaSecoesPorTipo(String tipoDeBebida)
	{
		String query = "SELECT s FROM SecaoBebida s WHERE s.tipoDeBebidaNaSecao = '"+tipoDeBebida+"'";
		List<SecaoBebida> listaSecoesQueTemOTipoDeBebidaEsperado = em.createQuery(query).getResultList();
		
		return listaSecoesQueTemOTipoDeBebidaEsperado;
	}
	

	
	@ApiOperation(value="Consulta do histórico de entradas e saídas por tipo de bebida")
	@GetMapping("/bebidas/historico/{tipoHistorico}")
	public List<HistoricoEntradaSaida> consultaHistoricoPorTipo(String tipoHistorico)
	{
		
		String query = "SELECT  h FROM HistoricoEntradaSaida h WHERE secao.tipoDeBebidaNaSecao = '"+tipoHistorico+"'";
		List<HistoricoEntradaSaida> listaHistoricoPorTipo = em.createQuery(query).getResultList();
		
		return listaHistoricoPorTipo;
	}
	

	
	@ApiOperation(value="Consulta do histórico de entradas e saídas por Seção")
	@GetMapping("/bebidas/historico/{secaoHistorico}")
	public List<HistoricoEntradaSaida> consultaHistoricoPorSecao(String secaoHistorico)
	{
		
		String query = "SELECT h FROM HistoricoEntradaSaida h WHERE "+"secao.numeroDaSecao = '"+secaoHistorico+"'";
		List<HistoricoEntradaSaida> listaHistoricoPorSecao = em.createQuery(query).getResultList();
		
		return listaHistoricoPorSecao;
	}




    @ApiOperation(value="Retorna uma bebida pela sua marca ")
    @GetMapping("/bebidas/{marca}")
    public List<Bebida> consultaHistoricoPorMarca(String marca)
{
	
	String query = "SELECT h FROM HistoricoEntradaSaida h WHERE "+"secao.numeroDaSecao = '"+marca+"'";
	List<Bebida> consultaBebidaPorMarca = em.createQuery(query).getResultList();
	
	return consultaBebidaPorMarca;
}
	
	
	
	
	
	@ApiOperation(value="Retorna uma bebida que foi vendida ")
	@GetMapping("/bebidas/{bebida}")
	public List<Bebida> vendaBebida( String bebida)
	
	{
		String query = "SELECT h FROM HistoricoEntradaSaida h WHERE "+"secao.numeroDaSecao = '"+bebida+"'";
		List<Bebida> consultaBebidaPorVenda = em.createQuery(query).getResultList();
		return consultaBebidaPorVenda;

}
	
	@ApiOperation(value="Consulta quantidade de cada bebida  ")
	@GetMapping("/bebidas/{quantidadeBebida}")
	public List<SecaoBebida> QuantidadeDeCadaBebida( int quantidadeBebida) 
		
	{
		
		String query ="SELECT SUM(QuantidadeDeCadaBebida) FROM SecaoBebida WHERE quantidadeBebida = '"+quantidadeBebida+"'";
		List<SecaoBebida> QuantidadeCadaBebida = em.createQuery(query).getResultList();
		return QuantidadeCadaBebida;
		
	}

	@Override
	
	public Bebida save(Bebida bebida) {
		return this.estoqueRepository.save(bebida);
	}


	@Override
	public Bebida cadastraBebida( Bebida bebida)
	{
		return estoqueRepository.save(bebida);
	}
	
	@Override
	public
	List<Bebida> listaBebidas()
	{
		return estoqueRepository.findAll();
	}
	

	@Override
	public List<Bebida> findAll() {
		return this.estoqueRepository.findAll();
	}

}

