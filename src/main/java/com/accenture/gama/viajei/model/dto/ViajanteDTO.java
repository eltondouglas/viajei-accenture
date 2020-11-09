package com.accenture.gama.viajei.model.dto;

import java.time.LocalDate;

import com.accenture.gama.viajei.model.cadastro.Documento;
import com.accenture.gama.viajei.model.cadastro.Endereco;
import com.accenture.gama.viajei.model.cadastro.Telefone;
import com.accenture.gama.viajei.model.cadastro.Viajante;
import com.accenture.gama.viajei.model.perfil.Role;

public class ViajanteDTO {
	private String nome;
	private String email;
	private String senha;
	private String sexo;
	private Telefone telefone;
	private Documento documento;
	private Endereco endereco;
	private String dataNascimento;
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Viajante toViajante() {
		Viajante cliente = new Viajante();
		cliente.setNome(this.nome);
		cliente.setEmail(this.email);
		cliente.setLogin(this.email.split("@")[0]);
		cliente.setSenha(this.senha);
		cliente.setSexo(this.sexo);
		cliente.setTelefone(this.telefone);
		cliente.setDataNascimento(LocalDate.parse(dataNascimento));
		cliente.setDocumento(this.documento);
		cliente.addRole(new Role("USER"));
		return cliente;
	}

}
