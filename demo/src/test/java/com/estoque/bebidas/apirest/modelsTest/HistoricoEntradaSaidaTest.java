package com.estoque.bebidas.apirest.modelsTest;

import org.junit.jupiter.api.Test;


import com.estoque.bebidas.apirest.models.HistoricoEntradaSaida;
import com.estoque.bebidas.apirest.models.SecaoBebida;

import static org.junit.Assert.assertEquals;


import java.time.LocalDate;

public class HistoricoEntradaSaidaTest {

    // Testa setIdRegistroEntrada define corretamente o ID da entrada e se o método getIdRegistroEntrada retorna o mesmo ID.
    @Test
    public void testGetSetIdRegistroEntrada() {
        HistoricoEntradaSaida historico = new HistoricoEntradaSaida();
        historico.setIdRegistroEntrada(1L);
        assertEquals(1L, historico.getIdRegistroEntrada());
    }

    // Testa setDataEntrada define corretamente a data de entrada e se o método getDataEntrada retorna a mesma data.
    @Test
    public void testGetSetDataEntrada() {
        HistoricoEntradaSaida historico = new HistoricoEntradaSaida();
        LocalDate dataEntrada = LocalDate.now();
        historico.setDataEntrada(dataEntrada);
        assertEquals(dataEntrada, historico.getDataEntrada());
    }

    // Testa setHoraEntrada define corretamente a hora de entrada e se o método getHoraEntrada retorna a mesma hora.
    @Test
    public void testGetSetHoraEntrada() {
        HistoricoEntradaSaida historico = new HistoricoEntradaSaida();
        historico.setHoraEntrada("08:00");
        assertEquals("08:00", historico.getHoraEntrada());
    }

    // Testa setResponsavelPelaEntrada define corretamente o responsável pela entrada e se o método getResponsavelPelaEntrada retorna o mesmo responsável.
    @Test
    public void testGetSetResponsavelPelaEntrada() {
        HistoricoEntradaSaida historico = new HistoricoEntradaSaida();
        historico.setResponsavelPelaEntrada("João");
        assertEquals("João", historico.getResponsavelPelaEntrada());
    }

    // Testa setDataSaida define corretamente a data de saída e se o método getDataSaida retorna a mesma data.
    @Test
    public void testGetSetDataSaida() {
        HistoricoEntradaSaida historico = new HistoricoEntradaSaida();
        LocalDate dataSaida = LocalDate.now().plusDays(1);
        historico.setDataSaida(dataSaida);
        assertEquals(dataSaida, historico.getDataSaida());
    }

    // Testa setHoraSaida define corretamente a hora de saída e se o método getHoraSaida retorna a mesma hora.
    @Test
    public void testGetSetHoraSaida() {
        HistoricoEntradaSaida historico = new HistoricoEntradaSaida();
        historico.setHoraSaida("17:00");
        assertEquals("17:00", historico.getHoraSaida());
    }

    // Testa setResponsavelPelaSaida define corretamente o responsável pela saída e se o método getResponsavelPelaSaida retorna o mesmo responsável.
    @Test
    public void testGetSetResponsavelPelaSaida() {
        HistoricoEntradaSaida historico = new HistoricoEntradaSaida();
        historico.setResponsavelPelaSaida("Maria");
        assertEquals("Maria", historico.getResponsavelPelaSaida());
    }
    
    // Testa se o metodo setHistoricoEntradaSaida define corretamente o historico e se o metodo getHistoricoEntradaSaida retorna o mesmo objeto
	@Test
	public void testSetHistoricoEntradaSaida() {
		HistoricoEntradaSaida historico = new HistoricoEntradaSaida();
	    historico.setHistoricoEntradaSaida(historico);
	    assertEquals(historico, historico.getHistoricoEntradaSaida());
	}

    // Testa se o metodo setHistoricoEntradaSaida define corretamente o historico e se o metodo getHistoricoEntradaSaida retorna o mesmo objeto.
    @Test
    public void testGetHistoricoEntradaSaida() {
        HistoricoEntradaSaida historico = new HistoricoEntradaSaida();
        historico.setHistoricoEntradaSaida(historico);
        assertEquals(historico, historico.getHistoricoEntradaSaida());
    }

    	@Test
    	public void testGetResponsavelPelaEntrada() {
            HistoricoEntradaSaida historico = new HistoricoEntradaSaida();
            historico.setResponsavelPelaEntrada("Joao");
            assertEquals(1 , historico.getSerialversionuid());
    
    	}
    	@Test
    	public void testGetResponsavelPelaSaida() {
            HistoricoEntradaSaida historico = new HistoricoEntradaSaida();
            historico.setResponsavelPelaSaida("Maria");
            assertEquals(null , historico.getSecao());
    }
   @Test
   public void testGetSetSecao() {
	   HistoricoEntradaSaida secao = new HistoricoEntradaSaida();
       secao.setSecao("3");
       assertEquals("3", secao.getSecao());
   }
}	
    

