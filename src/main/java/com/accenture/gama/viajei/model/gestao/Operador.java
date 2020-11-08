package com.accenture.gama.viajei.model.gestao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.accenture.gama.viajei.model.perfil.Usuario;


@Entity
@Table(name = "tab_operador")
public class Operador extends Usuario {
	
	@Column(length = 60)
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
