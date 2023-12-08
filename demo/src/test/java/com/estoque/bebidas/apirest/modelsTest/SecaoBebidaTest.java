package com.estoque.bebidas.apirest.modelsTest;

import org.junit.jupiter.api.Test;

import com.estoque.bebidas.apirest.models.SecaoBebida;

import static org.junit.jupiter.api.Assertions.*;

public class SecaoBebidaTest {

    // Testa setIdSecaoBebida define corretamente o ID da seção de bebida e se o método getIdSecaoBebida retorna o mesmo ID.
    @Test
    public void testGetSetIdSecaoBebida() {
        SecaoBebida secao = new SecaoBebida();
        secao.setIdSecaoBebida(1L);
        assertEquals(1L, secao.getIdSecaoBebida());
    }

    // Testa setNumeroDaSecao define corretamente o número da seção e se o método getNumeroDaSecao retorna o mesmo número.
    @Test
    public void testGetSetNumeroDaSecao() {
        SecaoBebida secao = new SecaoBebida();
        secao.setNumeroDaSecao(5);
        assertEquals(5, secao.getNumeroDaSecao());
    }

    // Testa setVolumeTotalSecao define corretamente o volume total da seção e se o método getVolumeTotalSecao retorna o mesmo volume.
    @Test
    public void testGetSetVolumeTotalSecao() {
        SecaoBebida secao = new SecaoBebida();
        secao.setVolumeTotalSecao(100);
        assertEquals(100, secao.getVolumeTotalSecao());
    }

    // Testa setVolumeDaBebida define corretamente o volume da bebida na seção e se o método getVolumeDaBebida retorna o mesmo volume.
    @Test
    public void testGetSetVolumeDaBebida() {
        SecaoBebida secao = new SecaoBebida();
        secao.setVolumeDaBebida(50);
        assertEquals(50, secao.getVolumeDaBebida());
    }

    // Testa setTipoDeBebidaNaSecao define corretamente o tipo de bebida na seção e se o método getTipoDeBebidaNaSecao retorna o mesmo tipo de bebida.
    @Test
    public void testGetSetTipoDeBebidaNaSecao() {
        SecaoBebida secao = new SecaoBebida();
        secao.setTipoDeBebidaNaSecao("Refrigerante");
        assertEquals("Refrigerante", secao.getTipoDeBebidaNaSecao());
    }
    @Test
    public void testGetSerialVersionUID() {
        SecaoBebida secao = new SecaoBebida();
        secao.setIdSecaoBebida(1L);
        assertEquals(1L, secao.getSerialversionuid());
    }
    @Test
    public void testGetQuantidadeDeCadaBebida() {
        SecaoBebida secao = new SecaoBebida();
        secao.setQuantidadeDeCadaBebida(2);
        assertEquals(2, secao.getQuantidadeDeCadaBebida());
    }
}
