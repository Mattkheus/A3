package com.estoque.bebidas.apirest.models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TB_HISTORICO_ENTRADA_SAIDA")
public class HistoricoEntradaSaida implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private long idRegistroEntrada;
	
	private LocalDate dataEntrada;
	
	private String horaEntrada;

	private String responsavelPelaEntrada;
	
	private LocalDate dataSaida;
	
	private String horaSaida;
	
	private String responsavelPelaSaida;
	
	@OneToOne(cascade=CascadeType.ALL)
	private String secao;

	private HistoricoEntradaSaida historicoEntradaSaida;
	
	public HistoricoEntradaSaida(Long l, LocalDate parse, String string, String string2, LocalDate parse2,
			String string3, String string4) {
		idRegistroEntrada = l;
		dataEntrada = parse;
		horaEntrada = string;
		responsavelPelaEntrada = string2;
		dataSaida = parse2;
		horaSaida = string3;
		responsavelPelaSaida = string4;
		
	}
	
	public HistoricoEntradaSaida() {
		
	}

	public String getSecao() {
		return secao;
	}

	public void setSecao(String secao) {
		this.secao = secao;
	}

	public long getIdRegistroEntrada() {
		return idRegistroEntrada;
	}

	public void setIdRegistroEntrada(long idRegistroEntrada) {
		this.idRegistroEntrada = idRegistroEntrada;
	}

	public String getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public String getResponsavelPelaEntrada() {
		return responsavelPelaEntrada;
	}

	public void setResponsavelPelaEntrada(String responsavelPelaEntrada) {
		this.responsavelPelaEntrada = responsavelPelaEntrada;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}

	public String getResponsavelPelaSaida() {
		return responsavelPelaSaida;
	}

	public void setResponsavelPelaSaida(String responsavelPelaSaida) {
		this.responsavelPelaSaida = responsavelPelaSaida;
	}
	
	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public LocalDate getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}

	public HistoricoEntradaSaida getHistoricoEntradaSaida() {
		return this.historicoEntradaSaida;
	}

	public void setHistoricoEntradaSaida(HistoricoEntradaSaida historicoEntradaSaida) 
	{
		this.historicoEntradaSaida = historicoEntradaSaida;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
