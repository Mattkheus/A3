package com.estoque.bebidas.apirest.bebidaAlcolica;
import java.io.Serializable;


import javax.persistence.*;

import com.estoque.bebidas.apirest.models.HistoricoEntradaSaida;
import com.estoque.bebidas.apirest.models.SecaoBebida;

@Entity
@Table(name="TB_BEBIDA")

public class BebidaAlcolica implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idBebidaAlcolica;
	private String cerveja;
	private String vinho;
	private String whisky;

	@OneToOne(cascade=CascadeType.ALL)
	private HistoricoEntradaSaida historicoEntradaSaida;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private SecaoBebida secao;

	
	public long getIdBebidaAlcolica() {
		return idBebidaAlcolica;
	}

	public void setIdBebidaAlcolica(long idBebidaAlcolica) {
		this.idBebidaAlcolica = idBebidaAlcolica;
	}
	public String getCerveja() {
		return cerveja;
	}

	public void setCerveja(String cerveja) {
		this.cerveja = cerveja;
	}

	public String getVinho() {
		return vinho;
	}

	public void setVinho(String vinho) {
		this.vinho = vinho;
	}
	public String getWhisky() {
		return whisky;
	}

	public void setWhisky(String whisky) {
		this.whisky = whisky;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
}

}