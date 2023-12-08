package com.estoque.bebidas.apirest.modelsTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.estoque.bebidas.apirest.models.Bebida;


public class BebidaTest {
  
	
    // Testa se o metodo setIdBebida define corretamente o ID e se o metodo getIdBebida retorna o mesmo ID.
	@Test
    public void testGetIdBebida() {
        Bebida bebida = new Bebida();
        bebida.setIdBebida(1);
        assertEquals(1, bebida.getIdBebida());
    }
    
    // Testa se o metodo setNomeBebida define corretamente o nome e se o metodo getNomeBebida retorna o mesmo nome.
    @Test
    public void testGetNomeBebida() {
        Bebida bebida = new Bebida();
        bebida.setNomeBebida("Coca-Cola");
        assertEquals("Coca-Cola", bebida.getNomeBebida());
    }
    @Test
    public void TestGetMarca() {
    	Bebida bebida = new Bebida();
    	bebida.setMarca("Coca-Cola");
    	assertEquals("Coca-Cola", bebida.getMarca());    		   	
    }
    
    @Test
    public  void TestGetHistoricoEntradaSaida() {
    	Bebida bebida = new Bebida();
    	bebida.setIdBebida(3);
    	assertEquals(1, Bebida.getSerialversionuid());   
	
    }
    
}
