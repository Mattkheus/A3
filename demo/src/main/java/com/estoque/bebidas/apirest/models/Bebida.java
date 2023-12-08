package com.estoque.bebidas.apirest.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="TB_BEBIDA")
public class Bebida implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idBebida;
	private String marca;
	private String nomeBebida;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	private HistoricoEntradaSaida historicoEntradaSaida;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private SecaoBebida secao;
	
	public Bebida(long l, String string, HistoricoEntradaSaida historico, SecaoBebida secao2) {
		idBebida = l;
		nomeBebida = string;
		historicoEntradaSaida = historico;
		secao = secao2; 
	}

	public Bebida() {
		
	}

	public long getIdBebida() {
		return idBebida;
	}

	public void setIdBebida(long idBebida) {
		this.idBebida = idBebida;
	}

	public String getNomeBebida() {
		return nomeBebida;
	}

	public void setNomeBebida(String nomeBebida) {
		this.nomeBebida = nomeBebida;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public static Bebida save(Bebida bebida) {
		
		return null;
	}

	public static List<Bebida> findAll() {
		
		return null;
	}

	
		
		
	}
	
