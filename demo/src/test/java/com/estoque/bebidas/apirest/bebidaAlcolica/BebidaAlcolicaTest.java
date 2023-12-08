package com.estoque.bebidas.apirest.bebidaAlcolica;
import static org.junit.Assert.assertEquals;
import org.junit.Test;




public class BebidaAlcolicaTest {
	@Test
    public void testGetIdBebida() {
        BebidaAlcolica bebidaAlcolica = new BebidaAlcolica();
        bebidaAlcolica.setIdBebidaAlcolica(1);
        assertEquals(1, bebidaAlcolica.getIdBebidaAlcolica());
    }
	@Test
    public void testGetCerveja() {
        BebidaAlcolica bebidaAlcolica = new BebidaAlcolica();
        bebidaAlcolica.setCerveja("cerveja");
        assertEquals("cerveja", bebidaAlcolica.getCerveja());
    }
	@Test
    public void testGetVinho() {
        BebidaAlcolica bebidaAlcolica = new BebidaAlcolica();
        bebidaAlcolica.setVinho("vinho");
        assertEquals("vinho", bebidaAlcolica.getVinho());
    }
	@Test
    public void testGetWhisky() {
        BebidaAlcolica bebidaAlcolica = new BebidaAlcolica();
        bebidaAlcolica.setWhisky("whisky");
        assertEquals("whisky", bebidaAlcolica.getWhisky());
    }
	@Test
    public void testGetSerialversionuid() {
        BebidaAlcolica bebidaAlcolica = new BebidaAlcolica();
        bebidaAlcolica.setIdBebidaAlcolica(1);
        assertEquals(1, bebidaAlcolica.getSerialversionuid());
    }
}
