package com.estoque.bebidas.apirest.service.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.estoque.bebidas.apirest.models.Bebida;
import com.estoque.bebidas.apirest.models.HistoricoEntradaSaida;
import com.estoque.bebidas.apirest.models.SecaoBebida;
import com.estoque.bebidas.apirest.repository.EstoqueRepository;
import com.estoque.bebidas.apirest.service.EstoqueServiceImpl;

public class EstoqueServiceImplTest {

    @Mock
    private EstoqueRepository estoqueRepository;

    @Mock
    private EntityManager entityManager;

    @InjectMocks
    private EstoqueServiceImpl estoqueServiceImpl;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
	
    @Test
    public void testlistarVolumeTotalDoEstoquePorTipoDeBebida() {
        String tipo = "bebidas";
        Query queryMock = mock(Query.class);

        when(entityManager.createQuery(anyString())).thenReturn(queryMock);
        when(queryMock.getResultList()).thenReturn(Collections.emptyList());

        List<SecaoBebida> result = estoqueServiceImpl.listarVolumeTotalDoEstoquePorTipoDeBebida(tipo);

        assertEquals(Collections.emptyList(), result);
    }
    
    
    // Testa listarVolumeDaSecao verificando se retorna uma lista vazia quando a query retorna vazio.
    @Test
    public void testListarVolumeDaSecao() {
        int numeroSecao = 1;
        Query queryMock = mock(Query.class);

        when(entityManager.createQuery(anyString())).thenReturn(queryMock);
        when(queryMock.getResultList()).thenReturn(Collections.emptyList());

        List<SecaoBebida> result = estoqueServiceImpl.listarVolumeDaSecao(numeroSecao);

        assertEquals(Collections.emptyList(), result);
    }

    // Testa consultaTipoDeBebidaPorSecao verificando se retorna uma lista vazia quando a query retorna vazio.
       @Test
       public void testConsultaTipoDeBebidaPorSecao() {
           int secao = 1;
           Query queryMock = mock(Query.class);

           when(entityManager.createQuery(anyString())).thenReturn(queryMock);
           when(queryMock.getResultList()).thenReturn(Collections.emptyList());

           List<SecaoBebida> result = estoqueServiceImpl.consultaTipoDeBebidaPorSecao(secao);

           assertEquals(Collections.emptyList(), result);
    }

    // Testa listaBebidaPorNome verificando se retorna uma lista vazia quando a query retorna vazio.
       @Test
       public void testListaBebidaPorNome() {
         String nome = "nome_da_bebida";
         Query queryMock = mock(Query.class);

         when(entityManager.createQuery(anyString())).thenReturn(queryMock);
         when(queryMock.getResultList()).thenReturn(Collections.emptyList());

         List<Bebida> result = estoqueServiceImpl.listaBebidaPorNome(nome);

         assertEquals(Collections.emptyList(), result);
    }

    // Testa listaSecoesPorTipo verificando se retorna uma lista vazia quando a query retorna vazio.
       @Test
       public void testListaSecoesPorTipo() {
       String tipoDeBebida = "tipo_de_bebida";
       Query queryMock = mock(Query.class);

       when(entityManager.createQuery(anyString())).thenReturn(queryMock);
       when(queryMock.getResultList()).thenReturn(Collections.emptyList());

       List<SecaoBebida> result = estoqueServiceImpl.listaSecoesPorTipo(tipoDeBebida);

       assertEquals(Collections.emptyList(), result);
    }

    // Testa consultaHistoricoPorTipo verificando se retorna uma lista vazia quando a query retorna vazio.
       @Test
       public void testConsultaHistoricoPorTipo() {
       String tipoHistorico = "tipo_historico";
       Query queryMock = mock(Query.class);

       when(entityManager.createQuery(anyString())).thenReturn(queryMock);
       when(queryMock.getResultList()).thenReturn(Collections.emptyList());

       List<HistoricoEntradaSaida> result = estoqueServiceImpl.consultaHistoricoPorTipo(tipoHistorico);

       assertEquals(Collections.emptyList(), result);
    }

    // Testa consultaHistoricoPorSecao verificando se retorna uma lista vazia quando a query retorna vazio.
       @Test
       public void testConsultaHistoricoPorSecao() {
       String secaoHistorico = "secao_historico";
       Query queryMock = mock(Query.class);

       when(entityManager.createQuery(anyString())).thenReturn(queryMock);
       when(queryMock.getResultList()).thenReturn(Collections.emptyList());

       List<HistoricoEntradaSaida> result = estoqueServiceImpl.consultaHistoricoPorSecao(secaoHistorico);
       
       assertEquals(Collections.emptyList(), result);
       }

       
       @Test
       public void testConsultaHistoricoPorMarca() {
       String Bebida = "marca";
       Query queryMock = mock(Query.class);

       when(entityManager.createQuery(anyString())).thenReturn(queryMock);
       when(queryMock.getResultList()).thenReturn(Collections.emptyList());

       List<Bebida> result = estoqueServiceImpl.consultaHistoricoPorMarca(Bebida);
       
       assertEquals(Collections.emptyList(), result);
       }
       
       @Test
       public void testvendaBebida() {
       String bebida = "bebidas";
       Query queryMock = mock(Query.class);

       when(entityManager.createQuery(anyString())).thenReturn(queryMock);
       when(queryMock.getResultList()).thenReturn(Collections.emptyList());

       List<Bebida> result = estoqueServiceImpl.vendaBebida(bebida);
       
       assertEquals(Collections.emptyList(), result);
       }
       @Test
       public void testQuantidadeDeCadaBebida() {
           int quantidadeBebida = 1;
           Query queryMock = mock(Query.class);

           when(entityManager.createQuery(anyString())).thenReturn(queryMock);
           when(queryMock.getResultList()).thenReturn(Collections.emptyList());

           List<SecaoBebida> result = estoqueServiceImpl.QuantidadeDeCadaBebida(quantidadeBebida);

           assertEquals(Collections.emptyList(), result);
       }
       
       
	@Test
	void test() {
		
	}
    
    	 
    	 
    	 
     }

