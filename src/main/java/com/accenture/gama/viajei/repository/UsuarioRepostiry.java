package com.accenture.gama.viajei.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.gama.viajei.model.perfil.Usuario;


public interface UsuarioRepostiry extends JpaRepository<Usuario, Integer> {
	Usuario findByLogin(String login);
	boolean existsByLogin(String login);
}
