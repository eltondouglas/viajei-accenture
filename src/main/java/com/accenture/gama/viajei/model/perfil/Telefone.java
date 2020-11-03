package com.accenture.gama.viajei.model.perfil;

import javax.persistence.Column;

public class Telefone {
	
	@Column(length = 3)
	private Integer ddd;
	@Column(length = 12)
	private Long numero;
	@Column(length = 50)
	private String nomeContato;

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

}
