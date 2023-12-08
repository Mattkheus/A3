package com.estoque.bebidas.apirest.models;


import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="TB_SECAO_BEBIDA")

public class SecaoBebida implements Serializable{
	
private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private long idSecaoBebida;
	
	private int numeroDaSecao;
	
	private int volumeTotalSecao;
	
	private int volumeDaBebida;
	
	private String tipoDeBebidaNaSecao;
	
	private int QuantidadeDeCadaBebida;
	
	public SecaoBebida(long l, int i, int j, int k, String string) {
		idSecaoBebida = 1;
		numeroDaSecao = i;
		volumeTotalSecao = j;
		volumeDaBebida = k;
	}

	public SecaoBebida() {
		
	}

	public long getIdSecaoBebida() {
		return idSecaoBebida;
	}

	public void setIdSecaoBebida(long idSecaoBebida) {
		this.idSecaoBebida = idSecaoBebida;
	}

	public int getNumeroDaSecao() {
		return numeroDaSecao;
	}

	public void setNumeroDaSecao(int numeroDaSecao) {
		this.numeroDaSecao = numeroDaSecao;
	}

	public int getVolumeTotalSecao() {
		return volumeTotalSecao;
	}

	public void setVolumeTotalSecao(int volumeTotalSecao) {
		this.volumeTotalSecao = volumeTotalSecao;
	}

	public int getVolumeDaBebida() {
		return volumeDaBebida;
	}

	public void setVolumeDaBebida(int volumeDaBebida) {
		this.volumeDaBebida = volumeDaBebida;
	}

	public String getTipoDeBebidaNaSecao() {
		return tipoDeBebidaNaSecao;
	}

	public void setTipoDeBebidaNaSecao(String tipoDeBebidaNaSecao) {
		this.tipoDeBebidaNaSecao = tipoDeBebidaNaSecao;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getQuantidadeDeCadaBebida() {
		return QuantidadeDeCadaBebida;
	}

	public void setQuantidadeDeCadaBebida(int quantidadeDeCadaBebida) {
		QuantidadeDeCadaBebida = quantidadeDeCadaBebida;
	}

	
		
	}

